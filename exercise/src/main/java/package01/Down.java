package package01;

import com.sun.jndi.toolkit.url.UrlUtil;

import java.io.*;
import java.net.URL;

/**
 * @Author wolf  VX:a815193474
 * @Data 2019-08-19 14:40
 */
public class Down {
    public  static void  main(String args[]) throws Exception{
        URL url =new URL("http://www.baidu.com");
        BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));
        //InputStreamReader rea=new InputStreamReader(url.openStream());
        BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\text.html"));
        String line;
        /*
        * 把reader.readLine()赋值给line，并判断line如果不为空执行写操作
           注意：readLine()一次读取一行
        *
        * 读取一个文本行。
            一定要注意：
            1、读入的数据要注意有/r或/n或/r/n
            2、没有数据时会阻塞，在数据流异常或断开时才会返回null
            3、使用socket之类的数据流时，要避免使用readLine()，以免为了等待一个换行/回车符而一直阻塞
            4、readLine()是一个阻塞函数，当没有数据读取时，就一直会阻塞在那，而不是返回null
            5、readLine()只有在数据流发生异常或者另一端被close()掉时，才会返回null值。
            6、如果不指定buffer大小，则readLine()使用的buffer有8192个字符。在达到buffer大小之前，只有遇到”/r”、”/n”、”/r/n”才会返回。
            7、该方法读取一行文本，当遇到换行符”\n”,回车符”\r”或者回车符后面紧跟着换行符时，该行结束并返回。没有数据时，将会一直处于等待状态。因此在进行网络连接时，应该避免使用该方法。
        *
        * **/
        //read()读取单个字符的个数，如果已经读完的话会返回-1 (其范围从 0 到 65535 )
        while ((line=reader.readLine())!=null){
            writer.write(line);
            writer.newLine();
            System.out.println(line);

        }
        System.out.println("download Successful");
        reader.close();
        writer.close();
    }
}
