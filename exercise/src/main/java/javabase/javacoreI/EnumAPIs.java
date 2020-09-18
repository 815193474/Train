package javabase.javacoreI;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author luoGuanzhong @Date 2020-08-24 10:31
 *
 * <p>enum 枚举类
 */
public enum EnumAPIs {
	/*
	 * 比较两个枚举类型的值时， 永远不需要调用 equals, 而直接使用“= =” 就可以了
	 * */
	SMALL("S"),
	MEDIUM("M"),
	LARGE("L"),
	EXTRA_LARGE("XL");
	
	private String arg; // 对应上面的 S M L XL
	
	private EnumAPIs(String arg) {
		this.arg = arg;
	}
	
	private String getArg() {
		return arg;
	}
	
	public static void main(String[] args) {
		//
		/*
		 * toString 方法能返回枚举常量名
		 * */
		System.out.println(SMALL.toString()); // print SMALL
		
		/*
		 * static Enum valueOf(Class enumClass , String name )
		 * 返回指定名字、给定类的枚举常量
		 * */
		EnumAPIs s = Enum.valueOf(EnumAPIs.class, "SMALL"); // print SMALL 将s 设置为 EnumAPIs.SMALL
		
		/*
		 * 每个枚举类型都有一个静态的 values 方法， 它将返回一个包含全部枚举值的数组。 例如，如下调用
		 * */
		EnumAPIs[] enumAPIs = EnumAPIs.values();
		System.out.println(
				Arrays.toString(enumAPIs)); // print [SMALL, MEDIUM, LARGE, EXTRA_LARGE] 其中每个都是子数组
		
		/*
		 * int compareTo(E other)
		 * 如果枚举常量出现在 Other 之前， 则返回一个负值；如果 this=other，则返回 0;
		 * 否则，返回正值。枚举常量的出现次序在 enum 声明中给出
		 * */
		System.out.println(SMALL.compareTo(LARGE)); // print -2
		System.out.println(LARGE.compareTo(SMALL)); // print 2
		System.out.println(LARGE.compareTo(LARGE)); // print 0
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter size：SMALL,MEDIUM,LARGE,EXTRA_LARGE");
		EnumAPIs size = Enum.valueOf(EnumAPIs.class, scanner.next().toUpperCase());
		System.out.println("your size is " + size);
		System.out.println("arg :" + size.getArg());
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		if (size == EnumAPIs.EXTRA_LARGE) {
			System.out.println("you need to pay extra " + numberFormat.format(3));
		}
		
	}
}
