package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-09-03 14:35
 *
 * <p>Thread �߳�
 */
public class ThreadAPIs {
	/*
	 * Thread(Runnable target)
	 *	����һ�����̣߳� ���ڵ��ø���Ŀ��� nm() ������
	 *	void start( )
	 *	��������̣߳� ���������� mn() ����������������������أ� �������߳̽��������С�
	 *	void run( )
	 *	���ù��� Runnable �� run ������
	 * */
	
	/*
	 *
	 * ? void interrupt()
	 * ���̷߳����ж������̵߳��ж�״̬��������Ϊ true�����Ŀǰ���̱߳�һ�� sleep
	 * ������������ô��InterruptedException �쳣���׳���
	 * ?static boolean interrupted()
	 * ���Ե�ǰ�̣߳�������ִ����һ������̣߳��Ƿ��жϡ�ע�⣬����һ����̬������
	 * ��һ���û���������á�������ǰ�̵߳��ж�״̬����Ϊ false��
	 * ? boolean isInterrupted()
	 * �����߳��Ƿ���ֹ������̬���жϷ�������һ���ò��ı��̵߳��ж�״̬��
	 * ?static Thread currentThread()
	 * ���ش���ǰִ���̵߳� Thread ����
	 *
	 *
	 *
	 * */
	
	/*
	 * ?New (�´�����
	 *	?Runnable (�����У�
	 *	?Blocked (��������
	 *	?Waiting (�ȴ���
	 *	?Timed waiting (��ʱ�ȴ���
	 *	?Terminated (����ֹ��
	 * */
	
	/*
	 * void join( )
	 *	�ȴ���ָֹ�����̡߳�
	 *	void join(long millis)
	 *	�ȴ�ָ�����߳��������߾���ָ���ĺ�������
	 *
	 * */
	
	/*
	 * ?void setPriority(int newPriority)
	 *	�����̵߳����ȼ������ȼ������� Thread.MIN_PRIORITY �� Thread.MAX_PRIORITY
	 *	֮�䡣
	 *	?static int MIN_PRIORITY
	 *	�̵߳���С���ȼ�����С���ȼ���ֵΪ 1��
	 *	?static int N0RM_PRIORITY
	 *	�̵߳�Ĭ�����ȼ���Ĭ�����ȼ�Ϊ 5��
	 *
	 * */
	
	/*
	 * ?static int MAX_PRIORITY
	 * �̵߳�������ȼ���������ȼ���ֵΪ 10��
	 * ?static void yield( )
	 * ���µ�ǰִ���̴߳����ò�״̬������������Ŀ������߳̾�����������߳�ͬ����
	 * �����ȼ�����ô��Щ�߳̽������ᱻ���ȡ�ע�⣬����һ����̬������
	 *
	 * */
	
	/*
	 * void setDaemon( boolean isDaemon )
	 * ��ʶ���߳�Ϊ�ػ��̻߳��û��̡߳���һ�����������߳�����֮ǰ����
	 * */
}
