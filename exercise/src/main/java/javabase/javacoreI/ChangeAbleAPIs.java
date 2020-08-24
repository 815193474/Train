package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-24 10:12
 *
 * <p>可变参数
 */
public class ChangeAbleAPIs {
	
	public static void main(String[] args) {
		System.out.println(max(1, 2, 3, 5, 4, 45, 2, 105, -111, 888));
	}
	
	/* 可变参数案例 求若干个数中的最大值 */
	private static double max(double... args) {
		
		/* Double.NEGATIVE_INFINITY
		 * 一个恒定的持有型 double负无穷大。它等于返回的值 Double.longBitsToDouble(0xfff0000000000000L)。
		 * Double.POSITIVE_INFINITY
		 * 一个恒定的持有型 double正无穷大。它等于返回的值 Double.longBitsToDouble(0x7ff0000000000000L)。
		 * */
		double largest = Double.NEGATIVE_INFINITY;
		for (double d : args) {
			if (largest < d) {
				largest = d;
			}
		}
		return largest;
	}
}
