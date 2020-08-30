package javabase.javacoreI;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author luoGuanzhong @Date 2020-08-24 12:03
 *
 * <p>反射
 *
 * <p>反射机制可以用来：
 *
 * <p>在运行时分析类的能力。
 *
 * <p>?在运行时查看对象， 例如， 编写一个 toString 方法供所有类使用。
 *
 * <p>?实现通用的数组操作代码。
 *
 * <p>?利用 Method 对象，这个对象很像中的函数指针。
 */
public class ReflectionAPIs {
	
	private String name;
	public int age;
	
	public ReflectionAPIs() {
	
	}
	
	public static void main(String[] args) throws Exception {
		
		ReflectionAPIs r = new ReflectionAPIs();
		// 获取类的3种方法
		{
			/* 一个 Class 对象将表示一个特定类的属性。最常用的 Class 方法是 getName()。 这个方法将返回类的名字
			 * */
			
			System.out.println(r.getClass()); // print class javabase.javacoreI.ReflectionAPIs
			System.out.println(r.getClass().getName()); // print javabase.javacoreI.ReflectionAPIs
			
			/*
			 * 调用静态方法 forName 获得类名对应的 Class 对象
			 * String dassName = "java.util .Random";
			 * Class cl = r.forName(dassName);
			 * */
			
			/*
			 * 如果 T 是任意的 Java 类型（或void 关键字), T.class 将代表匹配的类对象。
			 * */
			Class cl = Random.class; // if you import java.util
			System.out.println(cl); // print class java.util.Random
			Class cl2 = int.class;
			System.out.println(cl2); // print int
			Class cl3 = Double[].class;
			System.out.println(cl3); // print class [Ljava.lang.Double;
		}
		
		/*
		 * 可以利用 == 运算符实现两个类对象比较的操作
		 * */
		ReflectionAPIs r1 = new ReflectionAPIs();
		System.out.println((r.getClass() == r1.getClass())); // print true
		
		/*
		 * newInstance()
		 * 可以用来动态地创建一个类的实
		 * */
		
		Object r2 = r.getClass().newInstance();
		System.out.println(r2.getClass().getName()); // print javabase.javacoreI.ReflectionAPIs
		
		/*
		 * Field[] getFields()
		 * getFields 方法将返回一个包含 Field 对象的数组， 这些对象记录了这个类或其超类的公有域
		 * Filed[] getDeclaredFields()
		 * getDeclaredField 方法也将返回包含 Field 对象的数组， 这些对象记录了这个类的全部域
		 * 如果类中没有域， 或者 Class 对象描述的是基本类型或数组类型， 这些方法将返回一个长度为 0 的数组。
		 * */
		System.out.println(
				Arrays.toString(
						r.getClass().getFields())); // print [public int javabase.javacoreI.ReflectionAPIs.age]
		System.out.println(
				Arrays.toString(
						r.getClass()
								.getDeclaredFields())); // print [private java.lang.String
		// javabase.javacoreI.ReflectionAPIs.name, public int
		// javabase.javacoreI.ReflectionAPIs.age]
		
		/*
		 * Method[] getMethods()
		 * Method[] getDeclareMethods()
		 * 返回包含 Method 对象的数组
		 * getMethods 将返回所有的公有方法， 包括从超类继承来的公有方法；
		 * getDeclaredMethods 返回这个类或接口的全部方法， 但不包括由超类继承了的方法。
		 * */
		System.out.println(Arrays.toString(r.getClass().getMethods()));
		System.out.println(Arrays.toString(r.getClass().getDeclaredMethods()));
		System.out.println("=========================");
		/*
		 * Constructor[] getConstructors();
		 * Constructor[] getDeclaredConstructors();
		 * 返回包含 Constructor 对象的数组， 其中包含了 Class 对象所描述的类的所有公有构造器（getConstructors)
		 * 或所有构造器（getDeclaredConstructors。)
		 * */
		System.out.println(Arrays.toString(
				r.getClass().getConstructors())); // print [public javabase.javacoreI.ReflectionAPIs()]
		
		/*
		 * Class getDeclaringClass()
		 * 返冋一个用于描述类中定义的构造器、 方法或域的 Class 对象
		 * */
		System.out.println(r.getClass().getDeclaringClass()); // print null
		
		/*
		 * Class[] getExceptionTypes ()
		 * 返回一个用于描述方法抛出的异常类型的 Class 对象数组
		 * int getModifiers( )
		 * 返回一个用于描述构造器、 方法或域的修饰符的整型数值
		 * String getName( )
		 * 返冋一个用于描述构造器、 方法或域名的字符串
		 * ...jdk源码中查看
		 * */
		
	}
}
