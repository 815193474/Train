package javabase.javacoreI;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Author luoGuanzhong @Date 2020-08-31 22:15
 *
 * <p>TreeSet 是一个有序集合,可以以任意顺序将元素插入到集合中,对集合进行遍历时，每个值将 自动地按照排序后的顺序呈现
 * 如果没有对数据排序的需求建议不要使用，因为插入元素较慢
 */
public class TreeSetAPIs {
	/*
	 * 将一个元素添加到树中要比添加到散列表中慢
	 * 但是，与检查数组或链表中的重复元素相比还是快很多
	 * */
	
	/*
	 *
	 *  ?TreeSet()
	 *	?TreeSet(Comparator<? super E> comparator)
	 *	构造一个空树集。
	 *	?TreeSet(Collection<? extends E> elements)
	 *	? TreeSet(SortedSet<E> s)
	 *	构造一个树集， 并增加一个集合或有序集中的所有元素（对于后一种情况， 要使用同
	 *	样的顺序。
	 *
	 * */
	
	/*
	 * java.util.SortedSet<E> 1.2
	 * Comparator < ? super E> comparator ()
	 * 返回用于对元素进行排序的比较器。如果元素用 Comparable 接口的 compareTo方法进行比较则返回 null。
	 * E first()
	 *	E last()
	 *	返回有序集中的最小元素或最大元素
	 *
	 * */
	public static void main(String[] args) {
		SortedSet<String> strings = new TreeSet<>();
	}
}
