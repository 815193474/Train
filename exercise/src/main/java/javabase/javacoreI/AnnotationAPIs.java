package javabase.javacoreI;

/**
 * @Author luoGuanzhong
 * @Date 2020-09-06 16:25
 *
 * annotation 注解
 */
public class AnnotationAPIs {
	
	/*
	 * Retention 注解 解释说明了这个注解的存活时间
	 * 	RetentionPolicy.SOURCE 只在源码阶段保留，编码一起进行编译是将被丢弃忽视
	 * 	RetentionPolicy.CLASS 保留到编译进行的时候，并不会被加载到JVM中
	 * 	RetentionPolicy.RUNTIME 保留到程序运行的时候， 会被加载到JVM中，可以在程序运行时获取到
	 *
	 * */
	
	/*
	 * @Documented 能够将注解中的元素包含到Javadoc中
	 * */
	
	/*
	 * @Target  指定了注解运用的地方,如果不写的话,可以在类,方法,域中都可以使用
	 * ElementType.ANNOTATION_TYPE : 可以给一个注解进行注解
	 * ElementType.CONSTRUCTOR 可以给构造方法进行注解
	 * ElementType.FIELD : 可以给属性进行注解
	 * ElementType.LOCAL_VARIABLE : 可以给局部变量进行注解
	 * ElementType.METHOD : 可以给方法进行注解
	 * ElementType.PACKAGE : 可以给一个包进行注解
	 * ElementType.PARAMETER : 可以给一个方法内的参数进行注解
	 * ElementType.TYPE : 可以给一个类型进行注解, 比如 类、接口、枚举
	 *
	 * */
	
	/*
	 * @Inherited : 一个超类被@Inherited注解过的注解进行注解的话,那么如果它的子类没有被任何注解应用的话,那么这个子类就继承了超类的注解
	 *
	 * */
	
	/*
	 * @Repeatable : 对声明或类型使用应用相同的批注.
	 *
	 * */
	
	/*
	 * 	自定义注解 修饰符 @interface 注解名称
	 *
	 * */
	
	/*
	 * 常用注解
	 * @Override : 表示当前方法覆盖了父类方法
	 *	@Deprecation : 表示方法已经过时,使用时会有警告
	 *	@SuppressWarnings : 表示关闭一些警告信息(用来指定java编译器忽略特定的编译警告)
	 *	@SafeVarargs : (JDK1.7更新)表示专门抑制警告
	 *	@FunctionalInterface : (JDK1.8更新) 表示修饰的该接口必须是函数式接口,否则编译时会报错
	 *
	 * */
}
