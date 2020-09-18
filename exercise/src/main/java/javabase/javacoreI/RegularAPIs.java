package javabase.javacoreI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author luoGuanzhong @Date 2020-09-01 16:26
 *
 * <p>正则表达式
 */
public class RegularAPIs {
  /*
  	*
  	* 正则表达式:
    正则表达式就是记录文本规则的代码
    比如:
      [a-z] 表示a到z的任意一个字符
  	[a-z]+  表示1个或多个a-z的字符组成的字符串

  字符集合:
    [abc] a,b,c中任意一个
    [^abc] 除了a,b,c的任意一个字符
    [a-z]  a-z中任意一个字符
    [a-zA-Z0-9]  a-z,A-Z,0-9中任意一个字符
    [a-z&&[^bc]]  a-z中除了b,c以外的任意一个字符

  预定义字符集
   \.  任意一个字符
   \d  任意一个数字字符 相当于[0-9]
   \w  单词字符 相当于[a-zA-Z0-9_]
   \s  空白字符[\t\n\r\f]
   \D  非数字字符
   \W  非单词字符
   \S  非空白字符

  数量词:
   X? 表示0个或一个X
   X* 表示0个或任意多个X
   X+ 表示1个到任意多个X (大于等于1个X)
   X{n} 表示n个X  n代表一个数字
   X{n,} 表示n个X到任意多个X (大于等于n个X)
   X{n,m} 表示n个到m个X

   比如:定义6位数字
     [0-9][0-9][0-9][0-9][0-9][0-9]
     \d\d\d\d\d\d
     \d{6}

  分组 ():
    表示分组,可以将一系列正则表达式看做是一个整体
    分组是可以使用"|"表示或的关系
    比如:
      (\+86|0086)?\s?\d{11}  +86 13800138000 +0086 13800138000
  	(\+86|0086)?\s*\d{11}  +86   13800138000

  便捷匹配:
    ^ 代表字符串的开始
    $ 代表字符串的结束
  	* */
	public static void main(String[] args) {
		//
		String s = "ssss";
		Pattern pattern = Pattern.compile("[s+]");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.group()); // 打印四次 s
		}
	
		/*
		 * 	matcher.replaceAll() 替换匹配到的所有地方
		 * matcher.replaceFirst() 方法将只替换模式的第一次出现
		 * */
	}
}
