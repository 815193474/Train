package sql.sql;

/**
 * @Author luoGuanzhong @Date 2020-09-06 17:44
 *
 * <p>sql 相关联合查询,嵌套查询,分组,排序
 *
 * <p>字符串数据是用单引号包在外面的，而+号只是用来连接这些字符串的. 数据库里的字段是整型的时候不要加单引号，是字符串的时候要加，其它类型根据实际情况来。
 * 双引号就是用来拼接字符串的，单引号是sql文的固有写法，因为你要动态的来拼接，涉及到变量，所以要用“+”来组合各个字符串片段。
 */
public class SqlAPIs {
	/*
	 * 嵌套查询
	 * select * from table1 where id in (select id from table2 where name=‘li');
	 * */
	
	/*
	 * 排序
	 * order by field(字段) desc/asc(降序/升序)
	 * select * from table1 order by price desc;//按照降序排列
	 * */
	
	/*
	 * distinct 用于查询表中某一列中唯一不同的值(即重复值，只返回一个)，
	 * SELECT DISTINCT 列名称 FROM 表名称
	 * */
	
	/*
	 * where
	 * SELECT 列名称 FROM 表名称 WHERE 列 运算符 值
	 * */
	
	/*
	 * and or
	 * AND 和 OR 可在 WHERE 子语句中把两个或多个条件结合起来。
	 * 如果第一个条件和第二个条件都成立，则 AND 运算符显示一条记录。
	 * 如果第一个条件和第二个条件中只要有一个成立，则 OR 运算符显示一条记录。
	 * */
	
	/*
	 * Insert 语句
	 * INSERT INTO 表名称 VALUES (值1, 值2,....)
	 * INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
	 * */
	
	/*
	 * update
	 * UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值
	 * UPDATE Person SET Address = 'Zhongshan23', City = 'Nanjing' WHERE LastName = 'Wilson'
	 *
	 * */
	
	/*
	 * delete
	 * DELETE FROM 表名称 WHERE 列名称 = 值
	 * 删除所有行
	 * DELETE FROM table_name / DELETE * FROM table_name
	 * */
	
	/*
	 * top 字句
	 * SELECT TOP 2 * FROM Persons  从"Persons" 表中选取头两条记录。
	 * SELECT TOP 50 PERCENT * FROM Persons  从"Persons" 表中选取 50% 的记录
	 *
	 * */
	
	/*
	 * like
	 * LIKE 操作符用于在 WHERE 子句中搜索列中的指定模式
	 * SELECT column_name(s) FROM table_name WHERE column_name LIKE pattern
	 * SELECT * FROM Persons WHERE City LIKE 'N%' N开头的信息
	 * 使用 NOT 关键字 取反
	 * 对于mysql 的 like 而言，一般都要用 like concat() 组合，可以防止sql注入
	 * like concat(%,param,%);
	 * */
	
	/*
	 * 通配符
	 * % 替代一个或多个字符
	 * _ 仅替代一个字符
	 * */
	
	/*
	 * between and
	 * 操作符 BETWEEN ... AND 会选取介于两个值之间的数据范围。这些值可以是数值、文本或者日期
	 * SELECT column_name(s) FROM table_name WHERE column_name BETWEEN value1 AND value2
	 *
	 * */
	
	/*
	 * 别名 as
	 * SELECT column_name(s) FROM table_name AS alias_name
	 * SELECT column_name AS alias_name FROM table_name
	 * */
	
	/*
	 * join
	 *  INNER JOIN（内连接）INNER JOIN 与 JOIN 是相同的。
	 * JOIN: 如果表中有至少一个匹配，则返回行
	 *	LEFT JOIN: 即使右表中没有匹配，也从左表返回所有的行
	 *	RIGHT JOIN: 即使左表中没有匹配，也从右表返回所有的行
	 *	FULL JOIN: 只要其中一个表中存在匹配，就返回行
	 *
	 * */
	
	/*
	 * drop
	 * ALTER TABLE table_name DROP INDEX index_name  删除索引
	 * DROP TABLE 表名称  删除表
	 * DROP DATABASE 数据库名称 删除数据库
	 * TRUNCATE 仅仅需要除去表内的数据，但并不删除表本身 truncate
	 * TRUNCATE TABLE 表名称
	 *
	 * */
	
	/*
	 * sql  常用 function
	 * AVG(column)	返回某列的平均值
	 * COUNT(column)	返回某列的行数（不包括 NULL 值）
	 * COUNT(*)	返回被选行数
	 * FIRST(column)	返回在指定的域中第一个记录的值
	 * LAST(column)	返回在指定的域中最后一个记录的值
	 * MAX(column)	返回某列的最高值
	 * MIN(column)	返回某列的最低值
	 * SUM(column)	返回某列的总和
	 *
	 * */
	
	/*
	 * format
	 * SELECT FORMAT(column_name,format) FROM table_name
	 * SELECT ProductName, UnitPrice, FORMAT(Now(),'YYYY-MM-DD') as PerDate FROM Products
	 * |gold	|32.35	|12/29/2008
	 *
	 * mybatis 中的格式化
	 * Date_Format()
	 * */
	
	/*
	 * group by
	 * GROUP BY 语句用于结合聚合函数，根据一个或多个列对结果集进行分组
	 * SELECT column_name, aggregate_function(column_name)
	 *	FROM table_name
	 *	WHERE column_name operator value
	 *	GROUP BY column_name;
	 *
	 * */
	
}
