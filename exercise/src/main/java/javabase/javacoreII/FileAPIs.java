package javabase.javacoreII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author luoGuanzhong @Date 2020-09-08 16:09
 *
 * <p>java 中操作文件
 *
 * <p>Path 和 Files 是在jdk1.7中新加的 原来是jdk1.1中的File
 */
public class FileAPIs {
	
	/*
	 * Paths
	 * static Path get(String first , String ... more)
	 * 通过连接指定的字符串创建一个路径
	 *
	 * Path
	 * ?Path resolve( Path other)
	 *	?Path resolve(String other)
	 *	如果 other 是绝对路径，那么就返回 other ；否 ，返回通过连接 this other
	 *	得的路径
	 *	?Path resolveSibling(Path other)
	 *	?Path resolveSibling(String other)
	 *	如果 other 是绝对路径，那么就返回 other ，返回通过连接 th 的父路径和
	 *	other 获得的路径
	 *	?Path relativize(Path other)
	 *	返回用 this 进行解析，相对于 other 的相对路径
	 *	?Path normalize()
	 *	移除诸如．和．．等冗余的路径元素
	 *	?Path toAbsolutePath()
	 *	返回与该路径等价的绝对路径
	 *	?Path getParent()
	 *	返回父路径，或者在该路径没有父 ，返回 null
	 *	?Path getFileName()
	 *	返回该路径的最后 一个部件，或者在该路径没有任何部件时，返回 null
	 *	?Path getRoot()
	 *	返回该路径的根部件，或者在该路径没有任何根部件时，返回 null
	 *	? toFile()
	 *	从该路径中 建一个 File 对象
	 *
	 * */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("test.txt");
		System.out.println(path); // print test.txt
		Path parent = path.getParent();
		System.out.println(parent); // print null
		Path root = path.getRoot();
		System.out.println(root); // print null
		Path rs = path.resolve("test1.txt");
		System.out.println(rs); // print test.txt\test1.txt
		
		/*
		 * Files
		 * static byte[] readAllBytes(Path path)
		 * 读入文件的所有内容
		 * static List<String> readAllLines (Path path, Charset charset)
		 * 将文件当作行序列读入
		 * ?static Path write(Path path, byte[] contents, OpenOption ... options)
		 * ?static Path write(Path path, Iterable<? extends CharSequence> contents, OpenOption options)
		 *  将给定内容写出到文件中，并返回 path
		 *  ? static InputStream newInputStream( Path path, OpenOption. . . options)
		 *	?static OutputStream newOutputStream( Path path, OpenOption.options)
		 *	? static BufferedReader newBufferedReader( Path path, Charset charset)
		 *	?static BufferedWriter newBufferedWriter( Path path, Charset charset,OpenOption ... options)
		 * 打开一个文件，用于读入或写出
		 * */
		Path p = Paths.get("test.txt");
		Charset set = Charset.defaultCharset();
		byte[] bytes = Files.readAllBytes(p); // 读到得结果为bytes[] 数组
		String content = new String(bytes); // 将读到数组转换为字符串
		//    System.out.println(content); // 打印了文本内所有内容
		
		List<String> list = Files.readAllLines(p, set);
		for (String str : list) {
			System.out.println(str); // 打印文本中的一行数据
		}
		byte[] bytes1 = new byte[10];
		bytes1[0] = 0101;
		//    Files.write(p,bytes1);// 会清除原文件内容
		Files.write(p, bytes, StandardOpenOption.APPEND); // 在源文件末尾追加
		List<String> list1 = new ArrayList<>();
		list1.add("test1");
		list1.add("test2");
		Files.write(p, list1); // 将集合写入文件中
		
		InputStream input = Files.newInputStream(p); // 创建一个输入流
		Reader reader = Files.newBufferedReader(p); // 创建一个读入器
		
		/*
		 * 创建新目录可以调用
		 * Files.createDirectory(path1);
		 * 创建一个空文件：
		 * Files.createFile(path1);
		 * 创建多文件
		 * Files.createDirectories(path1);
		 * */
		//		Path path1 = Paths.get("add","s");
		//		Files.createDirectory(path1);
		//		Files.createFile(path1);
		//		Files.createDirectories(path1);
		
		/*
		 * 文件复制
		 * Files.copy(fromPath, toPath);
		 * 文件移动
		 * Files.move(fromPath, toPath);
		 * 复制并覆盖文件
		 * Files.copy(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES);
		 * StandardCopyOption.REPLACE_EXISTING
		 * StandardCopyOption.COPY_ATTRIBUTES
		 * 删除文件
		 * Files.delete(path); 如果删除的文件不存在则会抛出异常
		 * Files.deleteIfExists(path); 可以删除空目录 如文件不存在会返回false
		 * */
		
		
		/*
		 * 文件加锁
		 * 要锁定一个文件，可以调用 FileChannel 类的 lock 或者 tryLock 方法：
		 * */
		FileChannel channel = FileChannel.open(path);
		channel.lock();// 用会阻塞直至可获得锁
		channel.tryLock(); // 立即返回要么返回锁 要么返回null
	}
}
