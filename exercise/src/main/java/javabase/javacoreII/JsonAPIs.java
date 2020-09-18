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
 * fastJson 学习
 */
public class JsonAPIs {
	
	public static void main(String[] args) {
		/*
		 * map 转Json
		 * JSON.toJSON();
		 * */
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "第一条数据");
		map.put(2, "第二条数据");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m); // print 1=第一条数据 			2=第二条数据
		}
		Object object = JSON.toJSON(map);
		System.out.println(object); // print {"1":"第一条数据","2":"第二条数据"}
		
		/*
		 * list 转 JSON
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
		 * Bean 转json
		 *  Bean : user
		 *  JSON.toJSON(user)
		 * */
		
		/*
		 * json 转 bean
		 * JSON.parseObject(String text,Class<T> clazz)
		 * JSON.parseObject(str,User.class);
		 *
		 * */
		
		/*
		 * Json 转 list map
		 * JSON.parseObject(String text,TypeReference<T> type)
		 *  JSON.parseObject(str,new TypeReference<Type>(){});
		 * */
		
		/*
		 * json 转 JSONObject
		 * JSONObject.parseObject(String text)
		 * map 转jsonObject  先将map转为jsonString ，再用JSONObject.parseObject(String text)方法转为JSONObject
		 *
		 * */
		
		/*
		 * list转jsonArray
		 * 使用 JSONArray.parseArray(String text)
		 * 先将list转成jsonString，在调用parseArray()方法转换
		 * */
	}
}
