package javabase.javacoreI;

import java.util.Arrays;

/**
 * @Author luoGuanzhong @Date 2020-08-22 20:34
 *
 * <p>java�еļ̳�
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
	 * ������ ����̳и������Ȼӵ�к͸���һ�������ԣ��������಻��ֱ�ӷ��ʸ����˽����
	 * ��Ҫ����˽������Ҫͨ������ĸ���ķ��ʼ�ӵķ��ʣ�����
	 * super.getSalary();
	 * super ����һ����������ã� ���ܽ� super ������һ����������� ��ֻ��һ��ָʾ���������ó��෽��������ؼ���
	 * */
	
	/*
	 * ���๹�������ʸ��๹�����ļ�д��ʽ
	 * super(name, salary, year, month, day);
	 * ���ó��� ExtendsAPIs �к��� n��s��year month �� day �����Ĺ�����
	 *
	 * ������ super ���ù������������������๹�����ĵ�һ�����
	 * */
	
	/*
	 * �ؼ��� this ��������;�� һ��������ʽ���������ǵ��ø��������Ĺ�����;
	 * super �ؼ���Ҳ��������;��һ�ǵ��ó���ķ��������ǵ��ó���Ĺ�����
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
	
	/* ������ �̳��е�ǿ������ת��
	 * �������ֱ�����ø������ͣ�����Ҫת��;
	 * ����ת��Ϊ����ǰ��Ҫ���м�飬���ʹ�� instanceof
	 * ֻ���ڼ̳в����ת��
	 *  x instanceof otherObject   (���Ƽ�)
	 *  ����ͨ�����ķ�ʽ����Ľ����쳣�׳���������򱨴�
	 * */
	
	/*
	 * ���Ա���ɼ� private
	 * ��������ɼ� public
	 * �Ա�������������ɼ� protected
	 * �Ա����ɼ���Ĭ�ϣ� ����Ҫ���η�
	 *
	 * */
	
	/* Object ������ĳ���
	 * ����ʹ��object���͵ı��������κ����͵Ķ���
	 * Object ���͵ı���ֻ��������Ϊ����ֵ��ͨ�ó�����
	 * ������е����ݽ��о���Ĳ����� ����Ҫ��������ԭʼ����
	 * ֻ�л������� �� primitive types) ���Ƕ���
	 * ���е��������ͣ������Ƕ������黹�ǻ������͵����鶼��չ�� Object ��
	 * */
//  Object object = new ExtendsAPIs("zhubo", 12);
	
	/* object ���е�equals() ����
	 * �������û����дequals() ��������ô��������Ƚ�ʱ�൱�� == ���Ƚϵ����ڴ��ַ�Ƿ����
	 * �����д��������д��������һ��������Ϊ�������������ʱ���������������
	 * Java ���Թ淶Ҫ��equals����������������
	 * 1.�Է��� �����κηǿ����� x.equals(x) Ӧ������true
	 * 2.�Գ��� �����κ�����x��y�����ҽ��� y.equals(x) Ϊtrueʱ��x.equals(y) ҲӦ�÷���true
	 * 3.������ �����κ����� x�� y �� z, ��� x.equals(y) �� N true�� y.equals(z) ���� true,x.equals(z) ҲӦ�÷��� true
	 * 4.һ���� ��� x �� y ���õĶ���û�з����仯���������� x.equals(y) Ӧ�÷���ͬ���Ľ����
	 * 5.��������ǿ����� x, x.equals(null) Ӧ�÷��� false
	 * */
	
	/*
	 * ��дobject���equals����
	 * 1. ��ʽ��������Ϊ otherObject, �Ժ���Ҫ����ת������һ������ other �ı���
	 * 2. ��� this �� otherObject �Ƿ�����ͬһ������if (this = otherObject) return true;
	 * 3. ��� otherObject �Ƿ�Ϊ null, �� �� Ϊ null, �� �� false���������Ǻܱ�Ҫ��
	 * 4. �Ƚ� this �� otherObject �Ƿ�����ͬһ���� getClass()
	 * 5. �� otherObject ת��Ϊ��Ӧ�������ͱ���
	 * 6. ���ڿ�ʼ��������Ҫ�Ƚϵ�����бȽ��ˡ�ʹ�� =�Ƚϻ���������ʹ�� equals �Ƚ϶�����������е���ƥ�䣬 �ͷ��� true; �� �� �� �� false
	 * 7. ��������������¶��� equals, ��Ҫ�����а������� super.equals(other)
	 * */
	
}
