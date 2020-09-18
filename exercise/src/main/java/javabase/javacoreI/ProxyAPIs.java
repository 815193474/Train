package javabase.javacoreI;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * @Author luoGuanzhong @Date 2020-08-26 16:35
 *
 * <p>动态代理具有以下特点
 *
 * <p>指定接口所需要的全部方法
 *
 * <p>Object 类中的全部方法， 例如， toString、 equals 等
 *
 * <p>首先要有一个实现了invocationHandler接口的处理器 接着创建代理对象，需要使用 Proxy 类的 newProxyInstance 方法，
 * 其次将代理对象传递给要执行代理的方法
 */
public class ProxyAPIs {
	/*
	 * 代理并不能在运行时定义这些方法的新代码。而是要提供一个调用处理器 invocationhandler
	 * 调用处理器是实现了 InvocationHandler 接口的类对象
	 * 在这个接口中只有一个方法：
	 * Object invoke(Object proxy, Method method, Object[] args)
	 * */
	
	/*
	 * 无论何时调用代理对象的方法，调用处理器的 invoke 方法都会被调用，并向其传递Method 对象和原始的调用参数。
	 * 调用处理器必须给出处理调用的方式。
	 * */
	
	/*
	 * 创建一个代理对象， 需要使用 Proxy 类的 newProxyInstance 方法,他有三个参数
	 * 1.一个类加栽器（class loader)
	 * 2.一个 Class 对象数组， 每个元素都是需要实现的接口
	 * 3.一个调用处理器
	 * */
	public static void main(String[] args) {
		//
		Object[] objects = new Object[1000];
		for (int i = 0; i < objects.length; i++) {
			//
			Integer value = i + 1;
			InvocationHandler handler =
					new TraceHandler(value); // 将实现了InvocationHandler接口的对象赋值给InvocationHandler类型的变量；
			/*
			 * 创建代理对象，类加载器传入为空，为默认加载器，需要实现的接口类是Comparable
			 * handler  是实现了InvocationHandler 接口的调用处理器
			 *
			 * */
			// CLassLoader loader:类的加载器
			// Class<?> interfaces:得到全部的接口
			// InvocationHandler h:得到InvocationHandler接口的子类的实例
			Object proxy = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, handler);
			objects[i] = proxy;
		}
		Integer key = new Random().nextInt(objects.length) + 1;
		int result = Arrays.binarySearch(objects, key);
		if (result > 0) {
			System.out.println(objects[result]);
		}
	}
	
	static class TraceHandler implements InvocationHandler {
		
		private Object target;
		
		public TraceHandler(Object t) {
			target = t;
		}
		
		// Object proxy:被代理的对象
		// Method method:要调用的方法
		// Object[] args:方法调用时所需要参数
		public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
			
			System.out.println(target);
			System.out.println("." + m.getName() + "(");
			if (args != null) {
				for (int i = 0; i < args.length; i++) {
					//
					System.out.println(args[i]);
					if (i < args.length - 1) {
						System.out.println(" , ");
					}
				}
			}
			System.out.println(")");
			return m.invoke(target, args);
		}
	}
	/*
	 * 静态代理
	 * 静态代理模式在不改变目标对象的前提下，实现了对目标对象的功能扩展。
	 * 不足：静态代理实现了目标对象的所有方法，一旦目标接口增加方法，代理对象和目标对象都要进行相应的修改，增加维护成本。
	 * 静态代理实现原理是新增一个接口的(新建一个类，其中代码主要是如日志等其他操作加接口方法调用)代理类，用户在访问时调用接口的代理类赋值给接口变量
	 * */
	
	/*
	 * 动态代理
	 * 为解决静态代理对象必须实现接口的所有方法的问题，Java给出了动态代理
	 * 1.Proxy对象不需要implements接口；
	 * 2.Proxy对象的生成利用JDK的Api，在JVM内存中动态的构建Proxy对象。
	 * 需要使用java.lang.reflect.Proxy类的方法
	 * */
	
	/*
	 * JDK动态代理要求target对象是一个接口的实现对象。
	 * 假如target对象只是一个单独的对象，并没有实现任何接口，这时候就会用到Cglib代理(Code Generation Library)，
	 * 即通过构建一个子类对象，从而实现对target对象的代理，
	 * 因此目标对象不能是final类(报错)，且目标对象的方法不能是final或static（不执行代理功能）
	 * 子类的父类应该是本应该实现接口而没有实现接口的类
	 *
	 * */
}
