package javabase.basestream;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author luoguanzhong
 * @Data 2020-08-15 20:37
 */
public class CollectingIntoMaps {
    public static class Person{
        private int id;
        private String name;
        public Person(int id,String name){
            this.id = id;
            this.name = name;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
        public static Stream<Person> people(){
            //以流的形式返回
            return Stream.of(new Person(1001,"小明"),new Person(1002,"仙三"));

        }

    public static void main(String[] args) {
      //
        Map<Integer,String> idToName = people().collect(Collectors.toMap(Person :: getId,Person :: getName));
        // set是单链 只有值，自动排序，不可以重复 hashSet 是set的实现类，set是接口
        Set<String> string=new HashSet<>();
        string.add("suShan");
        string.add("123");
        // Map是键值对映射链表 值可以重复 hashMap 是Map的实现类，Map是接口
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"cc");
        map.put(102,"ee");
      System.out.println(" idToName" +idToName);
      System.out.println(idToName.get(1001));
      System.out.println(string);
      System.out.println(map);
    }
    }
}
