package javabase.javacoreI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @Author luoGuanzhong @Date 2020-08-29 09:42
 *
 * <p>异常处理
 *
 * <p>一个方法必须声明所有可能抛出的受查异常， 而非受查异常要么不可控制（ Error), 要么就应该避免发生（ RuntimeException)。如果方法没有声明所有可能发生的受查异常，
 * 编
 * 译器就会发出一个错误消息。
 *
 * <p>Throwable 分为 Error 和 Exception
 *
 * <p>Exception 分为 IOException 和 RuntimeException
 *
 * <p>以下四种情况需要对异常进行抛出
 *
 * <p>1.调用一个抛出受査异常的方法， 例如， FileInputStream 构造器
 *
 * <p>2.程序运行过程中发现错误， 并且利用 throw语句抛出一个受查异常
 *
 * <p>3.程序出现错误， 例如，a[-1] =0 会抛出一个 ArrayIndexOutOfBoundsException 这样的 非受查异常 构造器
 *
 * <p>4.Java 虚拟机和运行时库出现的内部错误
 */
public class ThrowableAPIs {
	
	private static final Logger myLogger = Logger.getLogger("javabase.javacoreI.LoggerTest");
	
	/*
	 * 自定义异常类只需要派生于Exception 类或者其子类即可
	 * */
	
	public static void main(String[] args) {
		/*
		 * 捕获异常案例
		 * */
//	try{
//		FileInputStream stream = new FileInputStream("c:/");
//		Scanner scanner = new Scanner(stream);
//
//	}catch (IOException e){
//		e.printStackTrace();
//	}
		
		/*
		 * printStackTrace 方法访问堆栈轨迹的文本描述信息
		 *  getStackTrace 方法得到 StackTraceElement 对象的一个数组
		 *  静态的 Thread.getAllStackTrace 方法， 它可以产生所有线程的堆栈轨迹
		 * */
		
		/*
		 * 断言
		 * assert 关键字有两种形式
		 * assert 条件;
		 * 执行时会对条件进行检测， 如果结果为 false, 则抛出一个 AssertionError 异常
		 * assert 条件: 表达式;
		 * 执行时会对条件进行检测， 如果结果为 false, 则抛出一个 AssertionError 异常
		 * 表达式将被传人 AssertionError 的构造器， 并转换成一个消息字符串
		 *
		 *
		 * */
		
		int x = -1;
//	assert x >= 0;
		assert x >= 0 : x;
		
		/*
		 * global logger 全局日志记录器
		 * Logger.getGlobal().info(); 输出日志
		 *
		 * */
		Logger.getGlobal().info("测试执行");
		
		/*
		 * Logger.getGlobal().setLevel(Level.OFF)
		 * 如果在适当的地方（如 main 开始）调用将会取消所有的日志。
		 * */
		
		/*
		 * 高级日志
		 * 自定义日志记录器
		 * 通过扩展 Handler 类或 StreamHandler 类自定义处理器 Handler适用于更复杂的自定义处理器
		 * private static final Logger myLogger = Logger.getLogger("com.mycompany.myapp"):
		 *
		 * */
		
		/*
		 * 通常， 有以下 7 个日志记录器级别：
		 * SEVERE
		 * WARNING
		 * INFO
		 * CONFIG
		 * FINE
		 * FINER
		 * FINEST
		 * 在默认情况下，只记录前3个级别
		 * 也可以设置其他的级別 logger.setLevel(Level.FINE);FINE 和更高级别的记录都可以记录下来
		 * Level.ALL 开启所有级别的记录 Level.OFF  关闭所有级别的记录
		 * */
		myLogger.info("高级日志之自定义日志记录器");
		
		/*
		 * 过滤器
		 * 实现 filter 接口并定义 boolean isLoggab1e(LogRecord record)
		 * */
		
		/*
		 * 格式化器
		 * 需要扩展 Formatter 类并覆盖 String format(LogRecord record)
		 * */
	}
}
