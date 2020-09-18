package demo.compare;

/**
 * @Author luoGuanzhong
 * @Date 2020-09-06 21:25
 *
 * ʵ��comparable�ӿڵ��� ʵ�ִ˽ӿڵĶ����б�����������Collections.sort(),��Arrays.sort()�����Զ�����
 */
public class UserCompareTo implements Comparable<UserCompareTo> {
	
	private int id;
	private String name;
	
	public UserCompareTo(int d, String n) {
		this.id = d;
		this.name = n;
	}
	
	@Override
	public String toString() {
		return "UserCompareTo{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
	
	@Override
	public int compareTo(UserCompareTo o) {
//		return o.id - id;
		return id - o.id;
	}
}
