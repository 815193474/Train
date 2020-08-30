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
		StringBuilder builder = new StringBuilder(); // �����ַ�������
		builder.append("create table ");
		Class<UserTest> user = UserTest.class; // ���÷���õ�userTest ��
		Table table = user.getAnnotation(Table.class); // ͨ����ȡע���еķ����ഴ��tableʵ��
		builder.append(table.name() + "(\n");
		Field[] fields = user.getDeclaredFields(); // ��ȡuserʵ����������
		if (fields.length > 0) {
			for (Field f : fields) {
				if (f.isAnnotationPresent(Column.class)) { // �ж�ע�����Ƿ�ΪColumn
					Column column = f.getAnnotation(Column.class); // ͨ����ȡ���ע����columnʵ�ִ���column��
					builder.append(column.value() + " ");
					builder.append(column.type() + "(" + column.length() + ")" + ",");
				}
			}
			builder.deleteCharAt(builder.length() - 1); // ȥ�����һ������
			builder.append("\n)");
		}
		return builder.toString();
	}
}
