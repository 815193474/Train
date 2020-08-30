package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-18 15:52
 *
 * <p>StringBuilder ���÷���
 *
 * <p>�� JDK5.0 ������ StringBuilder �ࡣ ������ǰ���� StringBuffer, ��Ч������Щ�ͣ� ��������ö��̵߳ķ�ʽִ����ӻ�ɾ���ַ��Ĳ���
 * ��������ַ�����һ������ ���б༭ ��ͨ����������) �� ��Ӧ���� StringBuilder ������� ��������� API����ͬ��
 *
 * <p>��Щʱ�� ��Ҫ�ɽ϶̵��ַ��������ַ����� ���磬������ �������ӵķ�ʽ�ﵽ��Ŀ��Ч�ʱȽϵ͡� ÿ�������ַ��������ṹ��һ���µ� String ���� �Ⱥ�ʱ�����˷ѿռ䡣ʹ��
 * StringBuilder ��Ϳ��Ա����������ķ�����
 */
public class StringBuilderAPIs {
  public static void main(String[] args) {
    /*
    StringBuilder()
    ����һ���յ��ַ�����������
    */
    StringBuilder stringBuilder = new StringBuilder();

    /*
    StringBuilder append(String str)
    ׷��һ���ַ��������� this��
    StringBuilder append(char c)
    ׷��һ�����뵥Ԫ������ this��
    */
    stringBuilder.append("hello");
    stringBuilder.append("World");
    System.out.println(stringBuilder); // print helloWorld

    /*
    int length()
    ���ع������򻺳����еĴ��뵥Ԫ������
    */
    System.out.println(stringBuilder.length()); // print 10

    /*
    StringBuilder appendCodePoint(int cp)
    ׷��һ������㣬������ת��Ϊһ�����������뵥Ԫ������ this��
    */
    System.out.println(stringBuilder.appendCodePoint(104)); // print helloWorldh h ��ASCII��ֵ��104

    /*
     void setCharAt(int i ,char c)
    		���� i �����뵥Ԫ����Ϊ c��
    */
    stringBuilder.setCharAt(1, 'a'); // ��e �޸�Ϊ a
    System.out.println(stringBuilder); // print halloWorldh

    /*
    StringBuilder insert(int offset,String str)
    �� offset λ�ò���һ���ַ��������� this��
    */

    System.out.println(stringBuilder.insert(0, "n")); // print nhalloWorldh

    /*
     StringBuilder insert(int offset,Char c)
    �� offset λ�ò���һ�����뵥Ԫ������ this��
    */
    System.out.println(stringBuilder.insert(0, 's')); // print shhalloWorldh

    /*
    StringBuilder delete(int startIndex,int endIndex)
    ɾ��ƫ������ startIndex �� -endIndex-1 �Ĵ��뵥Ԫ������ this��
    */
    System.out.println(stringBuilder.delete(0, 2));
	
		/*
		 * deleteCharAt(int index)
		 * ɾ��ָ��λ��char
		 * */
    /*
    String toString()
    ����һ���빹�����򻺳���������ͬ���ַ���
    */
    System.out.println(stringBuilder.toString());
  }
}
