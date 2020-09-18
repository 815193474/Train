package javabase.javacoreII;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author luoGuanzhong
 * @since 2020-09-11 10:34
 * <p>java网络编程 客户端 和 服务器端
 */
public class SocketAPIs {
	/*
	 * 套接字 socket
	 * ? Socket(String host, int port)
	 *	构建一个套接字，用来连接给定的主机和端口
	 *	? InputStream getInputStream()
	 *	? OutputStream getOutputStream()
	 *	获取可以从套接字中读取数据的流，以及可以向套接字写出数据的流
	 * */
	
	/*
	 * ?Socket() 1.1
	 * 创建一个还未被连接的套接字
	 * ?void connect( SocketAddress address) 1. 4
	 * 将该套接字连接到给定的地址
	 * ?void connect(SocketAddress address, int timeoutInMilliseconds) 1. 4
	 * 将套接字连接到给定的地址 如果在给定的时间内没有响应，则返回
	 * ?void setSoTimeout(int timeoutInMilliseconds) 1.1
	 * 设置该套接字上读请求的阻塞时间 如果超出给定时间，则抛出 InterruptedIOException 异常
	 * ?boolean isConnected() 1. 4
	 * 如果该套接字已被连接，则返回 true
	 * ?boolean isClosed() 1. 4
	 * 如果套接字已经被关闭，则返回 true
	 * */
	
	public static void main(String[] args) throws Exception {
		// 客户端
		try (Socket socket = new Socket("www.baidu.com", 80)) {
			socket.setSoTimeout(2000);
			Scanner in = new Scanner(socket.getInputStream());
			while (in.hasNext()) {
				String s = in.nextLine();
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * InetAddress 类
		 * static InetAddress getByName( String host)
		 * 获取一个ip对象
		 * static InetAddress[] getAllByName(String host)
		 * 获取所有ip对象 (有些网站为了实现负载均衡会有多个网址)
		 * static InetAddress getLocalHost()
		 * 获取本机ip地址对象
		 * byte[] getAddress()
		 * 返回一个包含数字型地址的字节数组
		 *  String getHostAddress ()
		 *  返回一个由十进制数组成的字符串，各数字间用圆点符号隔开，例如，“129.6.15.28“
		 *  String getHostName()
		 *  返回主机名
		 * */
		InetAddress address1 = InetAddress.getByName("taobao.com");
		InetAddress[] address = InetAddress.getAllByName("www.baidu.com");
		for (InetAddress a : address) {
			System.out.println(a.getHostAddress());
			System.out.println(a.getHostName()); // print www.baidu.com
		}
		InetAddress local = InetAddress.getLocalHost();
		System.out.println(local.getHostAddress());
		System.out.println(local.getHostName()); // print P2745O83N3KRUDX
		
		// 服务器端
		ServerSocket server = new ServerSocket(8180); // 创建基于8081端口的套接字
		Socket monitor = server.accept(); // 监控端口 等待连接
		//		monitor.getInputStream(); // 获取输入流
		//		 monitor.getOutputStream(); // 获取输出流
		
		PrintWriter writer = new PrintWriter(monitor.getOutputStream(), true);
		writer.println("Hello, Welcome you !");
		Scanner scanner = new Scanner(monitor.getInputStream());
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
	}
	/*
	 * void shutdownOutput() 1. 3
	 * 将输出流设为“流结束”
	 * void shutdownInput() 1.3
	 *	将输入流设为“流结束”
	 *	boolean isOutputShutdown() 1 . 4
	 *	如果输出已被关闭，则返回 true
	 *	boolean isInputShutdown() 1.4
	 *	如果输入已被关闭，则返回 true
	 * */
}
