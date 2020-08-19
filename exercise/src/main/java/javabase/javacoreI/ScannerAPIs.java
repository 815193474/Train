package javabase.javacoreI;

import java.util.Scanner;

/**
 * @Author luoguanzhong @Data 2020-08-18 16:31
 *
 * <p>Ҫ��ͨ ������̨�������ˣ�������Ҫ����һ�� Scanner ���󣬲��롰 ��׼�������� System.in ����
 */
public class ScannerAPIs {
  public static void main(String[] args) {

    // ����Scanner ���� ���Һ�System.in ����
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome here");

    /*
    nextLine() ��ȡ�����һ�� ���ܰ����ո�
    */
    scanner.nextLine();

    /*
    next() ��ȡ�����һ�����ʣ��Կհ׷���Ϊ�ָ���
    */
    System.out.println("What's your name ?");
    String name = scanner.next();

    /*
    nextInt() ��ȡ�����һ���������Կհ׷���Ϊ�ָ���
    */
    System.out.println("How old are you ?");
    int age = scanner.nextInt();

    /*
    nextDouble() ��ȡ�����һ�����������Կհ׷���Ϊ�ָ���
     */
    System.out.println("How tall are you ?");
    Double height = scanner.nextDouble();

    System.out.println(name + " " + age + " " + height);

    /*
       ��Ϊ�����ǿɼ��ģ� ���� Scanner �಻�����ڴӿ���̨��ȡ���롣Java SE 6 �ر������� Console ��ʵ�����Ŀ��
       Console console = System.console();
    String userName	= console.readLine("userName :");
    char[] passWord = console.readPassword("passWord :");
      System.out.println(userName);
      System.out.println(passWord);
      */

    /*
    boolean hasNext()
    ����������Ƿ����������ʡ�
     boolean hasNextInt()
    boolean hasNextDouble()
    ����Ƿ��б�ʾ�����򸡵�������һ���ַ�����
    while���� ��ʾ�����������ݵ�ʱ�򣬾�ִ�����sc.next()��������ݣ�
    ����ֻҪ�����������ˣ����Ϳ���ִ�У�
    ���Ժ�ֻ̨�ǿ���һ���ڴ棬һֱδ�رգ�������ѭ��
    */
    while (!scanner.hasNext("0")) { // ������Ϊ0ʱ �ر�ɨ����
      scanner.next();
    }

    /*
      Scanner(File f)
    ����һ���Ӹ����ļ���ȡ���ݵ� Scanner��
    Scanner(String data)
    ����һ���Ӹ����ַ�����ȡ���ݵ� Scanner��
    */

    /*
    PrintWriter(String fileName)
    ����һ��������д���ļ��� PrintWriter��
    �ļ����ɲ���ָ����
    */

    /*
    static Path get(String pathname)
    ���ݸ�����·��������һ�� Path
    */
	
  }
}
