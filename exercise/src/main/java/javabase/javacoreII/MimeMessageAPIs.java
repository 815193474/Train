package javabase.javacoreII;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.Date;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

/**
 * @author luoGuanzhong
 * @since 2020-09-14 17:32
 *
 * java �ж��ʼ��Ĵ���
 */
public class MimeMessageAPIs {
	
	public static void main(String[] args) throws Exception {
		/*
		 * Properties������Ҫ���ڶ�ȡJava�������ļ�,�����ļ����Լ�ֵ�Ե���ʽ���в�������
		 * */
		Properties props = new Properties(); // �洢�ʼ����͵�������Ϣ
		props.setProperty("mail.transport.protocol", "smtp");   // ʹ�õ�Э�飨JavaMail�淶Ҫ��
		props.setProperty("mail.smtp.host", "address");   // �����˵������ SMTP ��������ַ
		props.setProperty("mail.smtp.auth", "true");            // ��Ҫ������֤
		
		Session session = Session.getInstance(props); // ���ݲ������ã������Ự����Ϊ�˷����ʼ�׼���ģ�
		MimeMessage message = new MimeMessage(session); // �����ʼ�����
		
		/*�������е��ʼ������ʼ�����
		MimeMessage message = new MimeMessage(session,new FileInputStream("my.email"));
		*/
		/*
		 * ����������
		 * */
		message.setFrom(new InternetAddress("email@qq.com", "testAccount", "UTF-8"));
		
		/*
		 * �ռ���
		 * */
		message.setRecipient(RecipientType.TO,
				new InternetAddress("send@163.com", "sendAccount", "utf-8"));
		/*
		 * �����ռ���
		 * */
		message.addRecipient(RecipientType.TO,
				new InternetAddress("send@163.com", "sendAccount", "utf-8"));
		
		/*
		 * ������
		 * */
		message.setRecipient(RecipientType.CC,
				new InternetAddress("send@163.com", "sendAccount", "utf-8"));
		/*
		 * ������
		 * */
		message.setRecipient(RecipientType.BCC,
				new InternetAddress("send@163.com", "sendAccount", "utf-8"));
		/*
		 * �ʼ�����
		 * */
		message.setSubject("����", "UTF-8");
		/*
		 * ����
		 * */
		message.setContent("����", "text/html;charset=UTF-8");
		/*
		 * ʱ��
		 * */
		message.setSentDate(new Date());
		/*
		 * ������������
		 * */
		message.saveChanges();
		
		/*
		 *  ���� Session ��ȡ�ʼ��������
		 * */
		Transport transport = session.getTransport();
		/*
		 * ������������
		 * */
		transport.connect();
		
		/*
		 * ����
		 * */
		transport.sendMessage(message, message.getAllRecipients());
		
		/*
		 * �ر�����
		 * */
		transport.close();
		
	}
}
