package javabase.javacoreI;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @Author luoGuanzhong @Date 2020-08-21 16:04
 *
 * <p>localDate 类的使用
 */
public class LocalDateAPIs {
	
	public static void main(String[] args) {
		
		/* 获取当前时间 */
		System.out.println(LocalDate.now()); //  print 当前日期 如：2020-08-21
		
		/* 可以提供年、 月和日来构造对应一个特定日期的对象 */
		System.out.println(LocalDate.of(2020, 05, 12)); // print 2020-05-12
		
		/* 将构造的对象保存在对象变量中 */
		LocalDate newDate = LocalDate.of(2020, 5, 12);
		System.out.println(newDate); // print 2020-05-12
		
		/* 通过实例的get*方法获取年月日 */
		System.out.println(newDate.getYear()); // print 2020
		System.out.println(newDate.getMonthValue()); // print 5
		System.out.println(newDate.getMonth()); // print MAY
		System.out.println(newDate.getDayOfMonth()); // print 12
		
		/* plusDays(int number) 方法会返回一个在当前时间基础上往后推 number 天之后的日期
		 * minusDays(int number) 方法会返回一个在当前时间基础上往前推 number 天之前的日期
		 * */
		System.out.println(newDate.plusDays(1000)); // print 2023-02-06
		
		/* DayOfWeek getDayOfWeek()
		 * 得到当前日期是星期几， 作为 DayOfWeek 类的一个实例返回。 调用 getValue 来得到1 ~ 7 之间的一个数， 表示这是星期几， 1 表示星期一， 7 表示星期日
		 * */
		DayOfWeek week = newDate.getDayOfWeek();
		System.out.println(week); // print TUESDAY
		System.out.println(week.getValue()); // print 2
	}
}
