package javabase.javacoreI;

/**
 * @Author luoGuanzhong
 * @Date 2020-09-06 16:25
 *
 * annotation ע��
 */
public class AnnotationAPIs {
	
	/*
	 * Retention ע�� ����˵�������ע��Ĵ��ʱ��
	 * 	RetentionPolicy.SOURCE ֻ��Դ��׶α���������һ����б����ǽ�����������
	 * 	RetentionPolicy.CLASS ������������е�ʱ�򣬲����ᱻ���ص�JVM��
	 * 	RetentionPolicy.RUNTIME �������������е�ʱ�� �ᱻ���ص�JVM�У������ڳ�������ʱ��ȡ��
	 *
	 * */
	
	/*
	 * @Documented �ܹ���ע���е�Ԫ�ذ�����Javadoc��
	 * */
	
	/*
	 * @Target  ָ����ע�����õĵط�,�����д�Ļ�,��������,����,���ж�����ʹ��
	 * ElementType.ANNOTATION_TYPE : ���Ը�һ��ע�����ע��
	 * ElementType.CONSTRUCTOR ���Ը����췽������ע��
	 * ElementType.FIELD : ���Ը����Խ���ע��
	 * ElementType.LOCAL_VARIABLE : ���Ը��ֲ���������ע��
	 * ElementType.METHOD : ���Ը���������ע��
	 * ElementType.PACKAGE : ���Ը�һ��������ע��
	 * ElementType.PARAMETER : ���Ը�һ�������ڵĲ�������ע��
	 * ElementType.TYPE : ���Ը�һ�����ͽ���ע��, ���� �ࡢ�ӿڡ�ö��
	 *
	 * */
	
	/*
	 * @Inherited : һ�����౻@Inheritedע�����ע�����ע��Ļ�,��ô�����������û�б��κ�ע��Ӧ�õĻ�,��ô�������ͼ̳��˳����ע��
	 *
	 * */
	
	/*
	 * @Repeatable : ������������ʹ��Ӧ����ͬ����ע.
	 *
	 * */
	
	/*
	 * 	�Զ���ע�� ���η� @interface ע������
	 *
	 * */
	
	/*
	 * ����ע��
	 * @Override : ��ʾ��ǰ���������˸��෽��
	 *	@Deprecation : ��ʾ�����Ѿ���ʱ,ʹ��ʱ���о���
	 *	@SuppressWarnings : ��ʾ�ر�һЩ������Ϣ(����ָ��java�����������ض��ı��뾯��)
	 *	@SafeVarargs : (JDK1.7����)��ʾר�����ƾ���
	 *	@FunctionalInterface : (JDK1.8����) ��ʾ���εĸýӿڱ����Ǻ���ʽ�ӿ�,�������ʱ�ᱨ��
	 *
	 * */
}
