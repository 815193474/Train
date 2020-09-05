package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-30 21:47
 *
 * <p>Collection 集合
 *
 * <p>java.util.Collection 是一个集合接口（集合类的一个顶级接口）。它提供了对集合对象进行基本操作的通用接口方法
 */
public class CollectionAPIs {

  /*
  * 数组与集合的区别
  	长度区别
  		数组的长度是固定的
  		集合的长度是可变的。
  	存储数据类型的区别
  		数组可以存储基本数据类型，也可以存储引用数据类型
  		集合只能存储引用数据类型
  	内容区别
  		数组只能存储同种类型的数据
  		集合可以存储不同类型的元素
  *
  * */

  /*
  Collection 集合：
   * boolean add(Object obj):添加一个元素
   * boolean addAll(Collection c):添加一个集合的元素 (给一个集合添加进另一个集合中的所有元素)
   * void clear():移除所有元素
   * boolean remove(Object o):移除一个元素
   * boolean removeAll(Collection c):移除一个集合的元素(移除一个以上返回的就是true) 删除的元素是两个集合的交集元素
   * boolean contains(Object o)：判断集合中是否包含指定的元素
   * boolean containsAll(Collection c)：
   * 判断集合中是否包含指定的集合元素(这个集合 包含 另一个集合中所有的元素才算包含 才返回true)
   * boolean isEmpty()：判断集合是否为空
   * boolean retainAll(Collection c):获取两个集合的交集元素(交集：两个集合都有的元素)
   * 注意 ：A集合对B集合取交集，获取到的交集元素在A集合中。返回的布尔值表示的是A集合是否发生变化
   * Object[] toArray() 把集合转换为数组
   * int size():元素的个数（长度功能）
   * Iterator <E> iterator() 返回一个用于访问集合中每个元素的迭代器。
   * default boolean removeIf(Predicate<? super E> filter)
   * 从这个集合删除 filter 返回 true 的所有元素。如果由于这个调用改变了集合， 则返回 true。
   * */
	
	/*
	 * 所有集合
	 * ArrayList											一种可以动态增长和缩减的索引序列
	 * LinkedList											一种可以在任何位置进行高效地插人和删除操作的有序序列
	 * ArrayDeque											一种用循环数组实现的双端队列
	 * HashSet												一种没有重复元素的无序集合
	 * TreeSet												—种有序集
	 * EnumSet												一种包含枚举类型值的集
	 * LinkedHashSet									一种可以记住元素插人次序的集
	 * PriorityQueue									一种允许高效删除最小元素的集合
	 * HashMap												一种存储键 / 值关联的数据结构
	 * TreeMap												—种键值有序排列的映射表
	 * EnumMap												一种键值属于枚举类型的映射表
	 * LinkedHashMap									一种可以记住键 / 值项添加次序的映射表
	 * WeakHashMap										一种其值无用武之地后可以被垃圾回收器回收的映射表
	 * IdentityHashMap								一种用 = 而不是用 equals 比较键值的映射表
	 *
	 *
	 * */
	
}
