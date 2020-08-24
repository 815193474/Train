package package01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wolf  VX:a815193474
 * @Date 2019-10-15 14:37
 */
public class Test {

    public static void main(String args[]){
        test();
    }
    public static void test(){

        int[] array={1,2,3};
        int[] array01=new int[10];//大小为10
        List list=new ArrayList();
        list.add("1");
        list.add("2");
        System.out.println(list);
        List<String> list01=new ArrayList<String>();
        String x="1,2";
        String y="3";
        list01.add(x);
        list01.add(y);
        System.out.println(list01);
        System.out.println(array);

        for (int map:array){
           map=map+1;
            System.out.println(map);
        }



    }


}
