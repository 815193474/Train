package javabase.javacoreI;

/**
 * @Author luoGuanzhong
 * @Date 2020-08-23 16:55
 */
public class EqualsTest {
	
	public static void main(String[] args) {
		//
		ExtendsAPIs alicel = new ExtendsAPIs("Alice Adams", 75000);
		ExtendsAPIs alice2 = alicel;
		ExtendsAPIs alice3 = new ExtendsAPIs("Alice Adams", 75000);
		ExtendsAPIs bob = new ExtendsAPIs("Bob Brandson", 50000);
		System.out.println("alicel == alice2: " + (alicel == alice2));
		System.out.println("alicel == alice3: " + (alicel == alice3));
		System.out.println("alicel.equals(alice3): " + alicel.equals(alice3));
		System.out.println("alicel.equals(bob): " + alicel.equals(bob));
		System.out.println("bob.toString£º" + bob);
		
		
	}
	
}
