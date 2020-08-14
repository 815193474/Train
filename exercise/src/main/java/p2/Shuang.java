package p2;

import java.util.Random;

/**
 * @Author wolf  VX:a815193474
 * @Data 2019-12-01 18:11
 */
public class Shuang {
   static Integer x1;
    static Integer x2;
    static Integer x3;
    static Integer x4;
    static Integer x5;
    static Integer x6;
    static Integer y;
    static void suiJi(){
        Random random=new Random();

        y=random.nextInt(16)+1;
        while(x1==x2||x1==x3||x1==x4||x1==x5||x1==x6||x2==x3||x2==x4||x2==x5||x2==x6||x3==x4||x3==x5||x3==x6||x4==x5||x4==x6||x5==x6){

           x1=random.nextInt(32)+1;
           x2=random.nextInt(32)+1;
           x3=random.nextInt(32)+1;
           x4=random.nextInt(32)+1;
           x5=random.nextInt(32)+1;
           x6=random.nextInt(32)+1;
        }
        y=random.nextInt(16)+1;

        System.out.println(x1+" "+x2+" "+x3+" "+x4+" "+x5+" "+x6+" "+y);
    }

    public static void main(String args[]){
        suiJi();
    }
}

