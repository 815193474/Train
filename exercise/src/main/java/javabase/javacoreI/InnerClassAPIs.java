package javabase.javacoreI;

/**
 * @Author luoGuanzhong
 * @Date 2020-08-26 16:11
 *
 * 内部类使用
 */
public class InnerClassAPIs {
	
	private int age;
	private Inner inner;
	
	InnerClassAPIs(int age) {
		this.age = age;
		Inner inner = new Inner();
		this.inner = inner;
		
	}
	
	@Override
	public String toString() {
		return "InnerClassAPIs{" +
				"age=" + age +
				", inner=" + inner +
				'}';
	}
	
	class Inner {
		
		private int number;
		
		public Inner() {
			this.number = age;
		}
		
		@Override
		public String toString() {
			return "Inner{" +
					"number=" + number +
					'}';
		}
	}
	
	public static void main(String[] args) {
		//
		InnerClassAPIs innerClassAPIs = new InnerClassAPIs(12);
		System.out.println(innerClassAPIs);
	}
}
