package demo.compare;

import java.util.Arrays;

/**
 * @Author luoGuanzhong
 * @Date 2020-09-06 21:28
 */
public class UserCompareToTest {
	
	public static void main(String[] args) {
		//
		UserCompareTo test1 = new UserCompareTo(2, "test1");
		UserCompareTo test2 = new UserCompareTo(1, "test2");
		UserCompareTo[] userCompareTos = new UserCompareTo[2];
		userCompareTos[0] = test1;
		userCompareTos[1] = test2;
		Arrays.sort(userCompareTos); // 使用Arrays.sort 进行排序
		System.out.println(Arrays.toString(
				userCompareTos)); // print [UserCompareTo{id=1, name='test2'}, UserCompareTo{id=2, name='test1'}]
		
	}
}
