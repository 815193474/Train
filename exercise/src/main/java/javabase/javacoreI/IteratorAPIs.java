package javabase.javacoreI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @Author luoGuanzhong @Date 2020-08-31 11:23
 *
 * <p>Iterator 接口 有以下4个方法
 *
 * <p>E next(); boolean hasNext(); void remove(); default void forEachRemaining(Consumer<? super
 * E>action);
 */
public class IteratorAPIs {
	
	public static void main(String[] args) {
		//
		Collection<String> collection = new ArrayList<String>();
		int i = 10;
		while (i > 0) {
			collection.add("sting" + i);
			i--;
		}
		Iterator<String> iterator = collection.iterator();
		/*
		 * 通过反复调用 next 方法，可以逐个访问集合中的每个元素。但是，如果到达了集合的末
		 * 尾，next 方法将抛出一个 NoSuchElementException。 因此，需要在调用 next 之前调用 hasNext
		 * 方法。如果迭代器对象还有多个供访问的元素， 这个方法就返回 true。如果想要査看集合中的
		 * 所有元素，就请求一个迭代器，并在 hasNext 返回 true 时反复地调用 next 方法
		 *
		 * */
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("****************************");
		
		/*
		 * 在 Java SE 8中，甚至不用写循环。可以调用 forEachRemaining 方法并提供一 lambda
		 * 表达式（它会处理一个元素）。 将对迭代器的每一个元素调用这个 lambda 表达式，直到再没
		 *	有元素为止
		 *
		 * */
		
		/*
		 * 单纯的调用next() 时会报错 NoSuchElementException
		 * */
		
		/*
		 * 一个迭代器只可以使用一次
		 * */
		iterator.forEachRemaining(element -> System.out.println(element));
		
		Iterator<String> list = collection.iterator(); // 重新调用collection 的iterator()方法返回一个新的迭代器
		System.out.println(collection);
		// print [sting10, sting9, sting8, sting7, sting6, sting5, sting4, sting3, sting2, sting1]
		/*
		 * 调用remove方法之前必须先调用next()方法，前者对后者有一定的依懒性
		 * */
		String s = list.next();
		System.out.println(s); // print sting10
		list.remove();
		System.out.println(collection);
		// print [sting9, sting8, sting7, sting6, sting5, sting4, sting3, sting2, sting1]
	}
}
