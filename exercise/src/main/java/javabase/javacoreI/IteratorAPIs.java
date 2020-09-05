package javabase.javacoreI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @Author luoGuanzhong @Date 2020-08-31 11:23
 *
 * <p>Iterator �ӿ� ������4������
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
		 * ͨ���������� next ����������������ʼ����е�ÿ��Ԫ�ء����ǣ���������˼��ϵ�ĩ
		 * β��next �������׳�һ�� NoSuchElementException�� ��ˣ���Ҫ�ڵ��� next ֮ǰ���� hasNext
		 * ��������������������ж�������ʵ�Ԫ�أ� ��������ͷ��� true�������Ҫ�˿������е�
		 * ����Ԫ�أ�������һ�������������� hasNext ���� true ʱ�����ص��� next ����
		 *
		 * */
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("****************************");
		
		/*
		 * �� Java SE 8�У���������дѭ�������Ե��� forEachRemaining �������ṩһ lambda
		 * ���ʽ�����ᴦ��һ��Ԫ�أ��� ���Ե�������ÿһ��Ԫ�ص������ lambda ���ʽ��ֱ����û
		 *	��Ԫ��Ϊֹ
		 *
		 * */
		
		/*
		 * �����ĵ���next() ʱ�ᱨ�� NoSuchElementException
		 * */
		
		/*
		 * һ��������ֻ����ʹ��һ��
		 * */
		iterator.forEachRemaining(element -> System.out.println(element));
		
		Iterator<String> list = collection.iterator(); // ���µ���collection ��iterator()��������һ���µĵ�����
		System.out.println(collection);
		// print [sting10, sting9, sting8, sting7, sting6, sting5, sting4, sting3, sting2, sting1]
		/*
		 * ����remove����֮ǰ�����ȵ���next()������ǰ�߶Ժ�����һ����������
		 * */
		String s = list.next();
		System.out.println(s); // print sting10
		list.remove();
		System.out.println(collection);
		// print [sting9, sting8, sting7, sting6, sting5, sting4, sting3, sting2, sting1]
	}
}
