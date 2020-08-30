package javabase.javacoreI;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * @Author luoGuanzhong
 * @Date 2020-08-27 20:27
 */
public class ProxyTest {
	
	
	public static void main(String[] args) {
		//
		
		//
		Test test = new Test("s" + new Random().nextInt(1000));
		Object proxy = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, test);
		System.out.println(proxy);
	}
	
	static class Test implements InvocationHandler {
		
		private String object;
		
		Test(String o) {
			object = o;
		}
		
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("���Ǵ����࣬�ҿ����Լ��ڲ�����Զ��������ֻ��Ҫ�����Ҽ��ɣ��ҵķ�����Ϊ" + method.getName());
			System.out.println(method);
			System.out.println(args);
			return method.invoke(object, args);
		}
	}
}
