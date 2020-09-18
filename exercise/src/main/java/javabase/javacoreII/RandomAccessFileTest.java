package javabase.javacoreII;

import com.alibaba.fastjson.JSON;
import java.io.DataOutput;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * @Author luoGuanzhong
 * @Date 2020-09-08 10:26
 *
 * RandomAccessFile ������
 */
public class RandomAccessFileTest {
	
	/*
	 * ? RandomAccessFile(String file, String mode)
	 *	? RandomAccessFile(File file, String mode)
	 *	������ file Ҫ�򿪵��ļ�
	 *	mode ����ʾֻ��ģʽ���� rw ����ʾ����дģʽ��
	 *	�� rws ����ʾÿ�θ���ʱ���������ݺ�Ԫ���ݵ�д���̲�������ͬ���Ķ���дģʽ��
	 *	�� rwd	��ʾÿ�θ���ʱ��ֻ�����ݵ�д���̲�������ͬ���Ķ���дģʽ
	 *	? long getFilePointer()
	 *	�����ļ�ָ��ĵ�ǰλ��
	 *	?void seek(long pos)
	 *	���ļ�ָ�����õ����ļ���ͷ pos ���ֽڴ�
	 *	? long length()
	 *	�����ļ������ֽ��������ĳ���
	 *
	 *
	 * */
	public static void main(String[] args) throws Exception {
		Test[] tests = new Test[3];
		tests[0] = new Test(1, "test1");
		tests[1] = new Test(2, "test2");
		tests[2] = new Test(3, "test3");
		
		RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
//		for (Test t:tests){
////			file.seek(file.length()-1);
////			file.writeChars(t.getId()+" "+t.getName());
//			file.writeUTF(t.getId()+" "+t.getName());
//		}
		
		while (file.readLine() != null) {
			System.out.println(file.read());
		}
	}
	
	static class Test {
		
		private int id;
		private String name;
		
		public Test(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Test{" +
					"id=" + id +
					", name='" + name + '\'' +
					'}';
		}
	}
}
