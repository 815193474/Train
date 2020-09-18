package javabase.javacoreI;

import java.util.ArrayList;

/**
 * @Author luoGuanzhong @Date 2020-08-23 17:49
 *
 * ArrayList 增删慢，检索快 线程不安全
 */
public class ArrayListAPIs {
	
	/*
	 * ArrayList 是一个采用类型参数（ type parameter ) 的泛型类（ generic class)
	 * 如: ArrayList<Employee> staff = new ArrayList<Employee>();
	 * 但是在 java se 7 中右边的类型参数可以省略
	 *
	 * */
	public static void main(String[] args) {
		
		/*
		 * void set(int index，E obj)
		 * 设置数组列表指定位置的元素值， 这个操作将覆盖这个位置的原有内容。
		 * */
		
		/*
		 * E get(int index)
		 * 获得指定位置的元素值
		 * */
		
		/*
		 * boolean add(E obj)
		 * 在数组列表的尾端添加一个元素。 永远返回 true
		 * */
		
		/*
		 * void add(int index,E obj)
		 * 向后移动元素，以便插入元素。
		 * */
		
		/*
		 * E removed (int index)
		 * 删除一个元素，并将后面的元素向前移动。被删除的元素由返回值返回。
		 **/
		
		/*
		 * ensureCapacity();
		 * 确保数组列表在不重新分配存储空间的情况下就能够保存给定数量的元素
		 * 测试发现ensureCapacity() 方法可以提高array增加元素时的效率
		 * */
		
		ArrayList<Object> array1 = new ArrayList<>();
		ArrayList<Object> array2 = new ArrayList<>();
		
		// array2.ensureCapacity(1000000);
		fun("集合2", array2);
		fun("集合1", array1);
		/*
		 * void trimToSize(int n)
		 * 将数组列表的存储尺寸削减到当前尺寸n
		 * */
	}
	
	private static void fun(String name, ArrayList<Object> objects) {
		int n = 1000000;
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			objects.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(name + "增加了" + objects.size() + "个元素，用时" + (endTime - startTime));
		System.out.println(objects);
	}
}
