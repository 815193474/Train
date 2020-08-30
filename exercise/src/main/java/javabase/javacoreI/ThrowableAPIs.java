package javabase.javacoreI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @Author luoGuanzhong @Date 2020-08-29 09:42
 *
 * <p>�쳣����
 *
 * <p>һ�����������������п����׳����ܲ��쳣�� �����ܲ��쳣Ҫô���ɿ��ƣ� Error), Ҫô��Ӧ�ñ��ⷢ���� RuntimeException)���������û���������п��ܷ������ܲ��쳣��
 * ��
 * �����ͻᷢ��һ��������Ϣ��
 *
 * <p>Throwable ��Ϊ Error �� Exception
 *
 * <p>Exception ��Ϊ IOException �� RuntimeException
 *
 * <p>�������������Ҫ���쳣�����׳�
 *
 * <p>1.����һ���׳��ܖ��쳣�ķ����� ���磬 FileInputStream ������
 *
 * <p>2.�������й����з��ִ��� �������� throw����׳�һ���ܲ��쳣
 *
 * <p>3.������ִ��� ���磬a[-1] =0 ���׳�һ�� ArrayIndexOutOfBoundsException ������ ���ܲ��쳣 ������
 *
 * <p>4.Java �����������ʱ����ֵ��ڲ�����
 */
public class ThrowableAPIs {
	
	private static final Logger myLogger = Logger.getLogger("javabase.javacoreI.LoggerTest");
	
	/*
	 * �Զ����쳣��ֻ��Ҫ������Exception ����������༴��
	 * */
	
	public static void main(String[] args) {
		/*
		 * �����쳣����
		 * */
//	try{
//		FileInputStream stream = new FileInputStream("c:/");
//		Scanner scanner = new Scanner(stream);
//
//	}catch (IOException e){
//		e.printStackTrace();
//	}
		
		/*
		 * printStackTrace �������ʶ�ջ�켣���ı�������Ϣ
		 *  getStackTrace �����õ� StackTraceElement �����һ������
		 *  ��̬�� Thread.getAllStackTrace ������ �����Բ��������̵߳Ķ�ջ�켣
		 * */
		
		/*
		 * ����
		 * assert �ؼ�����������ʽ
		 * assert ����;
		 * ִ��ʱ����������м�⣬ ������Ϊ false, ���׳�һ�� AssertionError �쳣
		 * assert ����: ���ʽ;
		 * ִ��ʱ����������м�⣬ ������Ϊ false, ���׳�һ�� AssertionError �쳣
		 * ���ʽ�������� AssertionError �Ĺ������� ��ת����һ����Ϣ�ַ���
		 *
		 *
		 * */
		
		int x = -1;
//	assert x >= 0;
		assert x >= 0 : x;
		
		/*
		 * global logger ȫ����־��¼��
		 * Logger.getGlobal().info(); �����־
		 *
		 * */
		Logger.getGlobal().info("����ִ��");
		
		/*
		 * Logger.getGlobal().setLevel(Level.OFF)
		 * ������ʵ��ĵط����� main ��ʼ�����ý���ȡ�����е���־��
		 * */
		
		/*
		 * �߼���־
		 * �Զ�����־��¼��
		 * ͨ����չ Handler ��� StreamHandler ���Զ��崦���� Handler�����ڸ����ӵ��Զ��崦����
		 * private static final Logger myLogger = Logger.getLogger("com.mycompany.myapp"):
		 *
		 * */
		
		/*
		 * ͨ���� ������ 7 ����־��¼������
		 * SEVERE
		 * WARNING
		 * INFO
		 * CONFIG
		 * FINE
		 * FINER
		 * FINEST
		 * ��Ĭ������£�ֻ��¼ǰ3������
		 * Ҳ�������������ļ��e logger.setLevel(Level.FINE);FINE �͸��߼���ļ�¼�����Լ�¼����
		 * Level.ALL �������м���ļ�¼ Level.OFF  �ر����м���ļ�¼
		 * */
		myLogger.info("�߼���־֮�Զ�����־��¼��");
		
		/*
		 * ������
		 * ʵ�� filter �ӿڲ����� boolean isLoggab1e(LogRecord record)
		 * */
		
		/*
		 * ��ʽ����
		 * ��Ҫ��չ Formatter �ಢ���� String format(LogRecord record)
		 * */
	}
}
