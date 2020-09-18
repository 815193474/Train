package javabase.javacoreI;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author luoGuanzhong @Date 2020-08-31 15:26
 *
 * <p>LinkedList 链表 链表节点中存放 数据、 节点前驱节点索引 和 后驱节点索引 也提供了双端队列
 */
public class LinkedListAPIs {
	/*
	 * 增删快，检索慢
	 * */
	
	/*
	 * 链 表 是 一 个 有 序 集 合（ ordered collection), 每个对象的位置十分重要。LinkedList.add 方法将对象添加到链表的尾部。
	 *
	 * */
	/*
	 *
	 * ? LinkedList()
	 * 构造一个空链表。
	 * ?LinkedList(Collection<? extends E> elements)
	 * 构造一个链表， 并将集合中所有的元素添加到这个链表中。
	 * ? void addFirst(E element)
	 * ? void addLast(E element)
	 * 将某个元素添加到列表的头部或尾部。
	 * ? E getFirst()
	 * ? E getLast()
	 * 返回列表头部或尾部的元素。
	 * ? E removeFirst()
	 * ? E removeLast()
	 * 删除并返回列表头部或尾部的元素
	 *
	 * */
	public static void main(String[] args) {
		//
		List<String> staff = new LinkedList<>();
		staff.add("Amy");
		staff.add("Bob");
		staff.add("Carl");
		System.out.println(staff); // print [Amy, Bob, Carl]
		/*
		 * ListIterator
		 *
		 * */
		/*
		 * void add(E newElement)
		 *	在当前位置前添加一个元素。
		 *	void set(E newElement)
		 *	用新元素取代 next 或 previous 上次访问的元素。 如果在 next 或 previous 上次调用之
		 *	后列表结构被修改了， 将拋出一个 IllegalStateException 异常。
		 *	 boolean hasPrevious()
		 *	当反向迭代列表时， 还有可供访问的元素， 返回 true。
		 * E previous()
		 *	返回前对象。如果已经到达了列表的头部， 就抛出一个NoSuchElementException 异常。
		 * int nextIndex()
		 *	返回下一次调用 next 方法时将返回的元素索引。
		 *	int previousIndex()
		 *	返回下一次调用 previous 方法时将返回的元素索引。
		 *
		 * */
		ListIterator<String> iterator = staff.listIterator();
		// 在第二个元素之前添加一个元素
		//		iterator.next();
		//		iterator.add("test");
		System.out.println(staff); // print [Amy, test, Bob, Carl]
		// 通过正向遍历将游标定位到链表末尾
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// 如不定位游标无法进行反向遍历
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		/*
		 * set 方法用一个新元素取代调用 next 或 previous 方法返回的上一个元素
		 * */
		iterator.next();
		iterator.set("test");
		System.out.println(staff); // print [test, Bob, Carl]
	}
}
