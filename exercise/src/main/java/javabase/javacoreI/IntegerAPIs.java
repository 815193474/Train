package javabase.javacoreI;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * @Author luoGuanzhong @Date 2020-08-23 20:43
 *
 * <p>Integer 的使用
 */
public class IntegerAPIs {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
		
		/*
		 * int intValue()
		 * 以 int 的形式返回 Integer 对象的值（在 Number 类中覆盖了 intValue方法）
		 */
		System.out.println(arrayList.get(2)); // print 2
		System.out.println(arrayList.get(2).intValue()); // print 2
		
		/*
		 * static String toString(int i)
		 * 以一个新 String 对象的形式返回给定数值 i 的十进制表示
		 * */
		System.out.println(Integer.toString(1)); // print 1 此时1 是字符串
		
		/*
		 * static String toString(int i ,int radix )
		 * 返回数值 i 的基于给定 radix 参数进制的表示
		 * */
		System.out.println(Integer.toString(2, 2)); // print 10 因为在2进制中 10 表示 2
		
		/*
		 * static int parseInt(String s)
		 * static int parseInt(String s,int radix)
		 * 返回字符串 s 表示的整型数值， 给定字符串表示的是十进制的整数（第一种方法)或者是 radix 参数进制的整数（第二种方法 。)
		 * */
		System.out.println(Integer.parseInt("2")); // print 2 因为默认是10进制
		System.out.println(Integer.parseInt("0", 2)); // print 0 只能执行 [2-36] 进制
		
		/*
		 * static Integer valueOf(String s)
		 * Static Integer valueOf(String s, int radix)
		 * 返回用 s 表示的整型数值进行初始化后的一个新 Integer 对象，
		 * 给定字符串表示的是十进制的整数（第一种方法，) 或者是 radix 参数进制的整数（第二种方法)。
		 * */
		System.out.println(Integer.valueOf(1)); // print 1
		System.out.println(Integer.valueOf("2")); // print 2
		System.out.println(Integer.valueOf("0", 2)); // print 0
		
		/*
		 * NumberFormat
		 * Number parse(String s)
		 * 返回数字值，假设给定的 String 表示了一个数值。
		 * */
		NumberFormat numberFormat = NumberFormat.getNumberInstance();
		numberFormat.setMinimumIntegerDigits(5);
		System.out.println(numberFormat.format(4)); // print 00,004
		
		/*
		 * DecimalFormat
		 * 继承自NumberFormat
		 * */
		DecimalFormat format = new DecimalFormat("000000");
		System.out.println(format.format(6)); // print 000006
	}
}
