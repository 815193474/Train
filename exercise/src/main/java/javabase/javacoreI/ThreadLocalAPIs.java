package javabase.javacoreI;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author luoGuanzhong @Date 2020-09-03 21:48
 *
 * <p>������ṩ�ֲ߳̾���������Щ������ͬ�������̣߳�ÿһ���̷߳���һ����ͨ���� get�� set�������Լ������ı�������ʼ������
 *
 * ThreadLocal ͨ������ͬ���ķ���ʵ���˶Զ��߳�����Ľ����ÿ���̶߳��б����Ŀ����������߳�֮�䲻��Ӱ��
 *
 * �������̣߳������̱߳�����ͨ��������Ϊ��̬������
 *
 * ��������ǡ��ռ任ʱ�䡯��synchronized˳��ִ���ǡ�ʱ�任ȡ�ռ䡯
 */
public class ThreadLocalAPIs {
	/*
	 * ?
	 *	T get()
	 *	�õ�����̵߳ĵ�ǰֵ��������״ε��� get, ����� initialize ���õ����ֵ��
	 *	?protected initialize()
	 *	Ӧ��������������ṩһ����ʼֵ��Ĭ������£������������ mill��
	 *	?void set(T t)
	 *	Ϊ����߳�����һ����ֵ��
	 *	?void remove( )
	 *	ɾ����Ӧ����̵߳�ֵ��
	 *	?static <S> ThreadLocal <S> withInitial(Supplier< ? extends S>
	 *	supplier) 8
	 *	����һ���ֲ߳̾������� ���ʼֵͨ�����ø����� supplier ���ɡ�
	 *
	 * */
	
	public static void main(String[] args) {
		/*
		 * ���� ��SimpleDateFormat���ʹ��
		 * */
		ThreadLocal<SimpleDateFormat> local = ThreadLocal
				.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));
		System.out.println(local.get().format(new Date()));
		System.out.println(local.get().format(new Date()));
		
		/*
		 *
		 * ���� ����� Random��ʹ�� Java SE 7 �ṩ��һ��������
		 * ThreadLocalRandom
		 * */
		int random = ThreadLocalRandom.current().nextInt(10);
		System.out.println(random);
	}
}
