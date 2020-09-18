package demo.compare;

import java.util.Comparator;

/**
 * @Author luoGuanzhong @Date 2020-09-06 21:42
 *
 * <p>实现comparator接口的类
 *
 * comparator 定义在类的外部 comparable 定义在类的内部 使用排序必须让对象重写comparable接口的compareTo()方法
 */
public class UserCompare {
	
	/*
	 * compare(Object o1,Object o2)方法是java.util.Comparator接口的方法，它实际上用的是待比较对象的compareTo(Object o)方法。
	 * 对于它，则是针对一些本身没有比较能力的对象（数组）为它们实现比较的功能，所以它叫做比较器，
	 * 是一个外部的东西，通过它定义比较的方式，再传到Collection.sort()和Arrays.sort()中对目标排序，
	 * 而且通过自身的方法compare()定义比较的内容和结果的升降序；
	 * */
	private int id;
	private String name;
	
	public UserCompare(int d, String n) {
		this.id = d;
		this.name = n;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "UserCompare{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}
