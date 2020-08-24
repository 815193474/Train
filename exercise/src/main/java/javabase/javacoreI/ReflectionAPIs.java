package javabase.javacoreI;

import java.util.Random;

/**
 * @Author luoGuanzhong @Date 2020-08-24 12:03
 *
 * <p>����
 *
 * <p>������ƿ���������
 *
 * <p>?������ʱ�������������
 *
 * <p>?������ʱ�鿴���� ���磬 ��дһ�� toString ������������ʹ�á�
 *
 * <p>?ʵ��ͨ�õ�����������롣
 *
 * <p>?���� Method ���������������еĺ���ָ�롣
 */
public class ReflectionAPIs {
	
	public static void main(String[] args) throws Exception {
		/* һ�� Class ���󽫱�ʾһ���ض�������ԡ���õ� Class ������ getName()�� ��������������������
		 * */
		ReflectionAPIs r = new ReflectionAPIs();
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
		System.out.println(r2.getClass().getName());  // print javabase.javacoreI.ReflectionAPIs
	}
}
