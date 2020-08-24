package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-24 10:12
 *
 * <p>�ɱ����
 */
public class ChangeAbleAPIs {
	
	public static void main(String[] args) {
		System.out.println(max(1, 2, 3, 5, 4, 45, 2, 105, -111, 888));
	}
	
	/* �ɱ�������� �����ɸ����е����ֵ */
	private static double max(double... args) {
		
		/* Double.NEGATIVE_INFINITY
		 * һ���㶨�ĳ����� double������������ڷ��ص�ֵ Double.longBitsToDouble(0xfff0000000000000L)��
		 * Double.POSITIVE_INFINITY
		 * һ���㶨�ĳ����� double������������ڷ��ص�ֵ Double.longBitsToDouble(0x7ff0000000000000L)��
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
