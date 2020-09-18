package javabase.javacoreI;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author luoGuanzhong @Date 2020-09-03 21:48
 *
 * <p>这个类提供线程局部变量。这些变量不同于正常线程，每一个线程访问一个（通过其 get或 set法）有自己独立的变量，初始化复制
 *
 * ThreadLocal 通过代码同步的方法实现了对多线程问题的解决，每个线程都有变量的拷贝，所以线程之间不会影响
 *
 * 它不是线程，而是线程变量，通常被定义为静态变量，
 *
 * 这种设计是‘空间换时间’，synchronized顺序执行是‘时间换取空间’
 */
public class ThreadLocalAPIs {
	/*
	 * ?
	 *	T get()
	 *	得到这个线程的当前值。如果是首次调用 get, 会调用 initialize 来得到这个值。
	 *	?protected initialize()
	 *	应覆盖这个方法来提供一个初始值。默认情况下，这个方法返回 mill。
	 *	?void set(T t)
	 *	为这个线程设置一个新值。
	 *	?void remove( )
	 *	删除对应这个线程的值。
	 *	?static <S> ThreadLocal <S> withInitial(Supplier< ? extends S>
	 *	supplier) 8
	 *	创建一个线程局部变量， 其初始值通过调用给定的 supplier 生成。
	 *
	 * */
	
	public static void main(String[] args) {
		/*
		 * 案例 对SimpleDateFormat类的使用
		 * */
		ThreadLocal<SimpleDateFormat> local = ThreadLocal
				.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));
		System.out.println(local.get().format(new Date()));
		System.out.println(local.get().format(new Date()));
		
		/*
		 *
		 * 案例 随机数 Random的使用 Java SE 7 提供了一个便利类
		 * ThreadLocalRandom
		 * */
		int random = ThreadLocalRandom.current().nextInt(10);
		System.out.println(random);
	}
}
