package javabase.javacoreI;

import java.time.LocalDate;
import java.util.Random;

/**
 * @Author luoGuanzhong @Date 2020-08-21 16:46
 *
 * <p>��������֪ʶ�� �������������ķ�����һ����Ҫ�Ĳ�ͬ�����������ǰ����� new ��������ִ�б����ã� �����ܶ�һ���Ѿ����ڵĶ�����ù��������ﵽ��������ʵ�����Ŀ�ġ�
 *
 * <p>1.ÿ���������һ�����ϵĹ����� 2. ������������ 0 ����1 ���������� 3. ������û�з���ֵ ; 4. ���������ǰ����� new ����һ�����; 5. ����������ͬ��
 */
public class ConstructAPIs {
	
	/* ����ExtendsAPIs ��*/
	public static class ExtendsAPIs {
		
		private String name;
		private String sex;
		private int age;
		double height;
		private LocalDate birthday;
		
		/*   ������Ĺ�����
			���������������ڵ��� 1 ʱ�����ṩĬ�Ϲ����������������Ĺ�����������ᱨ��
				��һ��������Ϊ��ʽ �� implicit ) ������ �ǳ����ڷ�����ǰ��ExtendsAPIs �����
				�ڶ�������λ�ڷ��������������е���ֵ������һ����ʽ �� explicit) ���� �� ��Щ�˰���ʽ������Ϊ�������õ�Ŀ�������ߡ�)
				��ÿһ�������У� �ؼ��� this ��ʾ��ʽ����
		*/
		ExtendsAPIs() {
			/* Ĭ�Ϲ����� û�в��� */
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
		 * �������з�����������һ��������
		 * */
		
		/* java�����ݳ�ʼ���ķ���
		 * 1. �ڹ������г�ʼ��;
		 * 2. ������ʱ��ֵ;
		 * 3. ��ʼ�����и�ֵ;
		 * */ {
			height = 2;
		}
		
		/*
		 * ����
		 * ������ʵ�ǵ�ǰ���е�ͬ���������в�ͬ�Ĳ���
		 * ��д�����������У���������Ĺ�ͬ����
		 * */
		public static void main(String[] args) {
			/* ���ù������������������ʵ�� */
			ExtendsAPIs ExtendsAPIs = new ExtendsAPIs("Dark", "male", 12, LocalDate.now());
			System.out.println(ExtendsAPIs);
			double n = new Random().nextInt(2); // ���һ�����ڵ���0С��2����������Ҹ�ֵ��n
			System.out.println(n);
		}
	}
}
