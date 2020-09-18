package javabase.javacoreI;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * @Author luoGuanzhong @Date 2020-08-26 16:35
 *
 * <p>��̬������������ص�
 *
 * <p>ָ���ӿ�����Ҫ��ȫ������
 *
 * <p>Object ���е�ȫ�������� ���磬 toString�� equals ��
 *
 * <p>����Ҫ��һ��ʵ����invocationHandler�ӿڵĴ����� ���Ŵ������������Ҫʹ�� Proxy ��� newProxyInstance ������
 * ��ν�������󴫵ݸ�Ҫִ�д���ķ���
 */
public class ProxyAPIs {
	/*
	 * ��������������ʱ������Щ�������´��롣����Ҫ�ṩһ�����ô����� invocationhandler
	 * ���ô�������ʵ���� InvocationHandler �ӿڵ������
	 * ������ӿ���ֻ��һ��������
	 * Object invoke(Object proxy, Method method, Object[] args)
	 * */
	
	/*
	 * ���ۺ�ʱ���ô������ķ��������ô������� invoke �������ᱻ���ã������䴫��Method �����ԭʼ�ĵ��ò�����
	 * ���ô������������������õķ�ʽ��
	 * */
	
	/*
	 * ����һ��������� ��Ҫʹ�� Proxy ��� newProxyInstance ����,������������
	 * 1.һ�����������class loader)
	 * 2.һ�� Class �������飬 ÿ��Ԫ�ض�����Ҫʵ�ֵĽӿ�
	 * 3.һ�����ô�����
	 * */
	public static void main(String[] args) {
		//
		Object[] objects = new Object[1000];
		for (int i = 0; i < objects.length; i++) {
			//
			Integer value = i + 1;
			InvocationHandler handler =
					new TraceHandler(value); // ��ʵ����InvocationHandler�ӿڵĶ���ֵ��InvocationHandler���͵ı�����
			/*
			 * ����������������������Ϊ�գ�ΪĬ�ϼ���������Ҫʵ�ֵĽӿ�����Comparable
			 * handler  ��ʵ����InvocationHandler �ӿڵĵ��ô�����
			 *
			 * */
			// CLassLoader loader:��ļ�����
			// Class<?> interfaces:�õ�ȫ���Ľӿ�
			// InvocationHandler h:�õ�InvocationHandler�ӿڵ������ʵ��
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
		
		// Object proxy:������Ķ���
		// Method method:Ҫ���õķ���
		// Object[] args:��������ʱ����Ҫ����
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
	 * ��̬����
	 * ��̬����ģʽ�ڲ��ı�Ŀ������ǰ���£�ʵ���˶�Ŀ�����Ĺ�����չ��
	 * ���㣺��̬����ʵ����Ŀ���������з�����һ��Ŀ��ӿ����ӷ�������������Ŀ�����Ҫ������Ӧ���޸ģ�����ά���ɱ���
	 * ��̬����ʵ��ԭ��������һ���ӿڵ�(�½�һ���࣬���д�����Ҫ������־�����������ӽӿڷ�������)�����࣬�û��ڷ���ʱ���ýӿڵĴ����ำֵ���ӿڱ���
	 * */
	
	/*
	 * ��̬����
	 * Ϊ�����̬����������ʵ�ֽӿڵ����з��������⣬Java�����˶�̬����
	 * 1.Proxy������Ҫimplements�ӿڣ�
	 * 2.Proxy�������������JDK��Api����JVM�ڴ��ж�̬�Ĺ���Proxy����
	 * ��Ҫʹ��java.lang.reflect.Proxy��ķ���
	 * */
	
	/*
	 * JDK��̬����Ҫ��target������һ���ӿڵ�ʵ�ֶ���
	 * ����target����ֻ��һ�������Ķ��󣬲�û��ʵ���κνӿڣ���ʱ��ͻ��õ�Cglib����(Code Generation Library)��
	 * ��ͨ������һ��������󣬴Ӷ�ʵ�ֶ�target����Ĵ���
	 * ���Ŀ���������final��(����)����Ŀ�����ķ���������final��static����ִ�д����ܣ�
	 * ����ĸ���Ӧ���Ǳ�Ӧ��ʵ�ֽӿڶ�û��ʵ�ֽӿڵ���
	 *
	 * */
}
