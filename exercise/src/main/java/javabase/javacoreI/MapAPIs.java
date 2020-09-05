package javabase.javacoreI;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @Author luoGuanzhong @Date 2020-08-31 14:55
 *
 * <p>Map �� collection �Ǽ��ϵ����ֳ����ӿ�
 */
public class MapAPIs {
	
	/*
	 * java.util.Map
	 * */ {
		/*
		 * V put(K key, V value)
		 * ����һ��Ԫ��
		 * */
		
		/*
		 * void putAll(Map<? extends K , ? extends V> entries)
		 * ������ӳ���е�������Ŀ��ӵ����ӳ���С�
		 * */
		
		/*
		 * boolean containsKey(Object key)
		 * �����ӳ�����Ѿ���������� ���� true��
		 * boolean containsValue(Object value)
		 * ���ӳ�����Ѿ������ֵ�� ���� true��
		 * */
		
		/*
		 * default void forEach(BiConsumer<? super K ,? super V> action)8
		 * �����ӳ���е����м� / ֵ��Ӧ���������
		 * */
		
		/*
		 * V get(K key)
		 * ��ȡһ��Ԫ��
		 * */
		
		/*
		 * default V merge(K key, V value, BiFunction<? super V ,? super V ,? extends V> remappingFunction)
		 * ��� key ��һ���� null ֵ v ������ ������Ӧ�õ� v �� value, �� key ��������
		 * ������Ϊ null, ��ɾ������������� �� key �� value ������ ���� get(key)
		 * */
		
		/*
		 * default V compute(K key, BiFunction<? super K,? super V ,? extends V> remappingFunction)8
		 * ������Ӧ�õ� key �� get(key) ,�� key ��������������������Ϊ mill�� ��ɾ������������� get(key)
		 *
		 * */
	}
	
	/*
	 * HashMap �� TreeMap
	 * */ {
		/*
		 * ɢ��ӳ��Լ�����ɢ�У� ��ӳ���ü�������˳���Ԫ�ؽ������� ��������֯����������ɢ�л�ȽϺ���ֻ�������ڼ�
		 * */
		/*
		 * �粻��Ҫ������ѡ��ɢ��ӳ�䣬ɢ����΢��һ��
		 * */
		/*
		 * HashMap<K,V>
		 * HashMap()
		 * HashMap(int initialCapacity)
		 * HashMap(int initialCapacity, float loadFactor)
		 * �ø�����������װ�����ӹ���һ����ɢ��ӳ�䣨װ��������һ�� 0.0 ? 1.0 ֮�����
		 * ֵ�������ֵ����ɢ�б����İٷֱȡ�һ��������������� ��Ҫ������ɢ�е�����
		 * �ı��У���Ĭ�ϵ�װ�������� 0.75��
		 * */
		
		/*
		 * .TreeMap<K,V>
		 * TreeMap()
		 * Ϊʵ�� Comparable �ӿڵļ�����һ���յ���ӳ��
		 * TreeMap(Comparator<? super K> c)
		 * ����һ����ӳ�䣬 ��ʹ��һ��ָ���ıȽ����Լ���������
		 * TreeMap(Map<? extends K, ? extends V > entries)
		 * ����һ����ӳ�䣬 ����ĳ��ӳ���е�������Ŀ��ӵ���ӳ����
		 * TreeMap(SortedMap<? extends K, ? extends V> entries)
		 * ����һ����ӳ�䣬 ��ĳ������ӳ���е�������Ŀ��ӵ���ӳ���У� ��ʹ�������������ӳ����ͬ�ıȽ�����
		 * */
		
		/*
		 *  SortedMap<K, V>
		 * Comparator< ? super K> comparator()
		 * ���ضԼ���������ıȽ�������������� Comparable �ӿڵ� compareTo �������бȽϵģ����� null
		 * K firstKey()
		 * K lastKey()
		 * ����ӳ������СԪ�غ����Ԫ�ء�
		 *
		 * */
	}
	
	/*
	 * ��ͼ
	 * */
	
	/*
	 * 3 ����ͼ
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
		// ����ӳ��
		for (Map.Entry<Integer, String> maps : map.entrySet()) {
			System.out.println(maps.getKey() + " " + maps.getValue());
		}
	}
	
	
}
