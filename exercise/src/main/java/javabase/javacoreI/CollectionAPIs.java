package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-30 21:47
 *
 * <p>Collection ����
 *
 * <p>java.util.Collection ��һ�����Ͻӿڣ��������һ�������ӿڣ������ṩ�˶Լ��϶�����л���������ͨ�ýӿڷ���
 */
public class CollectionAPIs {

  /*
  * �����뼯�ϵ�����
  	��������
  		����ĳ����ǹ̶���
  		���ϵĳ����ǿɱ�ġ�
  	�洢�������͵�����
  		������Դ洢�����������ͣ�Ҳ���Դ洢������������
  		����ֻ�ܴ洢������������
  	��������
  		����ֻ�ܴ洢ͬ�����͵�����
  		���Ͽ��Դ洢��ͬ���͵�Ԫ��
  *
  * */

  /*
  Collection ���ϣ�
   * boolean add(Object obj):���һ��Ԫ��
   * boolean addAll(Collection c):���һ�����ϵ�Ԫ�� (��һ��������ӽ���һ�������е�����Ԫ��)
   * void clear():�Ƴ�����Ԫ��
   * boolean remove(Object o):�Ƴ�һ��Ԫ��
   * boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��(�Ƴ�һ�����Ϸ��صľ���true) ɾ����Ԫ�����������ϵĽ���Ԫ��
   * boolean contains(Object o)���жϼ������Ƿ����ָ����Ԫ��
   * boolean containsAll(Collection c)��
   * �жϼ������Ƿ����ָ���ļ���Ԫ��(������� ���� ��һ�����������е�Ԫ�ز������ �ŷ���true)
   * boolean isEmpty()���жϼ����Ƿ�Ϊ��
   * boolean retainAll(Collection c):��ȡ�������ϵĽ���Ԫ��(�������������϶��е�Ԫ��)
   * ע�� ��A���϶�B����ȡ��������ȡ���Ľ���Ԫ����A�����С����صĲ���ֵ��ʾ����A�����Ƿ����仯
   * Object[] toArray() �Ѽ���ת��Ϊ����
   * int size():Ԫ�صĸ��������ȹ��ܣ�
   * Iterator <E> iterator() ����һ�����ڷ��ʼ�����ÿ��Ԫ�صĵ�������
   * default boolean removeIf(Predicate<? super E> filter)
   * ���������ɾ�� filter ���� true ������Ԫ�ء��������������øı��˼��ϣ� �򷵻� true��
   * */
	
	/*
	 * ���м���
	 * ArrayList											һ�ֿ��Զ�̬��������������������
	 * LinkedList											һ�ֿ������κ�λ�ý��и�Ч�ز��˺�ɾ����������������
	 * ArrayDeque											һ����ѭ������ʵ�ֵ�˫�˶���
	 * HashSet												һ��û���ظ�Ԫ�ص����򼯺�
	 * TreeSet												��������
	 * EnumSet												һ�ְ���ö������ֵ�ļ�
	 * LinkedHashSet									һ�ֿ��Լ�סԪ�ز��˴���ļ�
	 * PriorityQueue									һ�������Чɾ����СԪ�صļ���
	 * HashMap												һ�ִ洢�� / ֵ���������ݽṹ
	 * TreeMap												���ּ�ֵ�������е�ӳ���
	 * EnumMap												һ�ּ�ֵ����ö�����͵�ӳ���
	 * LinkedHashMap									һ�ֿ��Լ�ס�� / ֵ����Ӵ����ӳ���
	 * WeakHashMap										һ����ֵ������֮�غ���Ա��������������յ�ӳ���
	 * IdentityHashMap								һ���� = �������� equals �Ƚϼ�ֵ��ӳ���
	 *
	 *
	 * */
	
}
