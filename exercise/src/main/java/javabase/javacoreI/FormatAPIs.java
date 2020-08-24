package javabase.javacoreI;

import java.text.NumberFormat;

/**
 * @Author luoGuanzhong @Date 2020-08-22 09:39
 *
 * <p>NumberFormat ��
 */
public class FormatAPIs {
	
	public static void main(String[] args) {
		
		/* NumberFormat �ഴ������ ʹ�þ�̬��������
		 * getCurrencyInstance() // ��ʽ��Ϊ���Ҹ�ʽ
		 * getPercentInstance() // ��ʽ��Ϊ�ٷ���
		 * */
		NumberFormat currentFormat = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		double x = 0.1;
		System.out.println(currentFormat.format(x)); // print ��0.10
		System.out.println(percentFormat.format(x)); // print 10%
	}
}
