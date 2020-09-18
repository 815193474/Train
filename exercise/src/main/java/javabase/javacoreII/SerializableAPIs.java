package javabase.javacoreII;

import java.io.ObjectOutputStream.PutField;
import java.io.Serializable;

/**
 * @Author luoGuanzhong
 * @Date 2020-09-08 15:52
 *
 * java 中序列化的学习 Serializable
 */
public class SerializableAPIs implements Serializable {
	/*
	 * java中实现对象序列化 只需要对象实现Serializable接口即可
	 * 使用 ObjectOutputStream 写出
	 * 使用 ObjectInputStream 读入
	 * 1. 序列化与反序列化
	 * 虚拟机是否支持序列化与反序列化主要看1.类路径是否相同;2.功能代码是否相同;3.两个类的序列化的ID是否一致(private static final long serialVersionUID )
	 *	2.静态变量是类持有的，序列化并不保存静态变量
	 *
	 * */
	
}
