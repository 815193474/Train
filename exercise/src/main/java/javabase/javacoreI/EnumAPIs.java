package javabase.javacoreI;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author luoGuanzhong @Date 2020-08-24 10:31
 *
 * <p>enum ö����
 */
public enum EnumAPIs {
	/*
	 * �Ƚ�����ö�����͵�ֵʱ�� ��Զ����Ҫ���� equals, ��ֱ��ʹ�á�= =�� �Ϳ�����
	 * */
	SMALL("S"),
	MEDIUM("M"),
	LARGE("L"),
	EXTRA_LARGE("XL");
	
	private String arg; // ��Ӧ����� S M L XL
	
	private EnumAPIs(String arg) {
		this.arg = arg;
	}
	
	private String getArg() {
		return arg;
	}
	
	public static void main(String[] args) {
		//
		/*
		 * toString �����ܷ���ö�ٳ�����
		 * */
		System.out.println(SMALL.toString()); // print SMALL
		
		/*
		 * static Enum valueOf(Class enumClass , String name )
		 * ����ָ�����֡��������ö�ٳ���
		 * */
		EnumAPIs s = Enum.valueOf(EnumAPIs.class, "SMALL"); // print SMALL ��s ����Ϊ EnumAPIs.SMALL
		
		/*
		 * ÿ��ö�����Ͷ���һ����̬�� values ������ ��������һ������ȫ��ö��ֵ�����顣 ���磬���µ���
		 * */
		EnumAPIs[] enumAPIs = EnumAPIs.values();
		System.out.println(
				Arrays.toString(enumAPIs)); // print [SMALL, MEDIUM, LARGE, EXTRA_LARGE] ����ÿ������������
		
		/*
		 * int compareTo(E other)
		 * ���ö�ٳ��������� Other ֮ǰ�� �򷵻�һ����ֵ����� this=other���򷵻� 0;
		 * ���򣬷�����ֵ��ö�ٳ����ĳ��ִ����� enum �����и���
		 * */
		System.out.println(SMALL.compareTo(LARGE)); // print -2
		System.out.println(LARGE.compareTo(SMALL)); // print 2
		System.out.println(LARGE.compareTo(LARGE)); // print 0
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter size��SMALL,MEDIUM,LARGE,EXTRA_LARGE");
		EnumAPIs size = Enum.valueOf(EnumAPIs.class, scanner.next().toUpperCase());
		System.out.println("your size is " + size);
		System.out.println("arg :" + size.getArg());
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		if (size == EnumAPIs.EXTRA_LARGE) {
			System.out.println("you need to pay extra " + numberFormat.format(3));
		}
		
	}
}
