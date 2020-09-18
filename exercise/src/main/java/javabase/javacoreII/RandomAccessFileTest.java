package javabase.javacoreII;

import com.alibaba.fastjson.JSON;
import java.io.DataOutput;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * @Author luoGuanzhong
 * @Date 2020-09-08 10:26
 *
 * RandomAccessFile 测试类
 */
public class RandomAccessFileTest {
	
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
