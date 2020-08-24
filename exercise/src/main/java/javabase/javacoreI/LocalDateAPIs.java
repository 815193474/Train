package javabase.javacoreI;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @Author luoGuanzhong @Date 2020-08-21 16:04
 *
 * <p>localDate ���ʹ��
 */
public class LocalDateAPIs {
	
	public static void main(String[] args) {
		
		/* ��ȡ��ǰʱ�� */
		System.out.println(LocalDate.now()); //  print ��ǰ���� �磺2020-08-21
		
		/* �����ṩ�ꡢ �º����������Ӧһ���ض����ڵĶ��� */
		System.out.println(LocalDate.of(2020, 05, 12)); // print 2020-05-12
		
		/* ������Ķ��󱣴��ڶ�������� */
		LocalDate newDate = LocalDate.of(2020, 5, 12);
		System.out.println(newDate); // print 2020-05-12
		
		/* ͨ��ʵ����get*������ȡ������ */
		System.out.println(newDate.getYear()); // print 2020
		System.out.println(newDate.getMonthValue()); // print 5
		System.out.println(newDate.getMonth()); // print MAY
		System.out.println(newDate.getDayOfMonth()); // print 12
		
		/* plusDays(int number) �����᷵��һ���ڵ�ǰʱ������������� number ��֮�������
		 * minusDays(int number) �����᷵��һ���ڵ�ǰʱ���������ǰ�� number ��֮ǰ������
		 * */
		System.out.println(newDate.plusDays(1000)); // print 2023-02-06
		
		/* DayOfWeek getDayOfWeek()
		 * �õ���ǰ���������ڼ��� ��Ϊ DayOfWeek ���һ��ʵ�����ء� ���� getValue ���õ�1 ~ 7 ֮���һ������ ��ʾ�������ڼ��� 1 ��ʾ����һ�� 7 ��ʾ������
		 * */
		DayOfWeek week = newDate.getDayOfWeek();
		System.out.println(week); // print TUESDAY
		System.out.println(week.getValue()); // print 2
	}
}
