package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-21 22:44
 *
 * <p>静态域与静态方法
 */
public class StaticMethodAPIs {
	
	/* 静态域
	 * 如果将域定义为 static, 每个类中只有一个这样的域。而每一个对象对于所有的实例域却都有自己的一份拷贝
	 * 静态方法
	 * 静态方法是一种不能向对象实施操作的方法
	 * 可以认为静态方法没有隐式参数(this对象)
	 * 静态方法可以访问此类的静态域
	 * */
	
	/*
	如果关键字 static 被省略， PI 就变成了类的一个实例域。需要通过类的对象访问 PI，并且每一个类对象都有它自己的一份 PI 拷贝
	 */
	public static final double PI = 3.14159265358979323846; // 定义静态常量
	
	public static void sum(int x) {
		x = x * 3;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		int percent = 15;
		/*
		 * 一个方法不可能修改一个基本数据类型的参数
		 *
		 * */
		sum(percent); // print 45
		System.out.println(percent); // print 15
		
		/*
		 * 1. 一个方法不能修改一个基本数据类型的参数（即数值型或布尔型）
		 * 2. 一个方法可以改变一个对象参数的状态。
		 * 3. 一个方法不能让对象参数引用一个新的对象
		 * java 中对象的调用采用的是按值传递，并不是按引用传递
		 * 交换的是对象的拷贝，并非引用，所以引用还是没变，数据不交换
		 * */
	}
}
