package demo.compare;

import java.util.Comparator;

/**
 * @Author luoGuanzhong @Date 2020-09-06 21:42
 *
 * <p>ʵ��comparator�ӿڵ���
 *
 * comparator ����������ⲿ comparable ����������ڲ� ʹ����������ö�����дcomparable�ӿڵ�compareTo()����
 */
public class UserCompare {
	
	/*
	 * compare(Object o1,Object o2)������java.util.Comparator�ӿڵķ�������ʵ�����õ��Ǵ��Ƚ϶����compareTo(Object o)������
	 * ���������������һЩ����û�бȽ������Ķ������飩Ϊ����ʵ�ֱȽϵĹ��ܣ������������Ƚ�����
	 * ��һ���ⲿ�Ķ�����ͨ��������Ƚϵķ�ʽ���ٴ���Collection.sort()��Arrays.sort()�ж�Ŀ������
	 * ����ͨ������ķ���compare()����Ƚϵ����ݺͽ����������
	 * */
	private int id;
	private String name;
	
	public UserCompare(int d, String n) {
		this.id = d;
		this.name = n;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "UserCompare{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}
