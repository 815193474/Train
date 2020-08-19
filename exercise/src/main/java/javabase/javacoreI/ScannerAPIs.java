package javabase.javacoreI;

import java.util.Scanner;

/**
 * @Author luoguanzhong @Data 2020-08-18 16:31
 *
 * <p>要想通 过控制台进行输人，首先需要构造一个 Scanner 对象，并与“ 标准输人流” System.in 关联
 */
public class ScannerAPIs {
  public static void main(String[] args) {

    // 构造Scanner 对象 并且和System.in 关联
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome here");

    /*
    nextLine() 读取输入的一行 可能包含空格
    */
    scanner.nextLine();

    /*
    next() 读取输入的一个单词，以空白符作为分隔符
    */
    System.out.println("What's your name ?");
    String name = scanner.next();

    /*
    nextInt() 读取输入的一个整数，以空白符作为分隔符
    */
    System.out.println("How old are you ?");
    int age = scanner.nextInt();

    /*
    nextDouble() 读取输入的一个浮点数，以空白符作为分隔符
     */
    System.out.println("How tall are you ?");
    Double height = scanner.nextDouble();

    System.out.println(name + " " + age + " " + height);

    /*
       因为输入是可见的， 所以 Scanner 类不适用于从控制台读取密码。Java SE 6 特别引入了 Console 类实现这个目的
       Console console = System.console();
    String userName	= console.readLine("userName :");
    char[] passWord = console.readPassword("passWord :");
      System.out.println(userName);
      System.out.println(passWord);
      */

    /*
    boolean hasNext()
    检测输人中是否还有其他单词。
     boolean hasNextInt()
    boolean hasNextDouble()
    检测是否还有表示整数或浮点数的下一个字符序列
    while语句块 表示当你输入数据的时候，就执行输出sc.next()（输出内容）
    所以只要你输入数据了，它就可以执行，
    所以后台只是开了一块内存，一直未关闭，不算死循环
    */
    while (!scanner.hasNext("0")) { // 当输入为0时 关闭扫描器
      scanner.next();
    }

    /*
      Scanner(File f)
    构造一个从给定文件读取数据的 Scanner。
    Scanner(String data)
    构造一个从给定字符串读取数据的 Scanner。
    */

    /*
    PrintWriter(String fileName)
    构造一个将数据写入文件的 PrintWriter。
    文件名由参数指定。
    */

    /*
    static Path get(String pathname)
    根据给定的路径名构造一个 Path
    */
	
  }
}
