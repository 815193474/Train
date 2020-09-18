package demo.password;

import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

/**
 * @author luoGuanzhong
 * @since 2020-09-13 13:52
 *
 * 验证码识别
 */
public class PwTest {
	
	public static void main(String[] args) {
		//
		System.out.println(executeTess4J("C:\\Users\\Administrator\\Desktop\\captcha.jpg"));
	}
	
	public static String executeTess4J(String url) {
		String pw = "";
		try {
			ITesseract it = new Tesseract();
			it.setLanguage("eng");
			File file = new File(url);
			pw = it.doOCR(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pw;
	}
}