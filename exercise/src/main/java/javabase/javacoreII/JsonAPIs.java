package javabase.javacoreII;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author luoGuanzhong
 * @since 2020-09-17 14:51
 *
 * fastJson ѧϰ
 */
public class JsonAPIs {
	
	public static void main(String[] args) {
		/*
		 * map תJson
		 * JSON.toJSON();
		 * */
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "��һ������");
		map.put(2, "�ڶ�������");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m); // print 1=��һ������ 			2=�ڶ�������
		}
		Object object = JSON.toJSON(map);
		System.out.println(object); // print {"1":"��һ������","2":"�ڶ�������"}
		
		/*
		 * list ת JSON
		 * JSON.toJSON();
		 * */
		List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "one");
		map1.put(2, "two");
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(1, "three");
		map2.put(2, "four");
		
		list.add(map1);
		list.add(map2);
		System.out.println(list); // print [{1=one, 2=two}, {1=three, 2=four}]
		Object obj = JSON.toJSON(list);
		System.out.println(obj); // print [{"1":"one","2":"two"},{"1":"three","2":"four"}]
		
		/*
		 * Bean תjson
		 *  Bean : user
		 *  JSON.toJSON(user)
		 * */
		
		/*
		 * json ת bean
		 * JSON.parseObject(String text,Class<T> clazz)
		 * JSON.parseObject(str,User.class);
		 *
		 * */
		
		/*
		 * Json ת list map
		 * JSON.parseObject(String text,TypeReference<T> type)
		 *  JSON.parseObject(str,new TypeReference<Type>(){});
		 * */
		
		/*
		 * json ת JSONObject
		 * JSONObject.parseObject(String text)
		 * map תjsonObject  �Ƚ�mapתΪjsonString ������JSONObject.parseObject(String text)����תΪJSONObject
		 *
		 * */
		
		/*
		 * listתjsonArray
		 * ʹ�� JSONArray.parseArray(String text)
		 * �Ƚ�listת��jsonString���ڵ���parseArray()����ת��
		 * */
	}
}
