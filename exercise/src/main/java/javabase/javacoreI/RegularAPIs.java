package javabase.javacoreI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author luoGuanzhong @Date 2020-09-01 16:26
 *
 * <p>������ʽ
 */
public class RegularAPIs {
  /*
  	*
  	* ������ʽ:
    ������ʽ���Ǽ�¼�ı�����Ĵ���
    ����:
      [a-z] ��ʾa��z������һ���ַ�
  	[a-z]+  ��ʾ1������a-z���ַ���ɵ��ַ���

  �ַ�����:
    [abc] a,b,c������һ��
    [^abc] ����a,b,c������һ���ַ�
    [a-z]  a-z������һ���ַ�
    [a-zA-Z0-9]  a-z,A-Z,0-9������һ���ַ�
    [a-z&&[^bc]]  a-z�г���b,c���������һ���ַ�

  Ԥ�����ַ���
   \.  ����һ���ַ�
   \d  ����һ�������ַ� �൱��[0-9]
   \w  �����ַ� �൱��[a-zA-Z0-9_]
   \s  �հ��ַ�[\t\n\r\f]
   \D  �������ַ�
   \W  �ǵ����ַ�
   \S  �ǿհ��ַ�

  ������:
   X? ��ʾ0����һ��X
   X* ��ʾ0����������X
   X+ ��ʾ1����������X (���ڵ���1��X)
   X{n} ��ʾn��X  n����һ������
   X{n,} ��ʾn��X��������X (���ڵ���n��X)
   X{n,m} ��ʾn����m��X

   ����:����6λ����
     [0-9][0-9][0-9][0-9][0-9][0-9]
     \d\d\d\d\d\d
     \d{6}

  ���� ():
    ��ʾ����,���Խ�һϵ��������ʽ������һ������
    �����ǿ���ʹ��"|"��ʾ��Ĺ�ϵ
    ����:
      (\+86|0086)?\s?\d{11}  +86 13800138000 +0086 13800138000
  	(\+86|0086)?\s*\d{11}  +86   13800138000

  ���ƥ��:
    ^ �����ַ����Ŀ�ʼ
    $ �����ַ����Ľ���
  	* */
	public static void main(String[] args) {
		//
		String s = "ssss";
		Pattern pattern = Pattern.compile("[s+]");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.group()); // ��ӡ�Ĵ� s
		}
	
		/*
		 * 	matcher.replaceAll() �滻ƥ�䵽�����еط�
		 * matcher.replaceFirst() ������ֻ�滻ģʽ�ĵ�һ�γ���
		 * */
	}
}
