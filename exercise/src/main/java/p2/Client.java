package p2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @Author wolf  VX:a815193474
 * @Date 2020-04-29 15:37
 */
public class Client {
    public static void main(String[] args) {
        BufferedReader bufferedReader=null;

        PrintWriter printWriter=null;
        try{
            Socket socket=new Socket("localhost",1500);
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter=new PrintWriter(socket.getOutputStream(),true);
            printWriter.println("hello");
            String s=null;
            while (true){
                s=bufferedReader.readLine();
                if (s!=null){
                    break;
                }
            }
            System.out.println(s);

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
                printWriter.close();
            }catch (Exception e){

            }
        }
    }
}
