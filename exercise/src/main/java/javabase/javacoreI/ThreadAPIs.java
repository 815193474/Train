package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-09-03 14:35
 *
 * <p>Thread 线程
 */
public class ThreadAPIs {
	/*
	 * Thread(Runnable target)
	 *	构造一个新线程， 用于调用给定目标的 nm() 方法。
	 *	void start( )
	 *	启动这个线程， 将引发调用 mn() 方法。这个方法将立即返回， 并且新线程将并发运行。
	 *	void run( )
	 *	调用关联 Runnable 的 run 方法。
	 * */
	
	/*
	 *
	 * ? void interrupt()
	 * 向线程发送中断请求。线程的中断状态将被设置为 true。如果目前该线程被一个 sleep
	 * 调用阻塞，那么，InterruptedException 异常被抛出。
	 * ?static boolean interrupted()
	 * 测试当前线程（即正在执行这一命令的线程）是否被中断。注意，这是一个静态方法。
	 * 这一调用会产生副作用—它将当前线程的中断状态重置为 false。
	 * ? boolean isInterrupted()
	 * 测试线程是否被终止。不像静态的中断方法，这一调用不改变线程的中断状态。
	 * ?static Thread currentThread()
	 * 返回代表当前执行线程的 Thread 对象。
	 *
	 *
	 *
	 * */
	
	/*
	 * ?New (新创建）
	 *	?Runnable (可运行）
	 *	?Blocked (被阻塞）
	 *	?Waiting (等待）
	 *	?Timed waiting (计时等待）
	 *	?Terminated (被终止）
	 * */
	
	/*
	 * void join( )
	 *	等待终止指定的线程。
	 *	void join(long millis)
	 *	等待指定的线程死亡或者经过指定的毫秒数。
	 *
	 * */
	
	/*
	 * ?void setPriority(int newPriority)
	 *	设置线程的优先级。优先级必须在 Thread.MIN_PRIORITY 与 Thread.MAX_PRIORITY
	 *	之间。
	 *	?static int MIN_PRIORITY
	 *	线程的最小优先级。最小优先级的值为 1。
	 *	?static int N0RM_PRIORITY
	 *	线程的默认优先级。默认优先级为 5。
	 *
	 * */
	
	/*
	 * ?static int MAX_PRIORITY
	 * 线程的最高优先级。最高优先级的值为 10。
	 * ?static void yield( )
	 * 导致当前执行线程处于让步状态。如果有其他的可运行线程具有至少与此线程同样高
	 * 的优先级，那么这些线程接下来会被调度。注意，这是一个静态方法。
	 *
	 * */
	
	/*
	 * void setDaemon( boolean isDaemon )
	 * 标识该线程为守护线程或用户线程。这一方法必须在线程启动之前调用
	 * */
}
