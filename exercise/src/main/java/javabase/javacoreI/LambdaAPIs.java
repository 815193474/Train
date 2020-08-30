package javabase.javacoreI;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author luoGuanzhong @Date 2020-08-26 13:56
 *
 * <p>lambda ���ʽѧϰ
 *
 * <p>lambda ���ʽ�в���ı�������ʵ���������ձ���
 *
 * <p>lambda ���ʽ��������һ���ֲ�����ͬ���Ĳ�����ֲ������ǲ��Ϸ���
 *
 * <p>!!! Ҫ������� lambda ���ʽ�� ��Ҫѡ��ż��������Ҫ�ṩ��һ������ʽ�ӿ� ��õ���Runnable �ӿ� ʹ��run()��������
 */
public class LambdaAPIs implements Comparator<String> {
	
	public static void main(String[] args) {
		LambdaAPIs apIs = new LambdaAPIs();
		String[] strings = {"hello", "hai", "world"};
		Arrays.sort(strings, new LambdaAPIs()); // �����Զ���Ƚ�����ʵ���ַ����ӳ���������
		System.out.println(Arrays.toString(strings)); // print [hello, world, hai]
		
		Runnable runnable =
				() -> {
					for (int i = 0; i < 10; i++) {
						System.out.println(i);
					}
				};
		runnable.run();
		
		Comparator<String> comparator =
				(String first, String second) -> first.length() - second.length(); // lambda
		Arrays.sort(strings, comparator); // ���������lambda ���ʽ��ʾ�ıȽ�����ʵ���ַ����ӳ����ɶ̵��� ����
		System.out.println(Arrays.toString(strings)); // print [hai, hello, world]
	}
	
	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o2.length(), o1.length());
	}
}
