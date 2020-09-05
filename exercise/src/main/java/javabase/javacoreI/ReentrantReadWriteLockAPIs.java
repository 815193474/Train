package javabase.javacoreI;


import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author luoGuanzhong
 * @Date 2020-09-04 10:31
 *
 * ReentrantReadWriteLock ��������о���ʹ�õ� �������д�� ������
 */
public class ReentrantReadWriteLockAPIs {
	
	static ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
	/*
	 * ��д�����Ͷ������ֿ�ʹ��������
	 * */
	private final static Lock readLock = lock.readLock();
	private final static Lock writeLock = lock.writeLock();
	private final static ArrayList<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		// �����̵߳��� write ����
//		new Thread(()-> {
//			try {
//				write();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}).start();
//		// �������߳����� read ����
//		new Thread(()-> {
//			try {
//				read();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}).start();
		
		for (int i = 0; i < 4; i++) {
			//
			new Thread(() -> {
				try {
					writeAndRead();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}).start();
		}
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.equals("2020-09-04"));
	}
	
	public static void write() throws InterruptedException {
		try {
			writeLock.lock(); // ��ȡд���ݵ���
			list.add("д����");
			System.out.println(Thread.currentThread() + " д����");
			TimeUnit.SECONDS.sleep(2); // ˯��2����
		} finally {
			writeLock.unlock(); // �ͷ���
		}
	}
	
	public static void read() throws InterruptedException {
		try {
			readLock.lock();// ��ȡ�����ݵ���
			System.out.println(Thread.currentThread() + " ������");
			for (String s : list) {
				System.out.println(s);
			}
			TimeUnit.SECONDS.sleep(2); // ˯��������
		} finally {
			readLock.unlock(); // �ͷ���
		}
	}
	
	// ������
	public static void writeAndRead() throws InterruptedException {
		
		readLock.lock();
		String s = null;
		for (String l : list) {
			s = l;
		}
		if (s == null) {
			System.out.println("��û�����ݣ���д����");
			readLock.unlock();
			writeLock.lock();
			System.out.println(Thread.currentThread() + "д����");
			list.add("ooo");
			writeLock.unlock();
			readLock.lock();
			System.out.println(Thread.currentThread() + "������");
			for (String l : list) {
				s = l;
			}
		}
		System.out.println(s);
		readLock.unlock();
	}
}
