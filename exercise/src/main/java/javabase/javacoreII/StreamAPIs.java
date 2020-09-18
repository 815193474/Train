package javabase.javacoreII;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author luoGuanzhong @Date 2020-09-05 09:47
 *
 * <p>Stream 流
 *
 * <p>1. 流并不存储其元素 这些元素可能存储在底层的集合中，或者是按需生成的
 *
 * <p>2. 流的操作不会修改其数据源 例如， filter 方法不会从新的流中移除元素，而是会 生成一个新的流，其中不包含被过滤掉的元素
 *
 * <p>3. 流的操作是尽可能惰性执行的 这意味着直至需要其结果时，操作才会执行
 */
public class StreamAPIs {
	
	public static void main(String[] args) {
		String[] str = {"stri", "strin", "s", "st", "str", "string"};
		List<String> list = Arrays.asList(str);
		System.out.println(list.stream().filter(w -> w.length() > 2).count()); // 串行 print 4
		System.out.println(list.parallelStream().filter(w -> w.length() > 2).count()); // 并行 print 4
		/*
		 * sorted 对实现了Comparable接口的流进行排序
		 * */
		System.out.println(Arrays.toString(Stream.of(str).sorted().toArray()));
		// print [s, st, str, stri, strin, string]
		
		/*
		 * Array.stream(array, from, to ）可以从数组中位于 from （包括）和 to 不包括）的元素中创建一个流
		 * */
//    Stream.generate(Math::random); // 无限流
		
		/*
		 * ?static <T> Collector<T,?,List<T> toList()
		 * ? static <T> Collector<T,?, Set<T> toSet()
		 * 产生一个将元素收集到列表或集中的 集器
		 * 将流转换成集合 stream.collect(Collectors.toList())
		 * */
		List<String> list1 = Stream.of(str).collect(Collectors.toList());
		
		/*
		 * max方法根据条件返回最大值，返回的Optional对象有效的避免了空指针问题
		 * */
		Optional<String> s = Stream.of(str).max(String::compareToIgnoreCase);
		System.out.println(s);
	}
}
