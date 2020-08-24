package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-18 09:14
 *
 * <p>java String API��ϰ 1. substring ���� ; 2. �ַ�����ƴ�� �� + ' ; 3. ����ַ����Ƿ���� �� equals �� ; 4. �մ� �� Null��
 * ; 5. ���ʾ�̬����
 */
public class BaseString {

  public static void main(String[] args) {
    // 1. substring ����ʹ��
    String str = "hello";
    String str2 = str.substring(0, 3); // ��ȡ�ַ����±� ���ڵ���0 С��3���ַ���
    System.out.println(str2); // print hel

    // 2. �ַ�����ƴ��  ' + ' ���´��뽫�� Expletivedeleted�� �������� message
    String expletive = "Expletive";
    String PC13 = "deleted";
    String message = expletive + PC13;
    /*
     *����һ���ַ�����һ�����ַ�����ֵ����ƴ��ʱ�����߱�ת�����ַ���
     */
    int age = 13;
    String rating = "PC" + age;
    System.out.println(rating); // print PC13
    // �ַ���ƴ�� join ����
    String all = String.join("/", "s", "m", "l");
    System.out.println(all); // print " s/m/l"

    /*
    java ���ַ���ʱ���ɱ�� �����ַ��������ÿ��Ըı� ��ͽ�����ַ������޸�����
    java �в��ɱ��ַ������ŵ��� �ַ��������ڱ������й��� �ֲ�����ȡ�ַ�����ƴ���ַ�����Ч��
    */
    String str3 = str2 + "p"; // ����ȡ����ƴ��
    System.out.println(str3); // print help

    /*
     * java �м���������ַ����Ƿ���� equals ����
     * */
    String str4 = null;
    System.out.println("hello".equals(str4)); // print false
    /*
    System.out.println(str4.equals("hello"));
    ���淶 ��str �ǿ�ֵ��ʱ�򣬳�����쳣 ���Ա��뽫�ַ�������ǰ�� �����ں�
    */

    // java �пմ� �� Null��
    String str5 = ""; // �մ�
    String str6 = " "; // ����һ���ո���ַ���
    if (str5.length() == 0) System.out.println(true); // print true
    if (str6.length() == 0) System.out.println(true); // no print
    if ("".equals(str4)) System.out.println(true); // "" �� null �����
    if (str4 == null) System.out.println(true); // print true
    /*���һ���ַ����Ȳ��� null Ҳ��Ϊ�մ�*/
    if (str != null && "".equals(str)) System.out.println(true);
    // ����
    if (str != null && str.length() == 0) System.out.println(true);
    System.out.println(true);

    {
      // ���ʾ�̬����
      System.out.println(six);
      System.out.println(BaseString.six);

      // ʵ�������󣬷��ʶ����ʵ������ Ҳ��������
      BaseString baseString = new BaseString();
      System.out.println(baseString.ss);
      // ���·���Ҳ���Է��ʾ�̬����
			System.out.println(baseString.six); // ���Ƽ� ��ʵstatic����six ��baseString û���κι�ϵ ��ֻ����BaseString��
    }
  }

  static int six = 3; // ��̬����ֱ�ӿ��Է���
  int ss = 2; // ʵ������ �����������ʵ�����Ժ�ſ��Է���
}
