package javabase.javacoreI;

import java.util.ArrayList;

/**
 * @Author luoGuanzhong @Date 2020-08-23 17:49
 *
 * ArrayList ��ɾ���������� �̲߳���ȫ
 */
public class ArrayListAPIs {
	
	/*
	 * ArrayList ��һ���������Ͳ����� type parameter ) �ķ����ࣨ generic class)
	 * ��: ArrayList<Employee> staff = new ArrayList<Employee>();
	 * ������ java se 7 ���ұߵ����Ͳ�������ʡ��
	 *
	 * */
	public static void main(String[] args) {
		
		/*
		 * void set(int index��E obj)
		 * ���������б�ָ��λ�õ�Ԫ��ֵ�� ����������������λ�õ�ԭ�����ݡ�
		 * */
		
		/*
		 * E get(int index)
		 * ���ָ��λ�õ�Ԫ��ֵ
		 * */
		
		/*
		 * boolean add(E obj)
		 * �������б��β�����һ��Ԫ�ء� ��Զ���� true
		 * */
		
		/*
		 * void add(int index,E obj)
		 * ����ƶ�Ԫ�أ��Ա����Ԫ�ء�
		 * */
		
		/*
		 * E removed (int index)
		 * ɾ��һ��Ԫ�أ����������Ԫ����ǰ�ƶ�����ɾ����Ԫ���ɷ���ֵ���ء�
		 **/
		
		/*
		 * ensureCapacity();
		 * ȷ�������б��ڲ����·���洢�ռ������¾��ܹ��������������Ԫ��
		 * ���Է���ensureCapacity() �����������array����Ԫ��ʱ��Ч��
		 * */
		
		ArrayList<Object> array1 = new ArrayList<>();
		ArrayList<Object> array2 = new ArrayList<>();
		
		// array2.ensureCapacity(1000000);
		fun("����2", array2);
		fun("����1", array1);
		/*
		 * void trimToSize(int n)
		 * �������б�Ĵ洢�ߴ���������ǰ�ߴ�n
		 * */
	}
	
	private static void fun(String name, ArrayList<Object> objects) {
		int n = 1000000;
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			objects.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(name + "������" + objects.size() + "��Ԫ�أ���ʱ" + (endTime - startTime));
		System.out.println(objects);
	}
}
