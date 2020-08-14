package package01;

/**
 * @Author wolf  VX:a815193474
 * @Data 2020-06-17 11:18
 */
public class ThreadTest extends Thread{
    public static void main(String[] args) {
        ThreadTest threadTest=new ThreadTest();
        threadTest.start();


    }
    public void run(){
        System.out.println("线程已开启");
    }
}
