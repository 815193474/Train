package javabase.javacoreI;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @Author luoGuanzhong @Date 2020-08-19 09:13
 *
 * <p>BigInteger ���⾫�ȵ��������� BigDecimal ���⾫�ȵĸ���������
 */
public class BigNumberAPIs {
  public static void main(String[] args) {

    /* ʹ��valueOf() ��������ͨ��ֵת���ɴ���ֵ */
    BigInteger a = BigInteger.valueOf(100);
    System.out.println(a); // print 100

    /* ����ʹ�ó���������е� ��+�� �� ��*�� ���������ʵ�ִ���ֵ������
     * ��Ҫʹ��
     * add()  ��
     * subtract() ��
     * multiply() ��
     * divide() ��
     * mod() ����
     * */
    BigInteger b = BigInteger.valueOf(50);
    BigInteger c = a.add(b); // �ȼ��� c = a + b
    System.out.println(c); // print 150
    BigInteger d = c.multiply(b); // �ȼ��� d = c * b
    System.out.println(d); // print 7500
    BigInteger f = d.subtract(c); // f = d - c
    System.out.println(f); // print 7350
    BigInteger g = f.divide(b); // g = f / b
    System.out.println(g); // print 147
    BigInteger h = f.mod(b); // h = f % b
    System.out.println(h); // print 0

    /*
    int compareTo(BigInteger other)
    ����������������һ�������� other ��ȣ� ���� 0; ������������С����һ������
    �� other, ���ظ����� ���� ��������
    */
    System.out.println(a.compareTo(b)); // print 1   a > b

    /*
    BigDecimal �ķ��������� BigInteger һ�� ��Ψ�� �� ��һ�� ��Ҫָ�����뷽ʽ ����û����������
    */
    BigDecimal j = BigDecimal.valueOf(100.0);
    System.out.println(j); // print 100.0
    BigDecimal k = BigDecimal.valueOf(3.0);
    BigDecimal l = j.divide(k, RoundingMode.UP); // ָ�����뷽ʽ
    System.out.println(l); // print 33.4

    /*
    static BigDecimal valueOf(long x ,int scale)
    ����ֵΪ X �� x / 10 ��scale�η� ��һ����ʵ��
    */
    System.out.println(j.valueOf(2,3)); // print    2 / 10*10*10
  }
}
