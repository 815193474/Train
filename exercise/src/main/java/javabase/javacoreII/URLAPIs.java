package javabase.javacoreII;

import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author luoGuanzhong
 * @since 2020-09-14 10:33
 *
 * URL �� URI
 */
public class URLAPIs {
	/*
	 * java.net.URL 1.0
	 * ? InputStream openStream()
	 * ��һ�����ڶ�ȡ��Դ���ݵ�������
	 * ? URLConnection open Connection();
	 * ����һ�� URLConnection ���󣬸ö������������Դ֮�������
	 *
	 * */
	
	/*
	 * java.net.URLConnection
	 * ?void setConnectTimeout( int timeout) 5 . O
	 * ?int getConnectTimeout() 5. 0
	 * ���û�õ����ӳ�ʱʱ�ޣ���λ ���룩 �������ӽ���֮ǰ���Ѿ��ﵽ�˳�ʱ��ʱ�ޣ�
	 * ��ô������������� connect �����ͻ� ��һ�� SocketTimeoutException �쳣
	 * ?void setReadTimeout(int timeout) 5 . 0
	 * ?int getReadTimeout() 5.0
	 * ���ö�ȡ���ݵĳ�ʱʱ�ޣ���λ ���룩 �����һ���������ɹ�֮ǰ���Ѿ��ﵽ�˳�
	 * ʱ��ʱ�ޣ���ô read �����ͻ��׳�һ�� SocketTimeoutException �쳣
	 * ?void setRequestProperty(String key , String value)
	 * ��������ͷ��һ���ֶ�
	 * ����ap<String List<String getRequestProperties() 1 . 4
	 * ��������ͷ���Ե�һ��ӳ��� ��ͬ�ļ���Ӧ������ֵ��������ͬһ���б���
	 * ?void connect()
	 * ����Զ����Դ����ȡ��Ӧͷ��Ϣ
	 * ? Map<String, Li st<String > getHeaderFields() 1.4
	 * ������Ӧ��һ��ӳ��� ��ͬ�ļ���Ӧ������ֵ��������ͬһ���б���
	 * ?String getHeaderFieldKey( int n)
	 * �õ���Ӧͷ��n���ֶ� ���nС�ڵ���0�������Ӧͷ�ֶε������� �÷������� null ֵ
	 * ?String getHeaderField( int n)
	 * �õ���Ӧͷ��n���ֶε�ֵ ���nС�ڵ���0�������Ӧͷ�ֶε������� �÷������� null ֵ
	 * ?int getContentLength()
	 * ������ݳ��ȿɻ�ã� ���ظó���ֵ���� ����-1
	 * ? String getContentType()
	 * ��ȡ���ݵ����ͣ��� text/plain image/gif
	 * ?String getContentEncoding()
	 * ��ȡ���ݵı�����ƣ� gzip ���ֵ��̫���ã���ΪĬ�ϵ� identity ������� �������� Content-Encoding ͷ���趨��
	 * ? long getDate()
	 * ?long getExpiration()
	 * long getLastModified()
	 * ��ȡ�������ڡ����������Լ����һ�α��޸ĵ����� ��Щ����ָ���ǴӸ�������ʱ��1970��1��1����ҹ��ʼ���������
	 * */
	public static void main(String[] args) {
		//
		args = new String[3];
		args[0] = "http://www.baidu.com";
		args[1] = "admin";
		args[2] = "123456";
		try {
			String urlName;
			if (args.length > 0) {
				urlName = args[0];
			} else {
				urlName = "http://www.baidu.com";
			}
			URL url = new URL(urlName);
			URLConnection connection = url.openConnection();
			
			if (args.length > 2) {
				String userName = args[1];
				String passWord = args[2];
				String input = userName + ":" + passWord;
				byte[] bytes = input.getBytes("UTF-8");
				Base64.Encoder encoder = Base64.getEncoder();
//				Base64.getDecoder(); // ����
				String encoding = encoder.encodeToString(bytes);
				System.out.println(encoding);
				connection.setRequestProperty("Authorization", "Basic" + encoding);
			}
			connection.connect();
			Map<String, List<String>> map = connection.getHeaderFields();
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				String key = entry.getKey();
				for (String value : entry.getValue()) {
					System.out.println(key + " " + value);
				}
			}
			System.out.println("-----------");
			System.out.println("getContentType��" + connection.getContentType());
			System.out.println("getContentLength��" + connection.getContentLength());
			System.out.println("getContentEncoding��" + connection.getContentEncoding());
			System.out.println("getDate��" + connection.getDate());
			System.out.println("getExpiration��" + connection.getExpiration());
			System.out.println("getLastModified��" + connection.getLastModified());
			System.out.println("------------");
			String encoding = connection.getContentEncoding();
			if (encoding == null) {
				encoding = "UTF-8";
			}
			try (Scanner scanner = new Scanner(connection.getInputStream(), encoding)) {
				for (int i = 0; scanner.hasNext() && i < 10; i++) {
					System.out.println(scanner.nextLine());
				}
				if (scanner.hasNext()) {
					System.out.println("...");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
