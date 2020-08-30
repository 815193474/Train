package demo.reflection;

import java.lang.reflect.Field;

/**
 * @Author luoGuanzhong @Date 2020-08-26 21:01
 */
public class CreatSql {
	
	public static void main(String[] args) {
		//
		String sql = getSql();
		System.out.println(sql);
	}
	
	public static String getSql() {
		StringBuilder builder = new StringBuilder(); // 创建字符串容器
		builder.append("create table ");
		Class<UserTest> user = UserTest.class; // 利用反射得到userTest 类
		Table table = user.getAnnotation(Table.class); // 通过获取注解中的反射类创建table实例
		builder.append(table.name() + "(\n");
		Field[] fields = user.getDeclaredFields(); // 获取user实例的所有域
		if (fields.length > 0) {
			for (Field f : fields) {
				if (f.isAnnotationPresent(Column.class)) { // 判断注解类是否为Column
					Column column = f.getAnnotation(Column.class); // 通过获取域的注解类column实现创建column类
					builder.append(column.value() + " ");
					builder.append(column.type() + "(" + column.length() + ")" + ",");
				}
			}
			builder.deleteCharAt(builder.length() - 1); // 去掉最后一个逗号
			builder.append("\n)");
		}
		return builder.toString();
	}
}
