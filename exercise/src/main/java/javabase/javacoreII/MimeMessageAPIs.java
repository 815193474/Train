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
 * java 中对邮件的处理
 */
public class MimeMessageAPIs {
	
	public static void main(String[] args) throws Exception {
		/*
		 * Properties该类主要用于读取Java的配置文件,配置文件是以键值对的形式进行参数配置
		 * */
		Properties props = new Properties(); // 存储邮件发送的配置信息
		props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
		props.setProperty("mail.smtp.host", "address");   // 发件人的邮箱的 SMTP 服务器地址
		props.setProperty("mail.smtp.auth", "true");            // 需要请求认证
		
		Session session = Session.getInstance(props); // 根据参数配置，创建会话对象（为了发送邮件准备的）
		MimeMessage message = new MimeMessage(session); // 创建邮件对象
		
		/*根据已有的邮件创建邮件对象
		MimeMessage message = new MimeMessage(session,new FileInputStream("my.email"));
		*/
		/*
		 * 创建发件人
		 * */
		message.setFrom(new InternetAddress("email@qq.com", "testAccount", "UTF-8"));
		
		/*
		 * 收件人
		 * */
		message.setRecipient(RecipientType.TO,
				new InternetAddress("send@163.com", "sendAccount", "utf-8"));
		/*
		 * 增加收件人
		 * */
		message.addRecipient(RecipientType.TO,
				new InternetAddress("send@163.com", "sendAccount", "utf-8"));
		
		/*
		 * 抄送人
		 * */
		message.setRecipient(RecipientType.CC,
				new InternetAddress("send@163.com", "sendAccount", "utf-8"));
		/*
		 * 密送人
		 * */
		message.setRecipient(RecipientType.BCC,
				new InternetAddress("send@163.com", "sendAccount", "utf-8"));
		/*
		 * 邮件主题
		 * */
		message.setSubject("主题", "UTF-8");
		/*
		 * 内容
		 * */
		message.setContent("内容", "text/html;charset=UTF-8");
		/*
		 * 时间
		 * */
		message.setSentDate(new Date());
		/*
		 * 保存以上设置
		 * */
		message.saveChanges();
		
		/*
		 *  根据 Session 获取邮件传输对象
		 * */
		Transport transport = session.getTransport();
		/*
		 * 建立传输连接
		 * */
		transport.connect();
		
		/*
		 * 发件
		 * */
		transport.sendMessage(message, message.getAllRecipients());
		
		/*
		 * 关闭连接
		 * */
		transport.close();
		
	}
}
