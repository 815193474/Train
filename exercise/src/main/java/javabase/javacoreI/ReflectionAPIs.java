package javabase.javacoreI;

import java.util.Random;

/**
 * @Author luoGuanzhong @Date 2020-08-24 12:03
 *
 * <p>反射
 *
 * <p>反射机制可以用来：
 *
 * <p>?在运行时分析类的能力。
 *
 * <p>?在运行时查看对象， 例如， 编写一个 toString 方法供所有类使用。
 *
 * <p>?实现通用的数组操作代码。
 *
 * <p>?利用 Method 对象，这个对象很像中的函数指针。
 */
public class ReflectionAPIs {
	
	public static void main(String[] args) throws Exception {
		/* 一个 Class 对象将表示一个特定类的属性。最常用的 Class 方法是 getName()。 这个方法将返回类的名字
		 * */
		ReflectionAPIs r = new ReflectionAPIs();
		System.out.println(r.getClass()); // print class javabase.javacoreI.ReflectionAPIs
		System.out.println(r.getClass().getName()); // print javabase.javacoreI.ReflectionAPIs
		
		/*
		 * 调用静态方法 forName 获得类名对应的 Class 对象
		 * String dassName = "java.util .Random";
		 * Class cl = r.forName(dassName);
		 * */
		
		/*
		 * 如果 T 是任意的 Java 类型（或void 关键字), T.class 将代表匹配的类对象。
		 * */
		Class cl = Random.class; // if you import java.util
		System.out.println(cl); // print class java.util.Random
		Class cl2 = int.class;
		System.out.println(cl2); // print int
		Class cl3 = Double[].class;
		System.out.println(cl3); // print class [Ljava.lang.Double;
		
		/*
		 * 可以利用 == 运算符实现两个类对象比较的操作
		 * */
		ReflectionAPIs r1 = new ReflectionAPIs();
		System.out.println((r.getClass() == r1.getClass())); // print true
		
		/*
		 * newInstance()
		 * 可以用来动态地创建一个类的实
		 * */
		
		Object r2 = r.getClass().newInstance();
		System.out.println(r2.getClass().getName());  // print javabase.javacoreI.ReflectionAPIs
	}
}
