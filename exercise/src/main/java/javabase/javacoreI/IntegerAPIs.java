package javabase.javacoreI;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * @Author luoGuanzhong @Date 2020-08-23 20:43
 *
 * <p>Integer ��ʹ��
 */
public class IntegerAPIs {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
		
		/*
		 * int intValue()
		 * �� int ����ʽ���� Integer �����ֵ���� Number ���и����� intValue������
		 */
		System.out.println(arrayList.get(2)); // print 2
		System.out.println(arrayList.get(2).intValue()); // print 2
		
		/*
		 * static String toString(int i)
		 * ��һ���� String �������ʽ���ظ�����ֵ i ��ʮ���Ʊ�ʾ
		 * */
		System.out.println(Integer.toString(1)); // print 1 ��ʱ1 ���ַ���
		
		/*
		 * static String toString(int i ,int radix )
		 * ������ֵ i �Ļ��ڸ��� radix �������Ƶı�ʾ
		 * */
		System.out.println(Integer.toString(2, 2)); // print 10 ��Ϊ��2������ 10 ��ʾ 2
		
		/*
		 * static int parseInt(String s)
		 * static int parseInt(String s,int radix)
		 * �����ַ��� s ��ʾ��������ֵ�� �����ַ�����ʾ����ʮ���Ƶ���������һ�ַ���)������ radix �������Ƶ��������ڶ��ַ��� ��)
		 * */
		System.out.println(Integer.parseInt("2")); // print 2 ��ΪĬ����10����
		System.out.println(Integer.parseInt("0", 2)); // print 0 ֻ��ִ�� [2-36] ����
		
		/*
		 * static Integer valueOf(String s)
		 * Static Integer valueOf(String s, int radix)
		 * ������ s ��ʾ��������ֵ���г�ʼ�����һ���� Integer ����
		 * �����ַ�����ʾ����ʮ���Ƶ���������һ�ַ�����) ������ radix �������Ƶ��������ڶ��ַ���)��
		 * */
		System.out.println(Integer.valueOf(1)); // print 1
		System.out.println(Integer.valueOf("2")); // print 2
		System.out.println(Integer.valueOf("0", 2)); // print 0
		
		/*
		 * NumberFormat
		 * Number parse(String s)
		 * ��������ֵ����������� String ��ʾ��һ����ֵ��
		 * */
		NumberFormat numberFormat = NumberFormat.getNumberInstance();
		numberFormat.setMinimumIntegerDigits(5);
		System.out.println(numberFormat.format(4)); // print 00,004
		
		/*
		 * DecimalFormat
		 * �̳���NumberFormat
		 * */
		DecimalFormat format = new DecimalFormat("000000");
		System.out.println(format.format(6)); // print 000006
	}
}
