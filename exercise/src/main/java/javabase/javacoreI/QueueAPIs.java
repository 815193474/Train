package javabase.javacoreI;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * @Author luoGuanzhong @Date 2020-09-01 09:51
 *
 * <p>Queue 队列 ArrayDeque 双端队列
 *
 * <p>PriorityQueue 优先级队列
 */
public class QueueAPIs {
	/*
	 *
	 * boolean add(E element )
	 *	boolean offer(E element )
	 *	如果队列没有满，将给定的元素添加到这个双端队列的尾部并返回 true。如果队列满
	 *	了，第一个方法将拋出一个 IllegalStateException, 而第二个方法返回 false
	 *
	 * */
	
	/*
	 *
	 * E remove()
	 * E poll()
	 * 假如队列不空，删除并返回这个队列头部的元素。如果队列是空的，第一个方法抛出
	 * NoSuchElementException, 而第二个方法返回 null。
	 *
	 * E element()
	 * E peek()
	 * 如果队列不空，返回这个队列头部的元素， 但不删除。如果队列空，第一个方法将拋
	 * 出一个 NoSuchElementException, 而第二个方法返回 null。
	 * */
	
	/*
	 *  void addFirst(E element )
	 *  void addLast(E element )
	 *  boolean offerFirst(E element )
	 *  boolean offerLast(E element )
	 *  将给定的对象添加到双端队列的头部或尾部。如果队列满了，前面两个方法将拋出一
	 *  个 IllegalStateException，而后面两个方法返回 false。
	 *  E removeFirst( )
	 *  E removeLast( )
	 *  E pollFirst( )
	 *  E pollLast( )
	 *  如果队列不空，删除并返回队列头部的元素。如果队列为空，前面两个方法将拋出一
	 *  个 NoSuchElementException, 而后面两个方法返回 null。
	 *  E getFirst( )
	 *  E getLast( )
	 *  E peekFirst( )
	 *  E peekLast( )
	 *  如果队列非空，返回队列头部的元素， 但不删除。如果队列空，前面两个方法将拋出
	 *  一个 NoSuchElementException, 而后面两个方法返回 null。
	 *
	 * */
	
	/*
	 * java.util.ArrayDeque<E>
	 * ArrayDeque( )
	 * ArrayDeque(Int initialCapacity)
	 * 用初始容量 16 或给定的初始容量构造一个无限双端队列
	 * */
	public static void main(String[] args) {
		//
		/*
		 *  PriorityQueue 优先级队列
		 *  优先级队列（priority queue) 中的元素可以按照任意的顺序插人，却总是按照排序的顺序
		 *	进行检索。也就是说，无论何时调用 remove 方法，总会获得当前优先级队列中最小的元素。
		 *	然而，优先级队列并没有对所有的元素进行排序。如果用迭代的方式处理这些元素，并不需
		 *	要对它们进行排序。优先级队列使用了一个优雅且高效的数据结构，称为堆（heap)。堆是一
		 *	个可以自我调整的二叉树，对树执行添加（ add) 和删除（remove) 操作， 可以让最小的元素
		 *	移动到根，而不必花费时间对元素进行排序。
		 * */
		PriorityQueue<LocalDate> queue = new PriorityQueue<>();
		queue.add(LocalDate.of(1996, 12, 10));
		queue.add(LocalDate.of(1096, 9, 10));
		queue.add(LocalDate.of(1906, 11, 10));
		queue.add(LocalDate.of(1796, 8, 10));
		queue.add(LocalDate.of(2996, 10, 10));
		
		/*
		 * PriorityQueue()
		 *  PriorityQueue(int initialCapacity)
		 *  构造一个用于存放 Comparable 对象的优先级队列。
		 *  PriorityQueue(int initialCapacity, Comparator ? super E> c)
		 *  构造一个优先级队列， 并用指定的比较器对元素进行排序。
		 *
		 *
		 * */
		for (LocalDate l : queue) {
			System.out.print(l + " "); // print 1096-09-10 1796-08-10 1906-11-10 1996-12-10 2996-10-10
		}
		System.out.println("start remove element");
		while (!queue.isEmpty()) {
			System.out
					.print(queue.remove() + " "); // 1096-09-10 1796-08-10 1906-11-10 1996-12-10 2996-10-10
		}
	}
}
