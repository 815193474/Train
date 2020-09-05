package javabase.javacoreI;

import java.util.Arrays;

/**
 * @Author luoGuanzhong
 * @Date 2020-09-03 19:37
 *
 * 线程练习，银行存款，经典案例
 */
public class ThreadTest {
	
	private final double[] accounts;
	
	public ThreadTest(int m, double balance) {
		accounts = new double[m];
		Arrays.fill(accounts, balance);
	}
	
	public synchronized void transfer(int form, int to, double amount) throws InterruptedException {
		while (accounts[form] < amount) {
			wait();
		}
		System.out.println(Thread.currentThread());
		accounts[form] -= amount;
		System.out.println("取款账户为" + form + "  取款金额为" + amount + "  当前账户余额为" + accounts[form] + "  总余额为"
				+ getTotalBalance());
		accounts[to] += amount;
		System.out.println("存款账户为" + to + "  存款金额为" + amount + "  当前账户余额为" + accounts[to] + "  总余额为"
				+ getTotalBalance());
		notifyAll();
	}
	
	public double getTotalBalance() {
		double sum = 0;
		for (double d : accounts) {
			sum += d;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//
		ThreadTest test = new ThreadTest(3, 2000);
		try {
			test.transfer(1, 2, 1000);
			test.transfer(2, 1, 1500);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
