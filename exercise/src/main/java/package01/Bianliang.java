package package01;

import javafx.beans.property.ObjectProperty;

/**
 * @Author wolf  VX:a815193474
 * @Data 2020-02-13 14:40
 */

 class B  extends Object {
    static {
        System.out.println("load B");
    }

    public B() {
        System.out.println("create B");
    }

    static {
        System.out.println("load B");
    }
}
    class A extends B{
        static {
            System.out.println("load A");
        }
        public A(){
            System.out.println("create A");
        }
    }


public class Bianliang{

        public static void main(String[] args) {

            new A();

        }   }

