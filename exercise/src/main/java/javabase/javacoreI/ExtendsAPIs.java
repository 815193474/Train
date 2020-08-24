package javabase.javacoreI;

import java.util.Arrays;

/**
 * @Author luoGuanzhong @Date 2020-08-22 20:34
 *
 * <p>java中的继承
 */
public class ExtendsAPIs {
	
	private String name;
	private int age;
	
	ExtendsAPIs(String n, int a) {
		this.age = a;
		this.name = n;
	}
	
	private void setName(String n) {
		this.name = n;
	}
	
	private String getName() {
		return this.name;
	}
	
	public String toString() {
		return "ExtendsAPIs{" + "name = " + name + ", age =" + age + "}";
	}
	
	/*
	 * ！！！ 子类继承父类后虽然拥有和父类一样的属性，但是子类不能直接访问父类的私有域
	 * 想要访问私有域需要通过父类的父类的访问间接的访问，如下
	 * super.getSalary();
	 * super 不是一个对象的引用， 不能将 super 赋给另一个对象变量， 它只是一个指示编译器调用超类方法的特殊关键字
	 * */
	
	/*
	 * 子类构造器访问父类构造器的简写形式
	 * super(name, salary, year, month, day);
	 * 调用超类 ExtendsAPIs 中含有 n、s、year month 和 day 参数的构造器
	 *
	 * ！！！ super 调用构造器的语句必须是子类构造器的第一条语句
	 * */
	
	/*
	 * 关键字 this 有两个用途： 一是引用隐式参数，二是调用该类其他的构造器;
	 * super 关键字也有两个用途：一是调用超类的方法，二是调用超类的构造器
	 * */
	
	public static void main(String[] args) {
		//
		ExtendsAPIs extendsAPIs = new ExtendsAPIs("suShan", 12);
		ExtendsAPIs[] extendsAPI = new ExtendsAPIs[1];
		extendsAPI[0] = extendsAPIs;
		System.out.println(extendsAPIs); // print ExtendsAPIs{name = suShan, age =12}
		System.out.println(Arrays.toString(extendsAPI)); // print [ExtendsAPIs{name = suShan, age =12}]
		extendsAPIs.setName("liSi");
		
		System.out.println(extendsAPIs.getName()); // print liSi
		System.out.println(Arrays.toString(extendsAPI)); // print [ExtendsAPIs{name = liSi, age =12}]
	}
	
	/* ！！！ 继承中的强制类型转换
	 * 子类可以直接引用父类类型，不需要转换;
	 * 父类转换为子类前需要进行检查，检查使用 instanceof
	 * 只能在继承层次内转换
	 *  x instanceof otherObject   (不推荐)
	 *  可以通过检查的方式变相的进行异常抛出，避免程序报错
	 * */
	
	/*
	 * 仅对本类可见 private
	 * 对所有类可见 public
	 * 对本包和所有子类可见 protected
	 * 对本包可见—默认， 不需要修饰符
	 *
	 * */
	
	/* Object 所有类的超类
	 * 可以使用object类型的变量引用任何类型的对象
	 * Object 类型的变量只能用于作为各种值的通用持有者
	 * 想对其中的内容进行具体的操作， 还需要清楚对象的原始类型
	 * 只有基本类型 （ primitive types) 不是对象
	 * 所有的数组类型，不管是对象数组还是基本类型的数组都扩展了 Object 类
	 * */
//  Object object = new ExtendsAPIs("zhubo", 12);
	
	/* object 类中的equals() 方法
	 * 子类如果没有重写equals() 方法，那么两个对象比较时相当于 == ，比较的是内存地址是否相等
	 * 如果重写，则按照重写规则来，一般我们认为俩对象内容相等时，两个对象则相等
	 * Java 语言规范要求equals方法具有以下特性
	 * 1.自反性 对于任何非空引用 x.equals(x) 应当返回true
	 * 2.对称性 对于任何引用x和y，当且仅当 y.equals(x) 为true时，x.equals(y) 也应该返回true
	 * 3.传递性 对于任何引用 x、 y 和 z, 如果 x.equals(y) 返 N true， y.equals(z) 返回 true,x.equals(z) 也应该返回 true
	 * 4.一致性 如果 x 和 y 引用的对象没有发生变化，反复调用 x.equals(y) 应该返回同样的结果。
	 * 5.对于任意非空引用 x, x.equals(null) 应该返回 false
	 * */
	
	/*
	 * 重写object类的equals方法
	 * 1. 显式参数命名为 otherObject, 稍后需要将它转换成另一个叫做 other 的变量
	 * 2. 检测 this 与 otherObject 是否引用同一个对象：if (this = otherObject) return true;
	 * 3. 检测 otherObject 是否为 null, 如 果 为 null, 返 回 false。这项检测是很必要的
	 * 4. 比较 this 与 otherObject 是否属于同一个类 getClass()
	 * 5. 将 otherObject 转换为相应的类类型变量
	 * 6. 现在开始对所有需要比较的域进行比较了。使用 =比较基本类型域，使用 equals 比较对象域。如果所有的域都匹配， 就返回 true; 否 则 返 回 false
	 * 7. 如果在子类中重新定义 equals, 就要在其中包含调用 super.equals(other)
	 * */
	
}
