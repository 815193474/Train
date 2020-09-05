package javabase.javacoreI;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * @Author luoGuanzhong @Date 2020-09-01 09:51
 *
 * <p>Queue ���� ArrayDeque ˫�˶���
 *
 * <p>PriorityQueue ���ȼ�����
 */
public class QueueAPIs {
	/*
	 *
	 * boolean add(E element )
	 *	boolean offer(E element )
	 *	�������û��������������Ԫ����ӵ����˫�˶��е�β�������� true�����������
	 *	�ˣ���һ������������һ�� IllegalStateException, ���ڶ����������� false
	 *
	 * */
	
	/*
	 *
	 * E remove()
	 * E poll()
	 * ������в��գ�ɾ���������������ͷ����Ԫ�ء���������ǿյģ���һ�������׳�
	 * NoSuchElementException, ���ڶ����������� null��
	 *
	 * E element()
	 * E peek()
	 * ������в��գ������������ͷ����Ԫ�أ� ����ɾ����������пգ���һ����������
	 * ��һ�� NoSuchElementException, ���ڶ����������� null��
	 * */
	
	/*
	 *  void addFirst(E element )
	 *  void addLast(E element )
	 *  boolean offerFirst(E element )
	 *  boolean offerLast(E element )
	 *  �������Ķ�����ӵ�˫�˶��е�ͷ����β��������������ˣ�ǰ����������������һ
	 *  �� IllegalStateException�������������������� false��
	 *  E removeFirst( )
	 *  E removeLast( )
	 *  E pollFirst( )
	 *  E pollLast( )
	 *  ������в��գ�ɾ�������ض���ͷ����Ԫ�ء��������Ϊ�գ�ǰ����������������һ
	 *  �� NoSuchElementException, ������������������ null��
	 *  E getFirst( )
	 *  E getLast( )
	 *  E peekFirst( )
	 *  E peekLast( )
	 *  ������зǿգ����ض���ͷ����Ԫ�أ� ����ɾ����������пգ�ǰ����������������
	 *  һ�� NoSuchElementException, ������������������ null��
	 *
	 * */
	
	/*
	 * java.util.ArrayDeque<E>
	 * ArrayDeque( )
	 * ArrayDeque(Int initialCapacity)
	 * �ó�ʼ���� 16 ������ĳ�ʼ��������һ������˫�˶���
	 * */
	public static void main(String[] args) {
		//
		/*
		 *  PriorityQueue ���ȼ�����
		 *  ���ȼ����У�priority queue) �е�Ԫ�ؿ��԰��������˳����ˣ�ȴ���ǰ��������˳��
		 *	���м�����Ҳ����˵�����ۺ�ʱ���� remove �������ܻ��õ�ǰ���ȼ���������С��Ԫ�ء�
		 *	Ȼ�������ȼ����в�û�ж����е�Ԫ�ؽ�����������õ����ķ�ʽ������ЩԪ�أ�������
		 *	Ҫ�����ǽ����������ȼ�����ʹ����һ�������Ҹ�Ч�����ݽṹ����Ϊ�ѣ�heap)������һ
		 *	���������ҵ����Ķ�����������ִ����ӣ� add) ��ɾ����remove) ������ ��������С��Ԫ��
		 *	�ƶ������������ػ���ʱ���Ԫ�ؽ�������
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
		 *  ����һ�����ڴ�� Comparable ��������ȼ����С�
		 *  PriorityQueue(int initialCapacity, Comparator ? super E> c)
		 *  ����һ�����ȼ����У� ����ָ���ıȽ�����Ԫ�ؽ�������
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
