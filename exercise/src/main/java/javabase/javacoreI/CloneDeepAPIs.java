package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-26 09:49
 *
 * <p>��clone ����
 *
 * <p>���¡������һ���¶������������õ���������Ҳ�ᱻ��¡������ָ��ԭ�ж����ַ��
 */
public class CloneDeepAPIs implements Cloneable {
	/*
	 * Ҫʵ�ֿ�¡ clone ����ʵ��Cloneable �ӿ�
	 * �����ֶ���д clone() ������ʵ�ֿ�¡���͵�ת��
	 * */
	
	public CloneDeepAPIs clone() throws CloneNotSupportedException {
		CloneDeepAPIs cloneDeep = (CloneDeepAPIs) super.clone();
		/*
		 * clone �������ã��������¡�ؼ�
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
		apIs.setName("ԭ����");
		CloneTest t = new CloneTest();
		t.setAge(1111);
		t.setName("����");
		apIs.setTest(t);
		// print ����ԭ����ʵ�� CloneShallowAPIs{name='ԭ����', test=����[name = ����, age = 1111]}
		System.out.println("����ԭ����ʵ�� " + apIs);
		
		CloneDeepAPIs apIs1;
		try {
			apIs1 = apIs.clone();
			// print ���ǿ�¡���� CloneShallowAPIs{name='ԭ����', test=����[name = ����, age = 1111]}
			System.out.println("���ǿ�¡���� " + apIs1);
			apIs1.setName("��¡����");
			CloneTest t1 = apIs1.getTest();
			t1.setAge(2222);
			t1.setName("����");
			apIs1.setTest(t1);
			
			/*
			 * �����´������Կ������¡���޸Ŀ�¡�õ��Ķ����е����ö��������ֵ�����޸�ԭ��������ö��������ֵ
			 *
			 * */
			{
				// print ����ԭ����ʵ�� CloneShallowAPIs{name='ԭ����', test=����[name = ����, age = 1111]}
				System.out.println("����ԭ����ʵ�� " + apIs);
				// print ���ǿ�¡���� CloneShallowAPIs{name='��¡����', test=����[name = ����, age = 2222]}
				System.out.println("���ǿ�¡���� " + apIs1);
			}
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
