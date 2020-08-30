package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-25 17:24
 *
 * <p>Cloneable 接口的学习
 *
 * <p>浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 */
public class CloneShallowAPIs implements Cloneable {
	
	/*
	 * 要实现克隆 clone 必须实现Cloneable 接口
	 * 并且手动重写 clone() 方法，实现克隆类型的转换
	 * */
	
	public CloneShallowAPIs clone() throws CloneNotSupportedException {
		return (CloneShallowAPIs) super.clone();
	}
	
	private String name;
	private CloneTest test;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public CloneTest getTest() {
		return test;
	}
	
	public void setTest(CloneTest test) {
		this.test = test;
	}
	
	@Override
	public String toString() {
		return "CloneShallowAPIs{" + "name='" + name + '\'' + ", test=" + test + '}';
	}
	
	public static void main(String[] args) {
		//
		CloneShallowAPIs apIs = new CloneShallowAPIs();
		apIs.setName("原对象");
		CloneTest t = new CloneTest();
		t.setAge(1111);
		t.setName("张三");
		apIs.setTest(t);
		// 我是原对象实例 CloneShallowAPIs{name='原对象', test=张三[name = 张三, age = 1111]}
		System.out.println("我是原对象实例 " + apIs);
		
		CloneShallowAPIs apIs1;
		try {
			apIs1 = apIs.clone();
			// print 我是克隆对象 CloneShallowAPIs{name='原对象', test=张三[name = 张三, age = 1111]}
			System.out.println("我是克隆对象 " + apIs1);
			apIs1.setName("克隆对象");
			CloneTest t1 = apIs1.getTest();
			t1.setAge(2222);
			t1.setName("李四");
			apIs1.setTest(t1);
			
			/*
			 * 从以下代码块可以看出浅克隆后，修改克隆后的对象中的引用对象会将原对象中的引用对象值改变
			 * 因为浅复制复制的是引用，还是指向原地址
			 * */
			{
				// print 我是原对象实例 CloneShallowAPIs{name='原对象', test=李四[name = 李四, age = 2222]}
				System.out.println("我是原对象实例 " + apIs);
				// print 我是克隆对象 CloneShallowAPIs{name='克隆对象', test=李四[name = 李四, age = 2222]}
				System.out.println("我是克隆对象 " + apIs1);
			}
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
