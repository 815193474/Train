package javabase.javacoreI;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author luoGuanzhong @Date 2020-08-31 15:26
 *
 * <p>LinkedList ���� ����ڵ��д�� ���ݡ� �ڵ�ǰ���ڵ����� �� �����ڵ����� Ҳ�ṩ��˫�˶���
 */
public class LinkedListAPIs {
	/*
	 * ��ɾ�죬������
	 * */
	
	/*
	 * �� �� �� һ �� �� �� �� �ϣ� ordered collection), ÿ�������λ��ʮ����Ҫ��LinkedList.add ������������ӵ������β����
	 *
	 * */
	/*
	 *
	 * ? LinkedList()
	 * ����һ��������
	 * ?LinkedList(Collection<? extends E> elements)
	 * ����һ������ �������������е�Ԫ����ӵ���������С�
	 * ? void addFirst(E element)
	 * ? void addLast(E element)
	 * ��ĳ��Ԫ����ӵ��б��ͷ����β����
	 * ? E getFirst()
	 * ? E getLast()
	 * �����б�ͷ����β����Ԫ�ء�
	 * ? E removeFirst()
	 * ? E removeLast()
	 * ɾ���������б�ͷ����β����Ԫ��
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
		 *	�ڵ�ǰλ��ǰ���һ��Ԫ�ء�
		 *	void set(E newElement)
		 *	����Ԫ��ȡ�� next �� previous �ϴη��ʵ�Ԫ�ء� ����� next �� previous �ϴε���֮
		 *	���б�ṹ���޸��ˣ� ������һ�� IllegalStateException �쳣��
		 *	 boolean hasPrevious()
		 *	����������б�ʱ�� ���пɹ����ʵ�Ԫ�أ� ���� true��
		 * E previous()
		 *	����ǰ��������Ѿ��������б��ͷ���� ���׳�һ��NoSuchElementException �쳣��
		 * int nextIndex()
		 *	������һ�ε��� next ����ʱ�����ص�Ԫ��������
		 *	int previousIndex()
		 *	������һ�ε��� previous ����ʱ�����ص�Ԫ��������
		 *
		 * */
		ListIterator<String> iterator = staff.listIterator();
		// �ڵڶ���Ԫ��֮ǰ���һ��Ԫ��
		//		iterator.next();
		//		iterator.add("test");
		System.out.println(staff); // print [Amy, test, Bob, Carl]
		// ͨ������������α궨λ������ĩβ
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// �粻��λ�α��޷����з������
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		/*
		 * set ������һ����Ԫ��ȡ������ next �� previous �������ص���һ��Ԫ��
		 * */
		iterator.next();
		iterator.set("test");
		System.out.println(staff); // print [test, Bob, Carl]
	}
}
