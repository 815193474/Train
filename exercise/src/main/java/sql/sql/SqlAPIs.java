package sql.sql;

/**
 * @Author luoGuanzhong @Date 2020-09-06 17:44
 *
 * <p>sql ������ϲ�ѯ,Ƕ�ײ�ѯ,����,����
 *
 * <p>�ַ����������õ����Ű�������ģ���+��ֻ������������Щ�ַ�����. ���ݿ�����ֶ������͵�ʱ��Ҫ�ӵ����ţ����ַ�����ʱ��Ҫ�ӣ��������͸���ʵ���������
 * ˫���ž�������ƴ���ַ����ģ���������sql�ĵĹ���д������Ϊ��Ҫ��̬����ƴ�ӣ��漰������������Ҫ�á�+������ϸ����ַ���Ƭ�Ρ�
 */
public class SqlAPIs {
	/*
	 * Ƕ�ײ�ѯ
	 * select * from table1 where id in (select id from table2 where name=��li');
	 * */
	
	/*
	 * ����
	 * order by field(�ֶ�) desc/asc(����/����)
	 * select * from table1 order by price desc;//���ս�������
	 * */
	
	/*
	 * distinct ���ڲ�ѯ����ĳһ����Ψһ��ͬ��ֵ(���ظ�ֵ��ֻ����һ��)��
	 * SELECT DISTINCT ������ FROM ������
	 * */
	
	/*
	 * where
	 * SELECT ������ FROM ������ WHERE �� ����� ֵ
	 * */
	
	/*
	 * and or
	 * AND �� OR ���� WHERE ������а����������������������
	 * �����һ�������͵ڶ����������������� AND �������ʾһ����¼��
	 * �����һ�������͵ڶ���������ֻҪ��һ���������� OR �������ʾһ����¼��
	 * */
	
	/*
	 * Insert ���
	 * INSERT INTO ������ VALUES (ֵ1, ֵ2,....)
	 * INSERT INTO table_name (��1, ��2,...) VALUES (ֵ1, ֵ2,....)
	 * */
	
	/*
	 * update
	 * UPDATE ������ SET ������ = ��ֵ WHERE ������ = ĳֵ
	 * UPDATE Person SET Address = 'Zhongshan23', City = 'Nanjing' WHERE LastName = 'Wilson'
	 *
	 * */
	
	/*
	 * delete
	 * DELETE FROM ������ WHERE ������ = ֵ
	 * ɾ��������
	 * DELETE FROM table_name / DELETE * FROM table_name
	 * */
	
	/*
	 * top �־�
	 * SELECT TOP 2 * FROM Persons  ��"Persons" ����ѡȡͷ������¼��
	 * SELECT TOP 50 PERCENT * FROM Persons  ��"Persons" ����ѡȡ 50% �ļ�¼
	 *
	 * */
	
	/*
	 * like
	 * LIKE ������������ WHERE �Ӿ����������е�ָ��ģʽ
	 * SELECT column_name(s) FROM table_name WHERE column_name LIKE pattern
	 * SELECT * FROM Persons WHERE City LIKE 'N%' N��ͷ����Ϣ
	 * ʹ�� NOT �ؼ��� ȡ��
	 * ����mysql �� like ���ԣ�һ�㶼Ҫ�� like concat() ��ϣ����Է�ֹsqlע��
	 * like concat(%,param,%);
	 * */
	
	/*
	 * ͨ���
	 * % ���һ�������ַ�
	 * _ �����һ���ַ�
	 * */
	
	/*
	 * between and
	 * ������ BETWEEN ... AND ��ѡȡ��������ֵ֮������ݷ�Χ����Щֵ��������ֵ���ı���������
	 * SELECT column_name(s) FROM table_name WHERE column_name BETWEEN value1 AND value2
	 *
	 * */
	
	/*
	 * ���� as
	 * SELECT column_name(s) FROM table_name AS alias_name
	 * SELECT column_name AS alias_name FROM table_name
	 * */
	
	/*
	 * join
	 *  INNER JOIN�������ӣ�INNER JOIN �� JOIN ����ͬ�ġ�
	 * JOIN: �������������һ��ƥ�䣬�򷵻���
	 *	LEFT JOIN: ��ʹ�ұ���û��ƥ�䣬Ҳ����������е���
	 *	RIGHT JOIN: ��ʹ�����û��ƥ�䣬Ҳ���ұ������е���
	 *	FULL JOIN: ֻҪ����һ�����д���ƥ�䣬�ͷ�����
	 *
	 * */
	
	/*
	 * drop
	 * ALTER TABLE table_name DROP INDEX index_name  ɾ������
	 * DROP TABLE ������  ɾ����
	 * DROP DATABASE ���ݿ����� ɾ�����ݿ�
	 * TRUNCATE ������Ҫ��ȥ���ڵ����ݣ�������ɾ������ truncate
	 * TRUNCATE TABLE ������
	 *
	 * */
	
	/*
	 * sql  ���� function
	 * AVG(column)	����ĳ�е�ƽ��ֵ
	 * COUNT(column)	����ĳ�е������������� NULL ֵ��
	 * COUNT(*)	���ر�ѡ����
	 * FIRST(column)	������ָ�������е�һ����¼��ֵ
	 * LAST(column)	������ָ�����������һ����¼��ֵ
	 * MAX(column)	����ĳ�е����ֵ
	 * MIN(column)	����ĳ�е����ֵ
	 * SUM(column)	����ĳ�е��ܺ�
	 *
	 * */
	
	/*
	 * format
	 * SELECT FORMAT(column_name,format) FROM table_name
	 * SELECT ProductName, UnitPrice, FORMAT(Now(),'YYYY-MM-DD') as PerDate FROM Products
	 * |gold	|32.35	|12/29/2008
	 *
	 * mybatis �еĸ�ʽ��
	 * Date_Format()
	 * */
	
	/*
	 * group by
	 * GROUP BY ������ڽ�ϾۺϺ���������һ�������жԽ�������з���
	 * SELECT column_name, aggregate_function(column_name)
	 *	FROM table_name
	 *	WHERE column_name operator value
	 *	GROUP BY column_name;
	 *
	 * */
	
}
