package javabase.javacoreI;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author luoGuanzhong @Date 2020-08-24 12:03
 *
 * <p>����
 *
 * <p>������ƿ���������
 *
 * <p>������ʱ�������������
 *
 * <p>?������ʱ�鿴���� ���磬 ��дһ�� toString ������������ʹ�á�
 *
 * <p>?ʵ��ͨ�õ�����������롣
 *
 * <p>?���� Method ���������������еĺ���ָ�롣
 */
public class ReflectionAPIs {
	
	private String name;
	public int age;
	
	public ReflectionAPIs() {
	
	}
	
	public static void main(String[] args) throws Exception {
		
		ReflectionAPIs r = new ReflectionAPIs();
		// ��ȡ���3�ַ���
		{
			/* һ�� Class ���󽫱�ʾһ���ض�������ԡ���õ� Class ������ getName()�� ��������������������
			 * */
			
			System.out.println(r.getClass()); // print class javabase.javacoreI.ReflectionAPIs
			System.out.println(r.getClass().getName()); // print javabase.javacoreI.ReflectionAPIs
			
			/*
			 * ���þ�̬���� forName ���������Ӧ�� Class ����
			 * String dassName = "java.util .Random";
			 * Class cl = r.forName(dassName);
			 * */
			
			/*
			 * ��� T ������� Java ���ͣ���void �ؼ���), T.class ������ƥ��������
			 * */
			Class cl = Random.class; // if you import java.util
			System.out.println(cl); // print class java.util.Random
			Class cl2 = int.class;
			System.out.println(cl2); // print int
			Class cl3 = Double[].class;
			System.out.println(cl3); // print class [Ljava.lang.Double;
		}
		
		/*
		 * �������� == �����ʵ�����������ȽϵĲ���
		 * */
		ReflectionAPIs r1 = new ReflectionAPIs();
		System.out.println((r.getClass() == r1.getClass())); // print true
		
		/*
		 * newInstance()
		 * ����������̬�ش���һ�����ʵ
		 * */
		
		Object r2 = r.getClass().newInstance();
		System.out.println(r2.getClass().getName()); // print javabase.javacoreI.ReflectionAPIs
		
		/*
		 * Field[] getFields()
		 * getFields ����������һ������ Field ��������飬 ��Щ�����¼���������䳬��Ĺ�����
		 * Filed[] getDeclaredFields()
		 * getDeclaredField ����Ҳ�����ذ��� Field ��������飬 ��Щ�����¼��������ȫ����
		 * �������û���� ���� Class �����������ǻ������ͻ��������ͣ� ��Щ����������һ������Ϊ 0 �����顣
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
		 * ���ذ��� Method ���������
		 * getMethods ���������еĹ��з����� �����ӳ���̳����Ĺ��з�����
		 * getDeclaredMethods ����������ӿڵ�ȫ�������� ���������ɳ���̳��˵ķ�����
		 * */
		System.out.println(Arrays.toString(r.getClass().getMethods()));
		System.out.println(Arrays.toString(r.getClass().getDeclaredMethods()));
		System.out.println("=========================");
		/*
		 * Constructor[] getConstructors();
		 * Constructor[] getDeclaredConstructors();
		 * ���ذ��� Constructor ��������飬 ���а����� Class ������������������й��й�������getConstructors)
		 * �����й�������getDeclaredConstructors��)
		 * */
		System.out.println(Arrays.toString(
				r.getClass().getConstructors())); // print [public javabase.javacoreI.ReflectionAPIs()]
		
		/*
		 * Class getDeclaringClass()
		 * ����һ�������������ж���Ĺ������� ��������� Class ����
		 * */
		System.out.println(r.getClass().getDeclaringClass()); // print null
		
		/*
		 * Class[] getExceptionTypes ()
		 * ����һ���������������׳����쳣���͵� Class ��������
		 * int getModifiers( )
		 * ����һ������������������ ������������η���������ֵ
		 * String getName( )
		 * ����һ������������������ �������������ַ���
		 * ...jdkԴ���в鿴
		 * */
		
	}
}
