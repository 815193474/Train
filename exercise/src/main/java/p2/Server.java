package p2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author wolf  VX:a815193474
 * @Date 2020-04-29 15:05
 */
public class Server {
    public static void main(String[] args) {
        BufferedReader bufferedReader=null;
        PrintWriter printWriter=null;
        try{
            ServerSocket serverSocket=new ServerSocket(1500);
            Socket socket=serverSocket.accept();
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter=new PrintWriter(socket.getOutputStream(),true);
            String s=bufferedReader.readLine();
            printWriter.println(s);


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
