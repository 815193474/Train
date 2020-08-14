package package01;

/**
 * @Author wolf  VX:a815193474
 * @Data 2020-02-13  15:32
 */
public class Test1 {
    public Test1(){
        System.out.println("construct");
    }
    public void Test1(){
        System.out.println(" call Test1");
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        t.Test1();
    }
}
