package javabase.javacoreI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author luoGuanzhong
 * @Date 2020-08-31 15:06
 *
 * Set 集 set接口等同于 Collection 接口，不过其方法的行为有更严谨的定义 它不允许有重复的元素
 */
public class SetAPIs {
	
	/*
	 * 。set 的 add 方法首先在集中查找要添加的对象，如果不存在，就将这个对象添加进去
	 * */
	
	/*
	 * equals 方法
	 * 只要两个集包含同样的元素就认为是相等的，而不要求这些元素有同样的顺序。
	 * */
	
	/*
	 * hashCode 方法
	 * 要保证包含相同元素的两个集会得到相同的散列码
	 * */
	public static void main(String[] args) {
		//
		/*
		 * HashSet( )
		 * 构造一个空散列表。
		 * */
		Set<String> sets = new HashSet<>();
		
		/*
		 * HashSet(Collection<? extends E> elements )
		 * 构造一个散列集， 并将集合中的所有元素添加到这个散列集中
		 * */
		
		/*
		 * HashSet(int initialCapacity)
		 * 构造一个空的具有指定容量（桶数）的散列集
		 * */
		
		/*
		 * HashSet(int initialCapacity , float loadFactor )
		 * 构造一个具有指定容量和装填因子（一个 0.0 ~ 1.0 之间的数值， 确定散列表填充的百分比，当大于这个百分比时， 散列表进行再散列）的空散列集
		 *
		 * */
		
		/*
		 * ava.lang.Object 1.O
		 * int hashCode( )
		 * 返回这个对象的散列码。散列码可以是任何整数， 包括正数或负数。
		 * */
	}
}
