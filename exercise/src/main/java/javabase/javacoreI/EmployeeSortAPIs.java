package javabase.javacoreI;

import java.util.Arrays;

/**
 * @Author luoGuanzhong @Date 2020-08-25 14:26
 *
 * <p>Comparator �ӿ�
 *
 * <p>Comparable �ӿ�
 */
public class EmployeeSortAPIs {
	/*
	 * java.lang.Comparable<T>
	 * int compareTo(T other)
	 * ����������� other ���бȽϡ�����������С�� other(ĳһ����ֵ) �򷵻ظ�ֵ�� �������򷵻�0�����򷵻���ֵ
	 *
	 * */
	
	/*
	 *  java.util.Arrays 1.2
	 *  static void sort( Object[] a )
	 *  ʹ�� mergesort �㷨������ a �е�Ԫ�ؽ�������Ҫ�������е�Ԫ�ر�������ʵ����Comparable �ӿڵ��࣬ ����Ԫ��֮������ǿɱȽϵġ�
	 *  ��дcompareTo()����
	 * */
	
	/*
	 *  java.lang.Integer
	 *  static int compare(int x , int y)
	 *  ��� x < y ����һ������������� x �� y ��ȣ��򷵻� 0; ���򷵻�һ��������
	 * */
	
	/*
	 *  java.lang.Double
	 *  static int compare(double x , double y)
	 *  ��� x < y ����һ������������� x �� y ��ȣ��򷵻� 0; ���򷵻�һ��������
	 * */
	
	public static void main(String[] args) {
		//
		Employee[] employees = new Employee[3];
		employees[0] = new Employee("����", 1);
		employees[1] = new Employee("����", 3);
		employees[2] = new Employee("����", 2);
		System.out.println(Arrays.toString(employees));
		Arrays.sort(employees);
		System.out.println(Arrays.toString(employees));
		
		/*
		 * Comparator �ӿ�
		 * Arrays.Sort �������еڶ����汾�� ��һ�������һ���Ƚ��� ( comparator )
		 * ��Ϊ������ �Ƚ�����ʵ���� Comparator �ӿڵ����ʵ��
		 *
		 * */
		String[] test = {"hello", "haha", "tianzhen"};
		Arrays.sort(test, new Employee("ss", 11));
		
		System.out.println(Arrays.toString(test)); // print [haha, hello, tianzhen]
	}
}
