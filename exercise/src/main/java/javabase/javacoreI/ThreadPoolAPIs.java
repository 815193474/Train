package javabase.javacoreI;

/**
 * @author luoGuanzhong
 * @since 2020-09-17 10:34
 * <p>�̳߳ص�ʹ�� ʹ�� Executors ��Ĵ����̳߳صķ���
 * <p>�ο��Բ���԰ https://www.cnblogs.com/CarpenterLee/p/9558026.html
 */
public class ThreadPoolAPIs {
	/*
	 * Executors ��Ĵ����̵߳ķ������£�
	 * newFixedThreadPool(int nThreads)	�����̶���С���̳߳�
	 * newFixedThreadPool(int nThreads) newFixedThreadPoo
	 * newSingleThreadExecutor()	����ֻ��һ���̵߳��̳߳�
	 * newCachedThreadPool()	����һ�������߳������޵��̳߳أ��κ��ύ�����񶼽�����ִ��
	 * */
	
	/*
	 * Executors�д����̳߳صĿ�ݷ�����
	 * ʵ�����ǵ�����ThreadPoolExecutor�Ĺ��췽������ʱ����ʹ�õ���ScheduledThreadPoolExecutor����
	 * ���๹�췽�������б�����
	 *	// Java�̳߳ص��������캯��
	 *	public ThreadPoolExecutor(
	 *	  int corePoolSize, // �̳߳س���ά�ֵ��߳�������ʹ�̴߳���Idle״̬��Ҳ������ա�
	 *	  int maximumPoolSize, // �߳���������
	 *	  long keepAliveTime, TimeUnit unit, // ����corePoolSize���̵߳�idleʱ����
	 *	                                     // �������ʱ�䣬������̻߳ᱻ���ա�
	 *	  BlockingQueue<Runnable> workQueue, // ������ŶӶ���
	 *	  ThreadFactory threadFactory, // ���̵߳Ĳ�����ʽ
	 *	  RejectedExecutionHandler handler); // �ܾ�����
	 * */
	
	/*
	 * �������̳߳��ύ�����������֣�Runnable��Callable,���ǵ���������
	 * �ύ��ʽ																�Ƿ���ķ��ؽ��
	 * Future<T> submit(Callable<T> task)		��
	 * void execute(Runnable command)				��
	 * Future<?> submit(Runnable task)				����Ȼ����Future��������get()�������Ƿ���null
	 * */
	
	/*
	 * ��Ҫʹ��Executors.newXXXThreadPool()��ݷ��������̳߳أ���Ϊ���ַ�ʽ��ʹ���޽��������У�
	 * Ϊ����OOM������Ӧ��ʹ��ThreadPoolExecutor�Ĺ��췽���ֶ�ָ�����е���󳤶�
	 * ʾ�����룺
	 * ExecutorService executorService = new ThreadPoolExecutor(2, 2,
	 * 				0, TimeUnit.SECONDS,
	 * 				new ArrayBlockingQueue<>(512), // ʹ���н���У�����OOM
	 * 				new ThreadPoolExecutor.DiscardPolicy());
	 * */
	
	/*
	 * �ܾ�����
	 * �ܾ�����								�ܾ���Ϊ
	 * AbortPolicy						�׳�RejectedExecutionException
	 * DiscardPolicy					ʲôҲ������ֱ�Ӻ���
	 * DiscardOldestPolicy		����ִ�ж��������ϵ����񣬳���Ϊ��ǰ�ύ�������ڳ�λ��
	 * CallerRunsPolicy			ֱ�����ύ������ִ���������
	 *
	 *
	 * */
	
	/*
	 * �̳߳صĳ��ó���
	 * */
	
	/*
	 * ��ȷ�����̳߳�ʾ����
	 *	int poolSize = Runtime.getRuntime().availableProcessors() * 2;
	 *	BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(512);
	 *	RejectedExecutionHandler policy = new ThreadPoolExecutor.DiscardPolicy();
	 *	executorService = new ThreadPoolExecutor(poolSize, poolSize,
	 *	    0, TimeUnit.SECONDS,
	 *	            queue,
	 *	            policy);
	 * */
	
	/*
	 * ��ȡ�����̵߳�ִ�н��
	 * ͨ��submit()���̳߳��ύ�����᷵��һ��Future������V Future.get()�����ܹ������ȴ�ִ�н����
	 * V get(long timeout, TimeUnit unit)��������ָ���ȴ��ĳ�ʱʱ��
	 *
	 * */
	
	/*
	 * ��ȡ���ִ�н��
	 * ������̳߳��ύ�˶������Ҫ��ȡ��Щ�����ִ�н�����������ε���Future.get()��á�
	 * ���������ֳ��������Ǹ�Ӧ��ʹ�� ExecutorCompletionService�������take()�������������ȴ�ĳһ��������ɣ�Ȼ�󷵻ظ������Future����
	 * ��CompletionService�����ύ�����ֻ�������ͬ������CompletionService.take()���������ܻ�ȡ���������ִ�н����
	 * ��ȡ˳��������ģ�ȡ������������˳��
	 * ��ȡʾ�����룺
	 *void solve(Executor executor, Collection<Callable<Result>> solvers)
	 *   throws InterruptedException, ExecutionException {
	 *
	 *   CompletionService<Result> ecs = new ExecutorCompletionService<Result>(executor);// ������
	 *
	 *   for (Callable<Result> s : solvers)// �ύ��������
	 *        ecs.submit(s);
	 *
	 *   int n = solvers.size();
	 *    for (int i = 0; i < n; ++i) {// ��ȡÿһ����ɵ�����
	 *        Result r = ecs.take().get();
	 *        if (r != null)
	 *            use(r);
	 *    }
	 * }
	 *
	 *
	 * */
	
	/*
	 * �̳߳ز������쳣
	 * �̳߳صĴ��������Լ���������е��쳣������װ��Future�У����ڵ���Future.get()����ʱ��ȡ��
	 * ִ�й����е��쳣�ᱻ��װ��ExecutionException��submit()���������ᴫ�ݽ��������ִ�й����е��쳣��
	 *
	 * */
	
	/*
	 * ��������ָ����ʱʱ��
	 * V Future.get(long timeout, TimeUnit unit)��������ָ���ȴ��ĳ�ʱʱ�䣬��ʱδ��ɻ��׳�TimeoutException
	 *
	 * */
	
	/*
	 * �������ʱʱ��
	 * �ȴ����������ɣ����������ȴ�ʱ�䣬����ͨ��CountDownLatch��ɣ�
	 * ʾ�����룺
	 * public void testLatch(ExecutorService executorService, List<Runnable> tasks)
	 * 	throws InterruptedException{
	 *
	 *     CountDownLatch latch = new CountDownLatch(tasks.size());
	 *       for(Runnable r : tasks){
	 *           executorService.submit(new Runnable() {
	 *               @Override
	 *               public void run() {
	 *                   try{
	 *                       r.run();
	 *                   }finally {
	 *                       latch.countDown();// countDown
	 *                   }
	 *               }
	 *           });
	 *       }
	 * 	  latch.await(10, TimeUnit.SECONDS); // ָ����ʱʱ��
	 *   }
	 *
	 * */
}
