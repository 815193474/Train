package javabase.javacoreI;

import java.util.Arrays;

/**
 * @Author luoGuanzhong @Date 2020-08-25 14:26
 *
 * <p>Comparator 接口
 *
 * <p>Comparable 接口
 */
public class EmployeeSortAPIs {
	/*
	 * java.lang.Comparable<T>
	 * int compareTo(T other)
	 * 用这个对象与 other 进行比较。如果这个对象小于 other(某一属性值) 则返回负值； 如果相等则返回0；否则返回正值
	 *
	 * */
	
	/*
	 *  java.util.Arrays 1.2
	 *  static void sort( Object[] a )
	 *  使用 mergesort 算法对数组 a 中的元素进行排序。要求数组中的元素必须属于实现了Comparable 接口的类， 并且元素之间必须是可比较的。
	 *  重写compareTo()方法
	 * */
	
	/*
	 *  java.lang.Integer
	 *  static int compare(int x , int y)
	 *  如果 x < y 返回一个负整数；如果 x 和 y 相等，则返回 0; 否则返回一个负整数
	 * */
	
	/*
	 *  java.lang.Double
	 *  static int compare(double x , double y)
	 *  如果 x < y 返回一个负整数；如果 x 和 y 相等，则返回 0; 否则返回一个负整数
	 * */
	
	public static void main(String[] args) {
		//
		Employee[] employees = new Employee[3];
		employees[0] = new Employee("张三", 1);
		employees[1] = new Employee("张四", 3);
		employees[2] = new Employee("张五", 2);
		System.out.println(Arrays.toString(employees));
		Arrays.sort(employees);
		System.out.println(Arrays.toString(employees));
		
		/*
		 * Comparator 接口
		 * Arrays.Sort 方法还有第二个版本， 有一个数组和一个比较器 ( comparator )
		 * 作为参数， 比较器是实现了 Comparator 接口的类的实例
		 *
		 * */
		String[] test = {"hello", "haha", "tianzhen"};
		Arrays.sort(test, new Employee("ss", 11));
		
		System.out.println(Arrays.toString(test)); // print [haha, hello, tianzhen]
	}
}
