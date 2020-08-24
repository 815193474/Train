package javabase.javacoreI;

import java.text.NumberFormat;

/**
 * @Author luoGuanzhong @Date 2020-08-22 09:39
 *
 * <p>NumberFormat 类
 */
public class FormatAPIs {
	
	public static void main(String[] args) {
		
		/* NumberFormat 类创建对象 使用静态工厂方法
		 * getCurrencyInstance() // 格式化为货币格式
		 * getPercentInstance() // 格式化为百分数
		 * */
		NumberFormat currentFormat = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		double x = 0.1;
		System.out.println(currentFormat.format(x)); // print ￥0.10
		System.out.println(percentFormat.format(x)); // print 10%
	}
}
