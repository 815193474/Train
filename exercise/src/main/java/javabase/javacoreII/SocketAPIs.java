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
 * <p>java������ �ͻ��� �� ��������
 */
public class SocketAPIs {
	/*
	 * �׽��� socket
	 * ? Socket(String host, int port)
	 *	����һ���׽��֣��������Ӹ����������Ͷ˿�
	 *	? InputStream getInputStream()
	 *	? OutputStream getOutputStream()
	 *	��ȡ���Դ��׽����ж�ȡ���ݵ������Լ��������׽���д�����ݵ���
	 * */
	
	/*
	 * ?Socket() 1.1
	 * ����һ����δ�����ӵ��׽���
	 * ?void connect( SocketAddress address) 1. 4
	 * �����׽������ӵ������ĵ�ַ
	 * ?void connect(SocketAddress address, int timeoutInMilliseconds) 1. 4
	 * ���׽������ӵ������ĵ�ַ ����ڸ�����ʱ����û����Ӧ���򷵻�
	 * ?void setSoTimeout(int timeoutInMilliseconds) 1.1
	 * ���ø��׽����϶����������ʱ�� �����������ʱ�䣬���׳� InterruptedIOException �쳣
	 * ?boolean isConnected() 1. 4
	 * ������׽����ѱ����ӣ��򷵻� true
	 * ?boolean isClosed() 1. 4
	 * ����׽����Ѿ����رգ��򷵻� true
	 * */
	
	public static void main(String[] args) throws Exception {
		// �ͻ���
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
		 * InetAddress ��
		 * static InetAddress getByName( String host)
		 * ��ȡһ��ip����
		 * static InetAddress[] getAllByName(String host)
		 * ��ȡ����ip���� (��Щ��վΪ��ʵ�ָ��ؾ�����ж����ַ)
		 * static InetAddress getLocalHost()
		 * ��ȡ����ip��ַ����
		 * byte[] getAddress()
		 * ����һ�����������͵�ַ���ֽ�����
		 *  String getHostAddress ()
		 *  ����һ����ʮ��������ɵ��ַ����������ּ���Բ����Ÿ��������磬��129.6.15.28��
		 *  String getHostName()
		 *  ����������
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
		
		// ��������
		ServerSocket server = new ServerSocket(8180); // ��������8081�˿ڵ��׽���
		Socket monitor = server.accept(); // ��ض˿� �ȴ�����
		//		monitor.getInputStream(); // ��ȡ������
		//		 monitor.getOutputStream(); // ��ȡ�����
		
		PrintWriter writer = new PrintWriter(monitor.getOutputStream(), true);
		writer.println("Hello, Welcome you !");
		Scanner scanner = new Scanner(monitor.getInputStream());
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
	}
	/*
	 * void shutdownOutput() 1. 3
	 * ���������Ϊ����������
	 * void shutdownInput() 1.3
	 *	����������Ϊ����������
	 *	boolean isOutputShutdown() 1 . 4
	 *	�������ѱ��رգ��򷵻� true
	 *	boolean isInputShutdown() 1.4
	 *	��������ѱ��رգ��򷵻� true
	 * */
}
