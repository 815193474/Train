package javabase.javacoreI;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Author luoGuanzhong @Date 2020-08-31 22:15
 *
 * <p>TreeSet ��һ�����򼯺�,����������˳��Ԫ�ز��뵽������,�Լ��Ͻ��б���ʱ��ÿ��ֵ�� �Զ��ذ���������˳�����
 * ���û�ж���������������鲻Ҫʹ�ã���Ϊ����Ԫ�ؽ���
 */
public class TreeSetAPIs {
	/*
	 * ��һ��Ԫ����ӵ�����Ҫ����ӵ�ɢ�б�����
	 * ���ǣ���������������е��ظ�Ԫ����Ȼ��ǿ�ܶ�
	 * */
	
	/*
	 *
	 *  ?TreeSet()
	 *	?TreeSet(Comparator<? super E> comparator)
	 *	����һ����������
	 *	?TreeSet(Collection<? extends E> elements)
	 *	? TreeSet(SortedSet<E> s)
	 *	����һ�������� ������һ�����ϻ������е�����Ԫ�أ����ں�һ������� Ҫʹ��ͬ
	 *	����˳��
	 *
	 * */
	
	/*
	 * java.util.SortedSet<E> 1.2
	 * Comparator < ? super E> comparator ()
	 * �������ڶ�Ԫ�ؽ�������ıȽ��������Ԫ���� Comparable �ӿڵ� compareTo�������бȽ��򷵻� null��
	 * E first()
	 *	E last()
	 *	���������е���СԪ�ػ����Ԫ��
	 *
	 * */
	public static void main(String[] args) {
		SortedSet<String> strings = new TreeSet<>();
	}
}
