package javabase.javacoreII;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

/**
 * @Author luoGuanzhong @Date 2020-09-05 14:24
 *
 * <p>InputStream ��
 */
public class IOStreamAPIs {
	
	public static void main(String[] args) {
		//
		
		/*
		 * InputStream
		 * abstract int read();
		 * �������������һ���ֽڣ������ض�����ֽڣ���������������Դ��βʱ����-1
		 * int read(byte[] b)
		 * ����һ���ֽ����飬������ʵ�ʶ�����ֽ����������������������Ľ�βʱ���أ�1����� read ���������� b. length ���ֽ�
		 * long skip(long n)
		 * �������������� n���ֽڣ�����ʵ�� �������ֽ���
		 * void close()
		 * �ر����������
		 * available ()
		 * ���ɶ�������ֽ�
		 * */
		
		/*
		 * OutputStream
		 * abstract void write(int b);
		 * ����ĳ�����λ��д�� 1���ֽ�
		 * void write(byte[] b)
		 * д�������ֽڵ�����b��ȥ
		 * void close()
		 * ��ˢ���ر������
		 * void flush()
		 * ��ˢ������� ���ǽ����л�������ݷ��͵�Ŀ�ĵ�
		 * */
		
		/*
		 * FileInputStream �� FileOutputStream �����ṩ�����ļ��ϵ��������������������ֻ�����乹�����ṩ�ļ������ļ�������·����
		 * FileInputStream(String name)
		 * FileInputStream(File file)
		 * ʹ���� name �ַ����� file ����ָ��·���� ����һ���µ��ļ��� �� �Ǿ��Ե�·��������������� VM ����ʱ�����õĹ���Ŀ¼������
		 *
		 * */
		
		/*
		 * FileOutputStream(String name )
		 * FileOutputStream( File file , boolean append)
		 * FileOutputStream(String name , boolean append)
		 * ��� append ����Ϊ true ����ô���ݽ�����ӵ��ļ�β����������ͬ���ֵ������ļ����ᱻɾ��
		 * */
		
		/*
		 * BufferedInputStream( InputStream in)
		 * BufferedOutputStream( Output Stream out)
		 * ����һ�������������� �������������ڴ����ж����ַ�ʱ������ÿ�ζ����豸���� ��������Ϊ�� �����򻺳����ж���һ���µ����ݿ�
		 *
		 * */
		
		/*
		 * PrintWriter �ı����
		 * �����ӵ�����ı���ʽ��ӡ�ַ��������ֵķ���
		 * PrintWriter(Writer out)
		 * ? PrintWriter(Writer writer)
		 * ����һ���������д����д�����µ� PrintWriter
		 * ? PrintWriter(String filename, String encoding)
		 * ? PrintWriter(Fi le file, String encoding)
		 * ���� ��ʹ�ø����ı��뷽ʽ��������ļ�д�����µ� PrintWriter
		 * ?void print(Object obj)
		 * ͨ����ӡ�� toString �������ַ�������ӡ������
		 * ?void print( String s)
		 * */
		String s = "helloWorld";
		try {
			File file = new File("test.txt");
			FileOutputStream stream = new FileOutputStream(file, true);
			PrintWriter writer = new PrintWriter(stream);
			//      PrintWriter writer = new PrintWriter("test.txt");
			writer.println(s);
			writer.println(s);
			writer.append("append");
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		/*
		 * DataInput
		 * ? boolean readBoolean ( )
		 * ?byte readByte()
		 * ?char readChar()
		 * ?double readDouble()
		 * ?float readFloat()
		 * ?int readInt()
		 * ? long readLong()
		 * ?short readShort()
		 * ����һ���������͵�ֵ
		 * ?void readFully(byte[] b)
		 * ���ֽڶ��뵽�����У�������ֱ�������ֽڶ�����
		 * ���� ���ݶ��˵Ļ�����
		 * ?void readFully(byte[] b, int off, int len)
		 * ���ֽڶ��뵽���� �У��� ����ֱ�������ֽڶ�����
		 *
		 * */
		
		/*
		 * ?void writeBoolean(boolean b)
		 *	? void writeByte( int b)
		 *	? void writeChar( int c)
		 *	?void writeDouble(double d)
		 *	?void writeFloat(float f)
		 *	?void writeInt(int i)
		 *	?void writeLong( long l )
		 *	?void writeShort( int s)
		 *	д��һ���������͵�ֵ
		 *	?void writeChars(String s)
		 *	д���ַ��� �е������ַ�
		 *	?void writeUTF(String s)
		 *	д���ɡ��޶����� UTF ����ʽ���ַ����� �ַ���
		 *
		 * */
		
		
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
	}
}
