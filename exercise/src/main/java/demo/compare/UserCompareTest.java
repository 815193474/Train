package demo.compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author luoGuanzhong
 * @Date 2020-09-06 21:48
 */
public class UserCompareTest {
	
	public static void main(String[] args) {
		//
		UserCompare[] compares = new UserCompare[3];
		UserCompare test1 = new UserCompare(2, "test1");
		UserCompare test2 = new UserCompare(1, "test2");
		UserCompare test3 = new UserCompare(0, "test3");
		compares[0] = test1;
		compares[1] = test3;
		compares[2] = test2;
		Arrays.sort(compares, new Comparator<UserCompare>() {
			@Override
			public int compare(UserCompare o1, UserCompare o2) {
				return o1.getId() - o2.getId();
			}
		});
		System.out.println(Arrays.toString(
				compares)); // print [UserCompare{id=0, name='test3'}, UserCompare{id=1, name='test2'}, UserCompare{id=2, name='test1'}]
	}
}
