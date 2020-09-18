package javabase.javacoreI;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @Author luoGuanzhong @Date 2020-08-19 09:13
 *
 * <p>BigInteger 任意精度的整数运算 BigDecimal 任意精度的浮点数运算
 */
public class BigNumberAPIs {
  public static void main(String[] args) {

    /* 使用valueOf() 方法将普通数值转换成大数值 */
    BigInteger a = BigInteger.valueOf(100);
    System.out.println(a); // print 100

    /* 不能使用常用运算符中的 ‘+’ 和 ’*‘ 等运算符来实现大数值的运算
     * 需要使用
     * add()  加
     * subtract() 差
     * multiply() 积
     * divide() 商
     * mod() 余数
     * */
    BigInteger b = BigInteger.valueOf(50);
    BigInteger c = a.add(b); // 等价于 c = a + b
    System.out.println(c); // print 150
    BigInteger d = c.multiply(b); // 等价于 d = c * b
    System.out.println(d); // print 7500
    BigInteger f = d.subtract(c); // f = d - c
    System.out.println(f); // print 7350
    BigInteger g = f.divide(b); // g = f / b
    System.out.println(g); // print 147
    BigInteger h = f.mod(b); // h = f % b
    System.out.println(h); // print 0

    /*
    int compareTo(BigInteger other)
    如果这个大整数与另一个大整数 other 相等， 返回 0; 如果这个大整数小于另一个大整
    数 other, 返回负数； 否则， 返回正数
    */
    System.out.println(a.compareTo(b)); // print 1   a > b

    /*
    BigDecimal 的方法基本和 BigInteger 一样 ，唯独 商 不一样 需要指定舍入方式 并且没有求余运算
    */
    BigDecimal j = BigDecimal.valueOf(100.0);
    System.out.println(j); // print 100.0
    BigDecimal k = BigDecimal.valueOf(3.0);
    BigDecimal l = j.divide(k, RoundingMode.UP); // 指定舍入方式
    System.out.println(l); // print 33.4

    /*
    static BigDecimal valueOf(long x ,int scale)
    返回值为 X 或 x / 10 的scale次方 的一个大实数
    */
    System.out.println(j.valueOf(2,3)); // print    2 / 10*10*10
  }
}
