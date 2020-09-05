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
 * <p>interface �ӿڵ�ѧϰ
 */
public class InterfaceAPIs {
	
	/*
	 * �ӿڲ����࣬������new��ʵ����һ���ӿ�  x = new Comparable(. . .); // ERROR
	 * ȴ�������ӿڵı��� Comparable x; // OK
	 *
	 * */
	Comparable i;
	/*
	 * �ӿڱ�����������ʵ���˽ӿڵ������
	 * employee ʵ���˽ӿ��࣬��˸�ֵ��Comparable �ӿ�
	 * */
	Comparable i1 = new Employee("ll", 1);
	
	public static void main(String[] args) {
		/*
		 * instanceof
		 * a instanceof Pair<String>
		 * a �Ƿ����������͵�һ�� Pair
		 * */
		/*
		 * ʹ��instanceof ���һ�������Ƿ�ʵ����ĳ���ض��Ľӿ�
		 * */
		Employee e = new Employee("ls", 2);
		if (e instanceof Comparable) {
			System.out.println(true); // print true
		}
		
		/*
		 * ���Ĭ�Ϸ�����ͻ
		 * 1 ) �������� ��������ṩ��һ�����巽����ͬ����������ͬ�������͵�Ĭ�Ϸ����ᱻ����
		 * 2 ) �ӿڳ�ͻ�� ���һ�����ӿ��ṩ��һ��Ĭ�Ϸ�������һ���ӿ��ṩ��һ��ͬ�����Ҳ������ͣ������Ƿ���Ĭ�ϲ�������ͬ�ķ�����
		 * ���븲����������������ͻ
		 * �����һ����ͬʱʵ���������ӿ�,�������ӿ��ж���ͬ����������ʱ��Ҫ�ڸ������ṩͬ��������
		 * �����������ѡ��һ�����ӿڷ��� ������
		 * public String getName () { return Person.super.getName(); } // person �ǳ��ӿ��е�һ��
		 * */
		
		ActionListener listener = new TimePrinter(); // ��ʵ�ֽӿڵ�ʵ����ʵ������ֵ���ӿڱ���
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
