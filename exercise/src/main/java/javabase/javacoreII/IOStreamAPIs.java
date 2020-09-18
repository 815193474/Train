package javabase.javacoreII;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

/**
 * @Author luoGuanzhong @Date 2020-09-05 14:24
 *
 * <p>InputStream 流
 */
public class IOStreamAPIs {
	
	public static void main(String[] args) {
		//
		
		/*
		 * InputStream
		 * abstract int read();
		 * 这个方法将读人一个字节，并返回读入的字节，或者在遇到输入源结尾时返回-1
		 * int read(byte[] b)
		 * 读人一个字节数组，并返回实际读入的字节数，或者在碰到输入流的结尾时返回－1，这个 read 方法最多读入 b. length 个字节
		 * long skip(long n)
		 * 在输入流中跳过 n个字节，返回实际 跳过的字节数
		 * void close()
		 * 关闭这个输入流
		 * available ()
		 * 检查可读入多少字节
		 * */
		
		/*
		 * OutputStream
		 * abstract void write(int b);
		 * 以向某个输出位置写出 1个字节
		 * void write(byte[] b)
		 * 写出所有字节到数组b中去
		 * void close()
		 * 冲刷并关闭输出流
		 * void flush()
		 * 冲刷输出流， 就是将所有缓冲的数据发送到目的地
		 * */
		
		/*
		 * FileInputStream 和 FileOutputStream 可以提供磁盘文件上的输入流和输出流，而你只需向其构造器提供文件名或文件的完整路径名
		 * FileInputStream(String name)
		 * FileInputStream(File file)
		 * 使用由 name 字符串或 file 对象指定路径名 倒建一个新的文件输 流 非绝对的路径名将按照相对于 VM 启动时所设置的工作目录来解析
		 *
		 * */
		
		/*
		 * FileOutputStream(String name )
		 * FileOutputStream( File file , boolean append)
		 * FileOutputStream(String name , boolean append)
		 * 如果 append 参数为 true ，那么数据将被添加到文件尾，而具有相同名字的已有文件不会被删除
		 * */
		
		/*
		 * BufferedInputStream( InputStream in)
		 * BufferedOutputStream( Output Stream out)
		 * 创建一个带缓冲区的流 带缓冲区的流在从流中读入字符时，不会每次都对设备访问 当缓冲区为空 ，会向缓冲区中读入一个新的数据块
		 *
		 * */
		
		/*
		 * PrintWriter 文本输出
		 * 这个类拥有以文本格式打印字符串和数字的方法
		 * PrintWriter(Writer out)
		 * ? PrintWriter(Writer writer)
		 * 创建一个向给定的写出器写出的新的 PrintWriter
		 * ? PrintWriter(String filename, String encoding)
		 * ? PrintWriter(Fi le file, String encoding)
		 * 创建 个使用给定的编码方式向给定的文件写出的新的 PrintWriter
		 * ?void print(Object obj)
		 * 通过打印从 toString 产生的字符串来打印个对象
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
		 * 读入一个给定类型的值
		 * ?void readFully(byte[] b)
		 * 将字节读入到数组中，其阻塞直至所有字节都读入
		 * 参数 数据读人的缓冲区
		 * ?void readFully(byte[] b, int off, int len)
		 * 将字节读入到数组 中，其 阻塞直至所有字节都读入
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
		 *	写出一个给定类型的值
		 *	?void writeChars(String s)
		 *	写出字符串 中的所有字符
		 *	?void writeUTF(String s)
		 *	写出由“修订过的 UTF ”格式的字符构成 字符串
		 *
		 * */
		
		
		/*
		 * ? RandomAccessFile(String file, String mode)
		 *	? RandomAccessFile(File file, String mode)
		 *	参数： file 要打开的文件
		 *	mode ”表示只读模式；“ rw ”表示读／写模式；
		 *	“ rws ”表示每次更新时，都对数据和元数据的写磁盘操作进行同步的读／写模式；
		 *	“ rwd	表示每次更新时，只对数据的写磁盘操作进行同步的读／写模式
		 *	? long getFilePointer()
		 *	返回文件指针的当前位置
		 *	?void seek(long pos)
		 *	将文件指针设置到距文件开头 pos 个字节处
		 *	? long length()
		 *	返回文件按照字节来度量的长度
		 *
		 *
		 * */
	}
}
