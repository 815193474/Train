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
 * ReentrantReadWriteLock 缓存机制中经常使用的 可重入读写锁 非阻塞
 */
public class ReentrantReadWriteLockAPIs {
	
	static ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
	/*
	 * 在写方法和读方法分开使用两把锁
	 * */
	private final static Lock readLock = lock.readLock();
	private final static Lock writeLock = lock.writeLock();
	private final static ArrayList<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		// 利用线程调用 write 方法
//		new Thread(()-> {
//			try {
//				write();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}).start();
//		// 利用新线程嗲用 read 方法
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
			writeLock.lock(); // 获取写数据的锁
			list.add("写数据");
			System.out.println(Thread.currentThread() + " 写数据");
			TimeUnit.SECONDS.sleep(2); // 睡眠2秒钟
		} finally {
			writeLock.unlock(); // 释放锁
		}
	}
	
	public static void read() throws InterruptedException {
		try {
			readLock.lock();// 获取读数据的锁
			System.out.println(Thread.currentThread() + " 读数据");
			for (String s : list) {
				System.out.println(s);
			}
			TimeUnit.SECONDS.sleep(2); // 睡眠两秒钟
		} finally {
			readLock.unlock(); // 释放锁
		}
	}
	
	// 锁升级
	public static void writeAndRead() throws InterruptedException {
		
		readLock.lock();
		String s = null;
		for (String l : list) {
			s = l;
		}
		if (s == null) {
			System.out.println("还没有数据，先写数据");
			readLock.unlock();
			writeLock.lock();
			System.out.println(Thread.currentThread() + "写数据");
			list.add("ooo");
			writeLock.unlock();
			readLock.lock();
			System.out.println(Thread.currentThread() + "读数据");
			for (String l : list) {
				s = l;
			}
		}
		System.out.println(s);
		readLock.unlock();
	}
}
