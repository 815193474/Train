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
            //��������ʽ����
            return Stream.of(new Person(1001,"С��"),new Person(1002,"����"));

        }

    public static void main(String[] args) {
      //
        Map<Integer,String> idToName = people().collect(Collectors.toMap(Person :: getId,Person :: getName));
        // set�ǵ��� ֻ��ֵ���Զ����򣬲������ظ� hashSet ��set��ʵ���࣬set�ǽӿ�
        Set<String> string=new HashSet<>();
        string.add("suShan");
        string.add("123");
        // Map�Ǽ�ֵ��ӳ������ ֵ�����ظ� hashMap ��Map��ʵ���࣬Map�ǽӿ�
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
