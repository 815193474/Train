package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-18 11:50
 *
 * <p>String ���õķ���
 */
public class StringAPIs {
  public static void main(String[] args) {

    String str = "hello";
    /*
    char charAt (int index)
    ���ظ���λ�õĴ��뵥Ԫ�����ǶԵײ�Ĵ��뵥Ԫ����Ȥ�� ������Ҫ�����������
    ˵����һ����������һ��Unicode�ַ������뵥Ԫ���Ǵ����ļ��ϡ�
    */
    System.out.println(str.charAt(0)); // print h

    /*
    int codePointAt(int Index)
    ���شӸ���λ�ÿ�ʼ����㡣
    */
    System.out.println(str.codePointAt(0)); // print 104 ��ӦASCII ����е�h

    /*
    int offsetByCodePoints(int startIndex, int cpCount)
    ���ش� startIndex ����㿪ʼ��λ�� cpCount ����������
    */
    System.out.println(str.offsetByCodePoints(1, 2)); // print 3

    /*
    int compareTo(String other)
    �����ֵ�˳������ַ���λ�� other ֮ǰ�� ����һ������������ַ���λ�� other ֮
    �󣬷���һ����������������ַ�����ȣ����� 0��
    */
    System.out.println(str.compareTo("hello")); // print 0

    /*
     boolean equals(object other)
    ����ַ����� other ��ȣ� ���� true��
    */
    System.out.println(("hello").equals(str)); // print true

    /*
    boolean equalsIgnoreCase(String other )
    ����ַ����� other ��� �� ���Դ�Сд��) ���� true
    */
    System.out.println(("HELLO").equalsIgnoreCase(str)); // print true

    /*
     boolean startsWith(String prefix )
    boolean endsWith(String suffix )
     ����ַ����� prefix/suffix ��ͷ���β�� �򷵻� true��
     */
    System.out.println(str.startsWith("he")); // print true
    System.out.println(str.endsWith("o")); // print true

    /*
    int indexOf(String str)
    int indexOf(String str, int fromIndex )
    int indexOf(int cp)
    int indexOf(int cp, int fromIndex )
    �������ַ��� str ������ cp ƥ��ĵ�һ���Ӵ��Ŀ�ʼλ�á����λ�ô����� 0 �� fromIndex (����fromIndex����ʼ���㡣
    �����ԭʼ���в����� str������ -1
    */
    System.out.println(str.indexOf("l")); // print 2
    System.out.println(str.indexOf("l", 3)); // print 3
    System.out.println(str.indexOf("l", 4)); // print -1 �������ַ���

    /*
    int lastIndexOf(String str)
    int lastIndexOf(String str, int fromIndex )
    int lastIndexOf(int cp)
    int lastIndexOf(int cp, int fromIndex )
    �������ַ��� str ������ cp ƥ������һ���Ӵ��Ŀ�ʼλ�á� ���λ�ô�ԭʼ��β�˻� fromIndex ��ʼ���������󡯼���
    */
    System.out.println(str.lastIndexOf("l")); // print 3
    System.out.println(str.lastIndexOf("l", 3)); // print 3 hello
    System.out.println(str.lastIndexOf("l", 4)); // print 3 hello

    /*
    int length()
     �����ַ������L��
     */
    System.out.println(str.length());

    /*
     String replace( CharSequence oldString,CharSequence newString)
    ����һ�����ַ���������ַ����� newString ����ԭʼ�ַ��������е� oldString����
    ���� String �� StringBuilder ������Ϊ CharSequence ������
     */
    System.out.println(str.replace("lo", "p")); // print help

    /*
    String substring(int beginIndex )
    String substring(int beginIndex, int endIndex )
    ����һ�����ַ���������ַ�������ԭʼ�ַ����д� beginIndex ����β�� endIndex-1
    �����д��뵥Ԫ
    */
    System.out.println(str.substring(1)); // print ello
    System.out.println(str.substring(1, 3)); // print el

    /*
    String toLowerCase()
    String toUpperCase()
    ����һ�����ַ����� ����ַ�����ԭʼ�ַ����еĴ�д��ĸ��ΪСд�����߽�ԭʼ��
    �����е�����Сд��ĸ�ĳ��˴�д��ĸ��
    */
    System.out.println(str.toUpperCase()); // print HELLO

    /*
    String trim()
    ����һ�����ַ���������ַ�����ɾ����ԭʼ�ַ���ͷ����β���Ŀո�
    */
    System.out.println((" hello ").trim()); // print hello

    /*
    String join(CharSequence delimiter, CharSequence ... elements )
    ����һ�����ַ����� �ø����Ķ������������Ԫ��
    */
    System.out.println(String.join("-","h","e","l","l","o")); // print h-e-l-l-o
  }
}
