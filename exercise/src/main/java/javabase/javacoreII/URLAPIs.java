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
 * URL 和 URI
 */
public class URLAPIs {
	/*
	 * java.net.URL 1.0
	 * ? InputStream openStream()
	 * 打开一个用于读取资源数据的输入流
	 * ? URLConnection open Connection();
	 * 返回一个 URLConnection 对象，该对象负责管理与资源之间的连接
	 *
	 * */
	
	/*
	 * java.net.URLConnection
	 * ?void setConnectTimeout( int timeout) 5 . O
	 * ?int getConnectTimeout() 5. 0
	 * 设置或得到连接超时时限（单位 毫秒） 果在连接建立之前就已经达到了超时的时限，
	 * 那么相关联的输入流 connect 方法就会 出一个 SocketTimeoutException 异常
	 * ?void setReadTimeout(int timeout) 5 . 0
	 * ?int getReadTimeout() 5.0
	 * 设置读取数据的超时时限（单位 毫秒） 如果在一个读操作成功之前就已经达到了超
	 * 时的时限，那么 read 方法就会抛出一个 SocketTimeoutException 异常
	 * ?void setRequestProperty(String key , String value)
	 * 设置请求头的一个字段
	 * ·问ap<String List<String getRequestProperties() 1 . 4
	 * 返回请求头属性的一个映射表 相同的键对应的所有值被放置在同一个列表中
	 * ?void connect()
	 * 连接远程资源并获取响应头信息
	 * ? Map<String, Li st<String > getHeaderFields() 1.4
	 * 返回响应的一个映射表 相同的键对应的所有值被放置在同一个列表中
	 * ?String getHeaderFieldKey( int n)
	 * 得到响应头第n个字段 如果n小于等于0或大于响应头字段的总数， 该方法返回 null 值
	 * ?String getHeaderField( int n)
	 * 得到响应头第n个字段的值 如果n小于等于0或大于响应头字段的总数， 该方法返回 null 值
	 * ?int getContentLength()
	 * 如果内容长度可获得， 返回该长度值，否 返回-1
	 * ? String getContentType()
	 * 获取内容的类型，比 text/plain image/gif
	 * ?String getContentEncoding()
	 * 获取内容的编码机制， gzip 这个值不太常用，因为默认的 identity 编码机制 并不是用 Content-Encoding 头来设定的
	 * ? long getDate()
	 * ?long getExpiration()
	 * long getLastModified()
	 * 获取创建日期、过期日期以及最后一次被修改的日期 这些日期指的是从格林尼治时间1970年1月1日午夜开始计算的秒数
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
//				Base64.getDecoder(); // 解密
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
			System.out.println("getContentType：" + connection.getContentType());
			System.out.println("getContentLength：" + connection.getContentLength());
			System.out.println("getContentEncoding：" + connection.getContentEncoding());
			System.out.println("getDate：" + connection.getDate());
			System.out.println("getExpiration：" + connection.getExpiration());
			System.out.println("getLastModified：" + connection.getLastModified());
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
