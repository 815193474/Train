package javabase.javacoreII;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author luoGuanzhong @Date 2020-09-05 09:47
 *
 * <p>Stream ��
 *
 * <p>1. �������洢��Ԫ�� ��ЩԪ�ؿ��ܴ洢�ڵײ�ļ����У������ǰ������ɵ�
 *
 * <p>2. ���Ĳ��������޸�������Դ ���磬 filter ����������µ������Ƴ�Ԫ�أ����ǻ� ����һ���µ��������в����������˵���Ԫ��
 *
 * <p>3. ���Ĳ����Ǿ����ܶ���ִ�е� ����ζ��ֱ����Ҫ����ʱ�������Ż�ִ��
 */
public class StreamAPIs {
	
	public static void main(String[] args) {
		String[] str = {"stri", "strin", "s", "st", "str", "string"};
		List<String> list = Arrays.asList(str);
		System.out.println(list.stream().filter(w -> w.length() > 2).count()); // ���� print 4
		System.out.println(list.parallelStream().filter(w -> w.length() > 2).count()); // ���� print 4
		/*
		 * sorted ��ʵ����Comparable�ӿڵ�����������
		 * */
		System.out.println(Arrays.toString(Stream.of(str).sorted().toArray()));
		// print [s, st, str, stri, strin, string]
		
		/*
		 * Array.stream(array, from, to �����Դ�������λ�� from ���������� to ����������Ԫ���д���һ����
		 * */
//    Stream.generate(Math::random); // ������
		
		/*
		 * ?static <T> Collector<T,?,List<T> toList()
		 * ? static <T> Collector<T,?, Set<T> toSet()
		 * ����һ����Ԫ���ռ����б���е� ����
		 * ����ת���ɼ��� stream.collect(Collectors.toList())
		 * */
		List<String> list1 = Stream.of(str).collect(Collectors.toList());
		
		/*
		 * max�������������������ֵ�����ص�Optional������Ч�ı����˿�ָ������
		 * */
		Optional<String> s = Stream.of(str).max(String::compareToIgnoreCase);
		System.out.println(s);
	}
}
