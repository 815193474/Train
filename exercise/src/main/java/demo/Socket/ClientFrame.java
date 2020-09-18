package demo.Socket;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

/**
 * @author luoGuanzhong
 * @since 2020-09-14 15:18
 */
public class ClientFrame extends JFrame {
	
	private TextField textFieldContent = new TextField();
	
	private TextArea textAreaContent = new TextArea();
	
	private Socket socket = null;
	
	private OutputStream out = null;
	
	private DataOutputStream dos = null;
	
	private InputStream in = null;
	
	private DataInputStream dis = null;
	
	private boolean flag = false;
	
	
	/**
	 * �����ͻ��˳���
	 */
	
	public static void main(String[] args) {
		
		new ClientFrame().init();
		
	}
	
	
	/**
	 * ���ܣ��Դ��ڽ��г�ʼ��
	 */
	
	private void init() {
		this.setSize(300, 300);
		setLocation(250, 150);
		setVisible(true);
		setTitle("WeChatRoom");
		
		// ��ӿؼ�
		this.add(textAreaContent);
		this.add(textFieldContent, BorderLayout.SOUTH);
		textAreaContent.setFocusable(false);
		pack();
		
		// �ر��¼�
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("�û���ͼ�رմ���");
				disconnect();
				System.exit(0);
			}
		});
		
		// textFieldContent��ӻس��¼�
		
		textFieldContent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClickEnter();
			}
		});
		// ��������
		connect();
		new Thread(new ReciveMessage()).start();
	}
	
	
	private class ReciveMessage implements Runnable {
		
		@Override
		public void run() {
			flag = true;
			try {
				while (flag) {
					String message = dis.readUTF();
					textAreaContent.append(message + "\n");
				}
			} catch (EOFException e) {
				flag = false;
				System.out.println("�ͻ����ѹر�");
				// e.printStackTrace();
			} catch (SocketException e) {
				flag = false;
				System.out.println("�ͻ����ѹر�");
				// e.printStackTrace();
			} catch (IOException e) {
				flag = false;
				System.out.println("������Ϣʧ��");
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	/**
	 * ���ܣ�������س�ʱ�����¼�
	 */
	
	private void onClickEnter() {
		
		String message = textFieldContent.getText().trim();
		
		if (message != null && !message.equals("")) {
			
			String time = new SimpleDateFormat("h:m:s").format(new Date());
			
			textAreaContent.append(Thread.currentThread() + time + "\n" + message + "\n");
			
			textFieldContent.setText("");
			
			sendMessageToServer(message);
			
		}
		
	}
	
	
	/**
	 * ���ܣ���������������Ϣ
	 */
	
	private void sendMessageToServer(String message) {
		
		try {
			
			dos.writeUTF(message);
			
			dos.flush();
			
		} catch (IOException e) {
			
			System.out.println("������Ϣʧ��");
			
			e.printStackTrace();
			
		}
		
	}
	
	
	/**
	 * ���ܣ�����socket����
	 */
	
	private void connect() {
		
		try {
			
			socket = new Socket("localhost", 8888);
			
			out = socket.getOutputStream();
			
			dos = new DataOutputStream(out);
			
			in = socket.getInputStream();
			
			dis = new DataInputStream(in);
			
		} catch (UnknownHostException e) {
			
			System.out.println("��������ʧ��");
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("��������ʧ��");
			
			e.printStackTrace();
			
		}
		
	}
	
	
	/**
	 * ���ܣ��ر���������
	 */
	
	private void disconnect() {
		
		flag = false;
		
		if (dos != null) {
			
			try {
				
				dos.close();
				
			} catch (IOException e) {
				
				System.out.println("dos�ر�ʧ��");
				
				e.printStackTrace();
				
			}
			
		}
		
		if (out != null) {
			
			try {
				
				out.close();
				
			} catch (IOException e) {
				
				System.out.println("dos�ر�ʧ��");
				
				e.printStackTrace();
				
			}
			
		}
		
		if (socket != null) {
			
			try {
				
				socket.close();
				
			} catch (IOException e) {
				
				System.out.println("socket�ر�ʧ��");
				
				e.printStackTrace();
				
			}
			
			;
			
		}
		
	}
	
	
}
