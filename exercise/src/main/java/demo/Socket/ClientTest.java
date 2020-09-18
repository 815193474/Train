package demo.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author luoGuanzhong
 * @since 2020-09-14 16:03
 *
 * 通过socket服务器间接访问百度
 */
public class ClientTest {
	
	public static void main(String[] args) {
		//
		try (Socket socket = new Socket("127.0.0.1", 8000)) {
			Scanner sc = new Scanner(socket.getInputStream(), "UTF-8");
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
//			Scanner scanner = new Scanner(System.in);
//			PrintWriter writer = new PrintWriter(socket.getOutputStream());
//			while (scanner.hasNext()){
//				writer.println(scanner.nextLine());
//				writer.flush();
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
