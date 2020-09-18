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
 * <p>java �в����ļ�
 *
 * <p>Path �� Files ����jdk1.7���¼ӵ� ԭ����jdk1.1�е�File
 */
public class FileAPIs {
	
	/*
	 * Paths
	 * static Path get(String first , String ... more)
	 * ͨ������ָ�����ַ�������һ��·��
	 *
	 * Path
	 * ?Path resolve( Path other)
	 *	?Path resolve(String other)
	 *	��� other �Ǿ���·������ô�ͷ��� other ���� ������ͨ������ this other
	 *	�õ�·��
	 *	?Path resolveSibling(Path other)
	 *	?Path resolveSibling(String other)
	 *	��� other �Ǿ���·������ô�ͷ��� other ������ͨ������ th �ĸ�·����
	 *	other ��õ�·��
	 *	?Path relativize(Path other)
	 *	������ this ���н���������� other �����·��
	 *	?Path normalize()
	 *	�Ƴ����磮�ͣ����������·��Ԫ��
	 *	?Path toAbsolutePath()
	 *	�������·���ȼ۵ľ���·��
	 *	?Path getParent()
	 *	���ظ�·���������ڸ�·��û�и� ������ null
	 *	?Path getFileName()
	 *	���ظ�·������� һ�������������ڸ�·��û���κβ���ʱ������ null
	 *	?Path getRoot()
	 *	���ظ�·���ĸ������������ڸ�·��û���κθ�����ʱ������ null
	 *	? toFile()
	 *	�Ӹ�·���� ��һ�� File ����
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
		 * �����ļ�����������
		 * static List<String> readAllLines (Path path, Charset charset)
		 * ���ļ����������ж���
		 * ?static Path write(Path path, byte[] contents, OpenOption ... options)
		 * ?static Path write(Path path, Iterable<? extends CharSequence> contents, OpenOption options)
		 *  ����������д�����ļ��У������� path
		 *  ? static InputStream newInputStream( Path path, OpenOption. . . options)
		 *	?static OutputStream newOutputStream( Path path, OpenOption.options)
		 *	? static BufferedReader newBufferedReader( Path path, Charset charset)
		 *	?static BufferedWriter newBufferedWriter( Path path, Charset charset,OpenOption ... options)
		 * ��һ���ļ������ڶ����д��
		 * */
		Path p = Paths.get("test.txt");
		Charset set = Charset.defaultCharset();
		byte[] bytes = Files.readAllBytes(p); // �����ý��Ϊbytes[] ����
		String content = new String(bytes); // ����������ת��Ϊ�ַ���
		//    System.out.println(content); // ��ӡ���ı�����������
		
		List<String> list = Files.readAllLines(p, set);
		for (String str : list) {
			System.out.println(str); // ��ӡ�ı��е�һ������
		}
		byte[] bytes1 = new byte[10];
		bytes1[0] = 0101;
		//    Files.write(p,bytes1);// �����ԭ�ļ�����
		Files.write(p, bytes, StandardOpenOption.APPEND); // ��Դ�ļ�ĩβ׷��
		List<String> list1 = new ArrayList<>();
		list1.add("test1");
		list1.add("test2");
		Files.write(p, list1); // ������д���ļ���
		
		InputStream input = Files.newInputStream(p); // ����һ��������
		Reader reader = Files.newBufferedReader(p); // ����һ��������
		
		/*
		 * ������Ŀ¼���Ե���
		 * Files.createDirectory(path1);
		 * ����һ�����ļ���
		 * Files.createFile(path1);
		 * �������ļ�
		 * Files.createDirectories(path1);
		 * */
		//		Path path1 = Paths.get("add","s");
		//		Files.createDirectory(path1);
		//		Files.createFile(path1);
		//		Files.createDirectories(path1);
		
		/*
		 * �ļ�����
		 * Files.copy(fromPath, toPath);
		 * �ļ��ƶ�
		 * Files.move(fromPath, toPath);
		 * ���Ʋ������ļ�
		 * Files.copy(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES);
		 * StandardCopyOption.REPLACE_EXISTING
		 * StandardCopyOption.COPY_ATTRIBUTES
		 * ɾ���ļ�
		 * Files.delete(path); ���ɾ�����ļ�����������׳��쳣
		 * Files.deleteIfExists(path); ����ɾ����Ŀ¼ ���ļ������ڻ᷵��false
		 * */
		
		
		/*
		 * �ļ�����
		 * Ҫ����һ���ļ������Ե��� FileChannel ��� lock ���� tryLock ������
		 * */
		FileChannel channel = FileChannel.open(path);
		channel.lock();// �û�����ֱ���ɻ����
		channel.tryLock(); // ��������Ҫô������ Ҫô����null
	}
}
