package demo.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author luoGuanzhong
 * @since 2020-09-14 15:22
 */
public class ChatServer {
	
	private List<Client> clients = new ArrayList<>();
	
	
	/**
	 * ���ܣ�����ChatSever
	 */
	
	public static void main(String[] args) {
		
		new ChatServer().init();
		
	}
	
	
	/**
	 * ���ܣ���chatserver��ʼ��
	 */
	
	private void init() {
		
		System.out.println("�������ѿ���");
		
		// BindException
		
		ServerSocket ss = null;
		
		Socket socket = null;
		
		try {
			
			ss = new ServerSocket(8888);
			
		} catch (BindException e) {
			
			System.out.println("�˿��ѱ�ռ��");
			
			e.printStackTrace();
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
			
		}
		
		try {
			
			Client client = null;
			
			while (true) {
				
				socket = ss.accept();
				
				System.out.println("�ͻ��ݵ�");
				
				client = new Client(socket);
				
				clients.add(client);
				
				new Thread(client).start();
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	
	private class Client implements Runnable {
		
		private Socket socket = null;
		
		InputStream in = null;
		
		DataInputStream din = null;
		
		OutputStream out = null;
		
		DataOutputStream dos = null;
		
		boolean flag = true;
		
		
		public Client(Socket socket) {
			
			this.socket = socket;
			
			try {
				
				in = socket.getInputStream();
				
				din = new DataInputStream(in);
				
			} catch (IOException e) {
				
				System.out.println("������Ϣʧ��");
				
				e.printStackTrace();
				
			}
			
			
		}
		
		
		public void run() {
			
			String message;
			
			try {
				
				while (flag) {
					
					message = din.readUTF();
					
					// System.out.println("�ͻ�˵��" + message);
					
					forwordToAllClients(message);
					
				}
				
			} catch (SocketException e) {
				
				flag = false;
				
				System.out.println("�ͻ�����");
				
				clients.remove(this);
				
				// e.printStackTrace();
				
			} catch (EOFException e) {
				
				flag = false;
				
				System.out.println("�ͻ�����");
				
				clients.remove(this);
				
				// e.printStackTrace();
				
			} catch (IOException e) {
				
				flag = false;
				
				System.out.println("������Ϣʧ��");
				
				clients.remove(this);
				
				e.printStackTrace();
				
			}
			
			if (din != null) {
				
				try {
					
					din.close();
					
				} catch (IOException e) {
					
					System.out.println("din�ر�ʧ��");
					
					e.printStackTrace();
					
				}
				
			}
			
			if (in != null) {
				
				try {
					
					in.close();
					
				} catch (IOException e) {
					
					System.out.println("din�ر�ʧ��");
					
					e.printStackTrace();
					
				}
				
			}
			
			if (socket != null) {
				
				try {
					
					socket.close();
					
				} catch (IOException e) {
					
					System.out.println("din�ر�ʧ��");
					
					e.printStackTrace();
					
				}
				
			}
			
			
		}
		
		
		/**
		 * ���ܣ�ת�������пͻ���
		 */
		
		private void forwordToAllClients(String message) throws IOException {
			
			for (Client c : clients) {
				
				if (c != this) {
					
					out = c.socket.getOutputStream();
					
					dos = new DataOutputStream(out);
					
					forwordToClient(message);
					
				}
				
			}
			
		}
		
		
		/**
		 * ���ܣ����͸�һ���ͻ���
		 */
		
		private void forwordToClient(String message) throws IOException {
			
			dos.writeUTF(message);
			
			dos.flush();
			
			System.out.println("ת���ɹ���");
			
		}
		
		
	}
}
