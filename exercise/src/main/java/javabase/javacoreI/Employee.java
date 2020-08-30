package javabase.javacoreI;

import java.util.Comparator;

/**
 * @Author luoGuanzhong @Date 2020-08-25 14:20
 *
 * <p>用来排序练习的实体类
 */
public class Employee implements Comparable<Employee>, Comparator<String> {
	
	private String name;
	private int power;
	
	Employee(String name, int p) {
		this.name = name;
		this.power = p;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", power=" + power +
				'}';
	}
	
	@Override
	public int compareTo(Employee o) {
		return Integer.compare(o.power, power);
	}
	
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}
