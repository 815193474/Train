package javabase.javacoreI;

import package01.Test;

/**
 * @Author luoGuanzhong
 * @Date 2020-08-26 09:07
 *
 *
 * clone ≤‚ ‘ª˘¥°¿‡
 */
public class CloneTest implements Cloneable {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return this.getName() + "[name = " + name + ", age = " + age + "]";
	}
	
	public CloneTest clone() throws CloneNotSupportedException {
		return (CloneTest) super.clone();
	}
}
