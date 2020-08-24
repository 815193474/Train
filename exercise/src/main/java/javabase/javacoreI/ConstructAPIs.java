package javabase.javacoreI;

import java.time.LocalDate;
import java.util.Random;

/**
 * @Author luoGuanzhong @Date 2020-08-21 16:46
 *
 * <p>构造器的知识点 构造器与其他的方法有一个重要的不同。构造器总是伴随着 new 操作符的执行被调用， 而不能对一个已经存在的对象调用构造器来达到重新设置实例域的目的。
 *
 * <p>1.每个类可以有一个以上的构造器 2. 构造器可以有 0 个、1 个或多个参数 3. 构造器没有返回值 ; 4. 构造器总是伴随着 new 操作一起调用; 5. 构造器与类同名
 */
public class ConstructAPIs {
	
	/* 创建ExtendsAPIs 类*/
	public static class ExtendsAPIs {
		
		private String name;
		private String sex;
		private int age;
		double height;
		private LocalDate birthday;
		
		/*   创建类的构造器
			当构造器数量大于等于 1 时必须提供默认构造器即不带参数的构造器，负责会报错
				第一个参数称为隐式 （ implicit ) 参数， 是出现在方法名前的ExtendsAPIs 类对象。
				第二个参数位于方法名后面括号中的数值，这是一个显式 （ explicit) 参数 （ 有些人把隐式参数称为方法调用的目标或接收者。)
				在每一个方法中， 关键字 this 表示隐式参数
		*/
		ExtendsAPIs() {
			/* 默认构造器 没有参数 */
		}
		
		ExtendsAPIs(String name, String sex, int age, LocalDate birthday) {
			this.name = name;
			this.age = age;
			this.sex = sex;
			this.birthday = birthday;
		}
		
		@Override
		public String toString() {
			return "ExtendsAPIs{"
					+ "name='"
					+ name
					+ '\''
					+ ", sex='"
					+ sex
					+ '\''
					+ ", age="
					+ age
					+ ", birthday="
					+ birthday
					+ '}';
		}
		/*
		 * this("ExtendsAPIs #" + param1, param2);
		 * 构造器中访问类中另外一个构造器
		 * */
		
		/* java中数据初始化的方法
		 * 1. 在构造器中初始化;
		 * 2. 在声明时赋值;
		 * 3. 初始化块中赋值;
		 * */ {
			height = 2;
		}
		
		/*
		 * 重载
		 * 重载其实是当前类中的同名方法，有不同的参数
		 * 重写发生在子类中，是两个类的共同作用
		 * */
		public static void main(String[] args) {
			/* 调用构造器方法创建对象的实例 */
			ExtendsAPIs ExtendsAPIs = new ExtendsAPIs("Dark", "male", 12, LocalDate.now());
			System.out.println(ExtendsAPIs);
			double n = new Random().nextInt(2); // 随机一个大于等于0小于2的随机数并且赋值给n
			System.out.println(n);
		}
	}
}
