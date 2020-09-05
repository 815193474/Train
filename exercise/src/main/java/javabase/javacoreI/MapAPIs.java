package javabase.javacoreI;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @Author luoGuanzhong @Date 2020-08-31 14:55
 *
 * <p>Map 和 collection 是集合的两种常见接口
 */
public class MapAPIs {
	
	/*
	 * java.util.Map
	 * */ {
		/*
		 * V put(K key, V value)
		 * 插入一个元素
		 * */
		
		/*
		 * void putAll(Map<? extends K , ? extends V> entries)
		 * 将给定映射中的所有条目添加到这个映射中。
		 * */
		
		/*
		 * boolean containsKey(Object key)
		 * 如果在映射中已经有这个键， 返回 true。
		 * boolean containsValue(Object value)
		 * 如果映射中已经有这个值， 返回 true。
		 * */
		
		/*
		 * default void forEach(BiConsumer<? super K ,? super V> action)8
		 * 对这个映射中的所有键 / 值对应用这个动作
		 * */
		
		/*
		 * V get(K key)
		 * 读取一个元素
		 * */
		
		/*
		 * default V merge(K key, V value, BiFunction<? super V ,? super V ,? extends V> remappingFunction)
		 * 如果 key 与一个非 null 值 v 关联， 将函数应用到 v 和 value, 将 key 与结果关联
		 * 如果结果为 null, 则删除这个键。否则， 将 key 与 value 关联， 返回 get(key)
		 * */
		
		/*
		 * default V compute(K key, BiFunction<? super K,? super V ,? extends V> remappingFunction)8
		 * 将函数应用到 key 和 get(key) ,将 key 与结果关联，或者如果结果为 mill， 则删除这个键。返回 get(key)
		 *
		 * */
	}
	
	/*
	 * HashMap 和 TreeMap
	 * */ {
		/*
		 * 散列映射对键进行散列， 树映射用键的整体顺序对元素进行排序， 并将其组织成搜索树。散列或比较函数只能作用于键
		 * */
		/*
		 * 如不需要排序，则选择散列映射，散列稍微快一点
		 * */
		/*
		 * HashMap<K,V>
		 * HashMap()
		 * HashMap(int initialCapacity)
		 * HashMap(int initialCapacity, float loadFactor)
		 * 用给定的容量和装填因子构造一个空散列映射（装填因子是一个 0.0 ? 1.0 之间的数
		 * 值。这个数值决定散列表填充的百分比。一旦到了这个比例， 就要将其再散列到更大
		 * 的表中）。默认的装填因子是 0.75。
		 * */
		
		/*
		 * .TreeMap<K,V>
		 * TreeMap()
		 * 为实现 Comparable 接口的键构造一个空的树映射
		 * TreeMap(Comparator<? super K> c)
		 * 构造一个树映射， 并使用一个指定的比较器对键进行排序
		 * TreeMap(Map<? extends K, ? extends V > entries)
		 * 构造一个树映射， 并将某个映射中的所有条目添加到树映射中
		 * TreeMap(SortedMap<? extends K, ? extends V> entries)
		 * 构造一个树映射， 将某个有序映射中的所有条目添加到树映射中， 并使用与给定的有序映射相同的比较器。
		 * */
		
		/*
		 *  SortedMap<K, V>
		 * Comparator< ? super K> comparator()
		 * 返回对键进行排序的比较器。如果键是用 Comparable 接口的 compareTo 方法进行比较的，返回 null
		 * K firstKey()
		 * K lastKey()
		 * 返回映射中最小元素和最大元素。
		 *
		 * */
	}
	
	/*
	 * 视图
	 * */
	
	/*
	 * 3 中视图
	 * Set<K> keySet()
	 * Collection<V> values()
	 * Set<Map.Entry<K, V> entrySet()
	 * */
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			//
			map.put(i, "string" + i);
		}
		// 遍历映射
		for (Map.Entry<Integer, String> maps : map.entrySet()) {
			System.out.println(maps.getKey() + " " + maps.getValue());
		}
	}
	
	
}
