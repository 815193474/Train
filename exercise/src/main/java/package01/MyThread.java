package package01;

/**
 * @Author wolf  VX:a815193474
 * @Date 2020-06-17 11:30
 */
public class MyThread implements Runnable {
    public void run(){
        System.out.println("�̷߳����ѱ���д");
    }

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        Thread thread=new Thread(myThread);
        thread.start();
    }
}

