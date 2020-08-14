package package01;

import java.util.*;

/**
 * @Author wolf  VX:a815193474
 * @Data 2019-10-17 15:52
 */
public class TestFile {

    public static void main(String args[]){
    List<Text> list=new ArrayList<>();
    Text text1=new Text();
    text1.setName("ceshi02");
    text1.setDate(new Date());
    try{
        Thread.sleep(3000);
    }catch (Exception e){
        System.out.println("异常");
    }
        Text text2=new Text();
        text2.setName("ceshi01");
        text2.setDate(new Date());
        list.add(text1);
        list.add(text2);

        ListSort(list);
        System.out.println(list);
    }

    private static List<Text> ListSort(List<Text> list) {
        Collections.sort(list, new Comparator<Text>() {
            public int compare(Text dt1, Text dt2) {

                try {
                    if (dt1.getDate().before(dt2.getDate())) {
                        return 1;
                    } else if (dt1.getDate().after(dt2.getDate())) {
                        return -1;
                    } else {
                        return 0;
                    }
                } catch (Exception e) {
                    System.out.println(e+"时间排序查询异常");
                    e.printStackTrace();
                }
                return 0;
            }
        });
        return list;
    }
}
