package demo.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import sun.net.www.protocol.http.HttpURLConnection;

/**
 * @author luoGuanzhong
 * @since 2020-09-14 15:49
 *
 * 通过客户端请求服务器端，服务器端请求百度，返回信息至客户端
 */
public class ServerTest {
	
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(8000)) {
			Socket socket = server.accept();
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			writer.println("Welcome you to here");
			URL url = new URL("http://www.baidu.com");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(connection.getInputStream()));
			while (reader.readLine() != null) {
				writer.println(reader.readLine());
			}
			writer.flush();
			Scanner scanner = new Scanner(socket.getInputStream());
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			connection.disconnect();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
