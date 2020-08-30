package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-26 09:49
 *
 * <p>深clone 案例
 *
 * <p>深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 */
public class CloneDeepAPIs implements Cloneable {
	/*
	 * 要实现克隆 clone 必须实现Cloneable 接口
	 * 并且手动重写 clone() 方法，实现克隆类型的转换
	 * */
	
	public CloneDeepAPIs clone() throws CloneNotSupportedException {
		CloneDeepAPIs cloneDeep = (CloneDeepAPIs) super.clone();
		/*
		 * clone 子类引用，这是深克隆关键
		 * */
		cloneDeep.setTest(cloneDeep.getTest().clone());
		return cloneDeep;
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
		CloneDeepAPIs apIs = new CloneDeepAPIs();
		apIs.setName("原对象");
		CloneTest t = new CloneTest();
		t.setAge(1111);
		t.setName("张三");
		apIs.setTest(t);
		// print 我是原对象实例 CloneShallowAPIs{name='原对象', test=张三[name = 张三, age = 1111]}
		System.out.println("我是原对象实例 " + apIs);
		
		CloneDeepAPIs apIs1;
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
			 * 从以下代码块可以看出深克隆后，修改克隆得到的对象中的引用对象的属性值不会修改原对象的引用对象的属性值
			 *
			 * */
			{
				// print 我是原对象实例 CloneShallowAPIs{name='原对象', test=张三[name = 张三, age = 1111]}
				System.out.println("我是原对象实例 " + apIs);
				// print 我是克隆对象 CloneShallowAPIs{name='克隆对象', test=李四[name = 李四, age = 2222]}
				System.out.println("我是克隆对象 " + apIs1);
			}
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
