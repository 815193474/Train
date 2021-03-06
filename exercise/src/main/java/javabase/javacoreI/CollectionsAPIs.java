package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-30 22:06
 *
 * <p>Collections
 *
 * <p>是集合类的一个工具类/帮助类，其中提供了一系列静态方法，用于对集合中元素进行排序、搜索以及线程安全等各种操作。
 */
public class CollectionsAPIs {
	/*
	 * 1) 排序(Sort)
	 * 使用sort方法可以根据元素的自然顺序 对指定列表按升序进行排序。
	 * 列表中的所有元素都必须实现 Comparable 接口。
	 * 此列表内的所有元素都必须是使用指定比较器可相互比较的
	 *
	 * */
	
	/*
	 * 2) 混排（Shuffling）
	 * 混排算法所做的正好与 sort 相反: 它打乱在一个 List 中可能有的任何排列的踪迹。
	 * 也就是说，基于随机源的输入重排该 List, 这样的排列具有相同的可能性（假设随机源是公正的）。
	 * 这个算法在实现一个碰运气的游戏中是非常有用的。例如，它可被用来混排代表一副牌的 Card 对象的一个 List 。
	 * 另外，在生成测试案例时，它也是十分有用的。
	 *
	 * */
	
	/*
	 * 3) 反转(Reverse)
	 * 使用Reverse方法可以根据元素的自然顺序 对指定列表按降序进行排序。
	 * Collections.reverse(list)
	 * */
	
	/*
	 * 替换所有的元素(Fill)
	 * 使用指定元素替换指定列表中的所有元素。
	 * Collections.fill(li,"aaa");
	 * */
	
	/*
	 * 5) 拷贝(Copy)
	 * 用两个参数，一个目标 List 和一个源 List, 将源的元素拷贝到目标，并覆盖它的内容。目标 List 至少与源一样长。
	 * 如果它更长，则在目标 List 中的剩余元素不受影响。
	 * Collections.copy(list,li): 前面一个参数是目标列表 ,后一个是源列表。
	 * */
	
	/*
	 * 6) 返回Collections中最小元素(min)
	 *	根据指定比较器产生的顺序，返回给定 collection 的最小元素。collection 中的所有元素都必须是通过指定比较器可相互比较的。
	 *	Collections.min(list)
	 * */
	
	/*
	 * 7) 返回Collections中最大元素(max)
	 *		根据指定比较器产生的顺序，返回给定 collection 的最大元素。collection 中的所有元素都必须是通过指定比较器可相互比较的。
	 *		Collections.max(list)
	 * */
	
	/*
	 * 8) lastIndexOfSubList
	 * 返回指定源列表中最后一次出现指定目标列表的起始位置
	 * int count = Collections.lastIndexOfSubList(list,li);
	 * */
	
	/*
	 * 9) IndexOfSubList
	 *	返回指定源列表中第一次出现指定目标列表的起始位置
	 *	int count = Collections.indexOfSubList(list,li);
	 * */
	
	/*
	 * 10) Rotate
	 *	根据指定的距离循环移动指定列表中的元素
	 *	Collections.rotate(list,-1);
	 *	如果是负数，则正向移动，正数则方向移动
	 *
	 * */
}
