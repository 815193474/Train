package javabase.javacoreI;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 * @Author luoGuanzhong @Date 2020-08-25 15:01
 *
 * <p>interface 接口的学习
 */
public class InterfaceAPIs {
	
	/*
	 * 接口不是类，不可用new来实例化一个接口  x = new Comparable(. . .); // ERROR
	 * 却能声明接口的变量 Comparable x; // OK
	 *
	 * */
	Comparable i;
	/*
	 * 接口变量必须引用实现了接口的类对象
	 * employee 实现了接口类，因此赋值给Comparable 接口
	 * */
	Comparable i1 = new Employee("ll", 1);
	
	public static void main(String[] args) {
		/*
		 * instanceof
		 * a instanceof Pair<String>
		 * a 是否是任意类型的一个 Pair
		 * */
		/*
		 * 使用instanceof 检查一个对象是否实现了某个特定的接口
		 * */
		Employee e = new Employee("ls", 2);
		if (e instanceof Comparable) {
			System.out.println(true); // print true
		}
		
		/*
		 * 解决默认方法冲突
		 * 1 ) 超类优先 如果超类提供了一个具体方法，同名而且有相同参数类型的默认方法会被忽略
		 * 2 ) 接口冲突。 如果一个超接口提供了一个默认方法，另一个接口提供了一个同名而且参数类型（不论是否是默认参数）相同的方法，
		 * 必须覆盖这个方法来解决冲突
		 * 如果有一个类同时实现了两个接口,且两个接口中都有同名方法，这时需要在该类中提供同名方法，
		 * 在这个方法中选择一个超接口方法 ，如下
		 * public String getName () { return Person.super.getName(); } // person 是超接口中的一个
		 * */
		
		ActionListener listener = new TimePrinter(); // 把实现接口的实现类实例化赋值给接口变量
		Timer timer = new Timer(1000, listener);
		timer.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
	
	static class TimePrinter implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("At the tone, the time is " + new Date());
			Toolkit.getDefaultToolkit().beep();
		}
	}
}
