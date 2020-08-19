package javabase.javacoreI;

import java.util.Arrays;

/**
 * @Author luoguanzhong @Data 2020-08-19 10:43
 *
 * <p>������ϰ Arrays��ĳ��÷���
 */
public class ArrayAPIs {
  public static void main(String args[]) {

    /*
     *  һά����
     *  */
    {
      /* ��������ļ��ַ�ʽ
       * 1. �������ͺ����[] �ͱ�������; java �淶�Ƽ�д��
       * 2. Ҳʹ���������ͼӱ������ֽ���[];
       * */
      int[] a; // ��������a ��û�д�������
      int[] b = new int[10]; // ������������СΪ10������ �����С��һ���ǳ��� Ҳ�����Ǳ��� n

      /*
       * �����ʼ������������
       * Java�ṩ��һ�ִ����������ͬʱ�����ʼֵ�ļ���д��ʽ��
       * */
      int[] array = {1, 2, 3, 4};

      /*
       * ���������Գ�ʼ��һ������������
       * new int[] {1,2,3};
       * array1 = new int[] {1,2,3};
       * */

      /*
       * ����һ����������ʱ�� ����Ԫ�ض���ʼ��Ϊ 0��boolean �����Ԫ�ػ��ʼ��Ϊ false�� ���������Ԫ�����ʼ��Ϊһ������ֵ null
       * ���鴴����һ��ͨ��forѭ�������Ԫ��ֵ
       */
      for (int i = 0; i < 10; i++) {
        b[i] = i;
      }

      /*
       * foreach ѭ�� �����������δ��������е�ÿ��Ԫ�أ��������͵�Ԫ�ؼ�����ɣ�������ָ���±�ֵ
       * for (variable : collection) statement
       * */
      for (int n : b) {
        System.out.println(n);
      }

      /*
       * ��ӡ�������ʹ��ѭ����ӡ������ʹ�� Arrays.toString(b) ����
       * */
      System.out.println(Arrays.toString(b));

      /*
       * �� Java �У�����һ�����������������һ�������������ʱ�� ��������������ͬһ������
       * �������޸����� b ֮�� ��c��Ԫ��Ҳ�����ı�
       * */
      int[] c = b;
      b[0] = 3;
      System.out.println(c[0]); // print 3
      for (int n : c) {
        System.out.println(n);
      }

      /*
       * Arrays.copyOf(array,length)
       * ʵ�ֽ�������С�ڳ����ǲ��ָ��ƹ�ȥ
       * length ����С��ԭ��������ԭ�����һ���֣����ȴ���ԭ���飬��ô�����Ԫ�ؾͻᱻĬ�ϸ�ֵ
       * ��ֵ�͸�ֵΪ 0
       * �����͸�ֵΪ false
       * ����ֵΪ null
       * */
      int[] f = Arrays.copyOf(b, 11);
      System.out.println(Arrays.toString(f)); // f[10] ��ֵΪ0

      if (args.length == 0 || ("Hello").equals(args[0])) {
        System.out.println("hello");
      } else if (("GoodBye").equals(args[0])) {
        System.out.println("goodbye");
      }
      for (String n : args) {
        System.out.println(n);
      }

      /*
       * Arrays.sort(array);
       * �����Ҫ����ֵ���͵���������������ѡ��ʹ��Arrays.sort(array)
       * */
      int[] array2 = {3, 1, 2, 5, 4, 6};
      Arrays.sort(array2);
      System.out.println(Arrays.toString(array2)); // print [1, 2, 3, 4, 5, 6]

      /*
       * static type copyOf(type[]a, int length)
       * ������ a ������ͬ��һ�����飬 �䳤��Ϊ length
       * static type copyOfRange(type[]a , int start, int end)
       * ������ a ������ͬ��һ�����飬 �䳤��Ϊend-start�� ����Ԫ��Ϊ a ��ֵ
       * */
      System.out.println(Arrays.toString(Arrays.copyOf(array2, 3))); // pint [1, 2, 3]
      System.out.println(Arrays.toString(Arrays.copyOfRange(array2, 2, 4))); // print [3, 4]

      /*
       * static int binarySearch(type[] a , type v)
       * static int binarySearch(type[]a, int start, int end, type v)
       * ���ö��������㷨����ֵ v��������ҳɹ��� �򷵻���Ӧ���±�ֵ�� ���� ����һ������ֵ ��
       * */
      System.out.println(Arrays.binarySearch(array2, 3)); // print 2 Ԫ��3���±�
      System.out.println(Arrays.binarySearch(array2, 1, 3, 2)); // print 1 Ԫ��2���±�
      System.out.println(Arrays.binarySearch(array2, 1, 3, 4)); // print -4

      /*
       * static void fi11(type[]a , type v)
       * ���������������Ԫ��ֵ����Ϊ V
       * */
      Arrays.fill(array, 2);
      System.out.println(Arrays.toString(array)); // print [2, 2, 2, 2]

      /*
       * static boolean equals(type[]a, type[]b)
       * ������������С��ͬ�� �����±���ͬ��Ԫ�ض���Ӧ��ȣ� ���� true��
       * */
      System.out.println(Arrays.equals(array, array2)); // print false
    }

    /*
     * ��ά����
     * */
    {
      /* �����ά���� */
      int[][] array3 = new int[3][3];
      System.out.println(array3.length);

      /* ���ά����������� */
      for (int i = 0; i < array3.length; i++) {
        for (int j = 0; j < array3[i].length; j++) {
          array3[i][j] = j + i;
        }
      }

      /*
       * Arrays.deepToString(array)
       * ��ӡ��ά����
       * */
      System.out.println(Arrays.deepToString(array3));

      /* ������ӡ��ά���� */
      for (int[] arr : array3) {
        System.out.println(Arrays.toString(arr));
      }

      /* ���ʶ�ά���� */
      System.out.println(array3[0][1]); // print 1
    }
  }
}
