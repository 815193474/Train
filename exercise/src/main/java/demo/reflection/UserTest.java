package demo.reflection;

/**
 * @Author luoGuanzhong
 * @Date 2020-08-26 20:53
 */
@Table(name = "user")
public class UserTest {
	
	@Column(value = "id", type = "varchar")
	private String id;
	@Column(value = "username", type = "varchar")
	private String username;
	@Column(value = "password", type = "varchar")
	private String password;
	
}
