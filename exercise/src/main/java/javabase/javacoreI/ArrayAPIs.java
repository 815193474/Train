package javabase.javacoreI;

import java.util.Arrays;

/**
 * @Author luoguanzhong @Data 2020-08-19 10:43
 *
 * <p>数组练习 Arrays类的常用方法
 */
public class ArrayAPIs {
  public static void main(String args[]) {

    /*
     *  一维数组
     *  */
    {
      /* 声明数组的几种方式
       * 1. 数据类型后紧跟[] 和变量名字; java 规范推荐写法
       * 2. 也使用数据类型加变量名字紧跟[];
       * */
      int[] a; // 声明数组a 并没有创建数组
      int[] b = new int[10]; // 声明并创建大小为10的数组 数组大小不一定是常量 也可以是变量 n

      /*
       * 数组初始化及匿名数组
       * Java提供了一种创建数组对象并同时赋予初始值的简化书写形式。
       * */
      int[] array = {1, 2, 3, 4};

      /*
       * 甚至还可以初始化一个匿名的数组
       * new int[] {1,2,3};
       * array1 = new int[] {1,2,3};
       * */

      /*
       * 创建一个数字数组时， 所有元素都初始化为 0。boolean 数组的元素会初始化为 false。 对象数组的元素则初始化为一个特殊值 null
       * 数组创建后一般通过for循环来添加元素值
       */
      for (int i = 0; i < 10; i++) {
        b[i] = i;
      }

      /*
       * foreach 循环 可以用来依次处理数组中的每个元素（其他类型的元素集合亦可）而不必指定下标值
       * for (variable : collection) statement
       * */
      for (int n : b) {
        System.out.println(n);
      }

      /*
       * 打印数组除了使用循环打印还可以使用 Arrays.toString(b) 方法
       * */
      System.out.println(Arrays.toString(b));

      /*
       * 在 Java 中，允许将一个数组变量拷贝给另一个数组变量。这时， 两个变量将引用同一个数组
       * 所以在修改数组 b 之后 ，c的元素也发生改变
       * */
      int[] c = b;
      b[0] = 3;
      System.out.println(c[0]); // print 3
      for (int n : c) {
        System.out.println(n);
      }

      /*
       * Arrays.copyOf(array,length)
       * 实现将数组中小于长度那部分复制过去
       * length 长度小于原数组则复制原数组的一部分，长度大于原数组，那么多余的元素就会被默认赋值
       * 数值型赋值为 0
       * 布尔型赋值为 false
       * 对象赋值为 null
       * */
      int[] f = Arrays.copyOf(b, 11);
      System.out.println(Arrays.toString(f)); // f[10] 的值为0

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
       * 如果需要对数值类型的数组进行排序可以选择使用Arrays.sort(array)
       * */
      int[] array2 = {3, 1, 2, 5, 4, 6};
      Arrays.sort(array2);
      System.out.println(Arrays.toString(array2)); // print [1, 2, 3, 4, 5, 6]

      /*
       * static type copyOf(type[]a, int length)
       * 返回与 a 类型相同的一个数组， 其长度为 length
       * static type copyOfRange(type[]a , int start, int end)
       * 返回与 a 类型相同的一个数组， 其长度为end-start， 数组元素为 a 的值
       * */
      System.out.println(Arrays.toString(Arrays.copyOf(array2, 3))); // pint [1, 2, 3]
      System.out.println(Arrays.toString(Arrays.copyOfRange(array2, 2, 4))); // print [3, 4]

      /*
       * static int binarySearch(type[] a , type v)
       * static int binarySearch(type[]a, int start, int end, type v)
       * 采用二分搜索算法查找值 v。如果查找成功， 则返回相应的下标值； 否则， 返回一个负数值 。
       * */
      System.out.println(Arrays.binarySearch(array2, 3)); // print 2 元素3的下标
      System.out.println(Arrays.binarySearch(array2, 1, 3, 2)); // print 1 元素2的下标
      System.out.println(Arrays.binarySearch(array2, 1, 3, 4)); // print -4

      /*
       * static void fi11(type[]a , type v)
       * 将数组的所有数据元素值设置为 V
       * */
      Arrays.fill(array, 2);
      System.out.println(Arrays.toString(array)); // print [2, 2, 2, 2]

      /*
       * static boolean equals(type[]a, type[]b)
       * 如果两个数组大小相同， 并且下标相同的元素都对应相等， 返回 true。
       * */
      System.out.println(Arrays.equals(array, array2)); // print false
    }

    /*
     * 多维数组
     * */
    {
      /* 定义二维数组 */
      int[][] array3 = new int[3][3];
      System.out.println(array3.length);

      /* 向二维数组存入数据 */
      for (int i = 0; i < array3.length; i++) {
        for (int j = 0; j < array3[i].length; j++) {
          array3[i][j] = j + i;
        }
      }

      /*
       * Arrays.deepToString(array)
       * 打印二维数组
       * */
      System.out.println(Arrays.deepToString(array3));

      /* 遍历打印二维数组 */
      for (int[] arr : array3) {
        System.out.println(Arrays.toString(arr));
      }

      /* 访问二维数组 */
      System.out.println(array3[0][1]); // print 1
    }
  }
}
