package javabase.javacoreI;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author luoGuanzhong @Date 2020-08-26 13:56
 *
 * <p>lambda 表达式学习
 *
 * <p>lambda 表达式中捕获的变量必须实际上是最终变量
 *
 * <p>lambda 表达式中声明与一个局部变量同名的参数或局部变量是不合法的
 *
 * <p>!!! 要接受这个 lambda 表达式， 需要选择（偶尔可能需要提供）一个函数式接口 最常用的是Runnable 接口 使用run()方法运行
 */
public class LambdaAPIs implements Comparator<String> {
	
	public static void main(String[] args) {
		LambdaAPIs apIs = new LambdaAPIs();
		String[] strings = {"hello", "hai", "world"};
		Arrays.sort(strings, new LambdaAPIs()); // 传入自定义比较器，实现字符串从长倒短排序
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
		Arrays.sort(strings, comparator); // 传入上面的lambda 表达式表示的比较器，实现字符串从长度由短到长 排序
		System.out.println(Arrays.toString(strings)); // print [hai, hello, world]
	}
	
	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o2.length(), o1.length());
	}
}
