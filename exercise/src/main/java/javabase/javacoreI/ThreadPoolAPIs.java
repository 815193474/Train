package javabase.javacoreI;

/**
 * @author luoGuanzhong
 * @since 2020-09-17 10:34
 * <p>线程池的使用 使用 Executors 类的创建线程池的方法
 * <p>参考自博客园 https://www.cnblogs.com/CarpenterLee/p/9558026.html
 */
public class ThreadPoolAPIs {
	/*
	 * Executors 类的创建线程的方法如下：
	 * newFixedThreadPool(int nThreads)	创建固定大小的线程池
	 * newFixedThreadPool(int nThreads) newFixedThreadPoo
	 * newSingleThreadExecutor()	创建只有一个线程的线程池
	 * newCachedThreadPool()	创建一个不限线程数上限的线程池，任何提交的任务都将立即执行
	 * */
	
	/*
	 * Executors中创建线程池的快捷方法，
	 * 实际上是调用了ThreadPoolExecutor的构造方法（定时任务使用的是ScheduledThreadPoolExecutor），
	 * 该类构造方法参数列表如下
	 *	// Java线程池的完整构造函数
	 *	public ThreadPoolExecutor(
	 *	  int corePoolSize, // 线程池长期维持的线程数，即使线程处于Idle状态，也不会回收。
	 *	  int maximumPoolSize, // 线程数的上限
	 *	  long keepAliveTime, TimeUnit unit, // 超过corePoolSize的线程的idle时长，
	 *	                                     // 超过这个时间，多余的线程会被回收。
	 *	  BlockingQueue<Runnable> workQueue, // 任务的排队队列
	 *	  ThreadFactory threadFactory, // 新线程的产生方式
	 *	  RejectedExecutionHandler handler); // 拒绝策略
	 * */
	
	/*
	 * 可以向线程池提交的任务有两种：Runnable和Callable,他们的区别如下
	 * 提交方式																是否关心返回结果
	 * Future<T> submit(Callable<T> task)		是
	 * void execute(Runnable command)				否
	 * Future<?> submit(Runnable task)				否，虽然返回Future，但是其get()方法总是返回null
	 * */
	
	/*
	 * 不要使用Executors.newXXXThreadPool()快捷方法创建线程池，因为这种方式会使用无界的任务队列，
	 * 为避免OOM，我们应该使用ThreadPoolExecutor的构造方法手动指定队列的最大长度
	 * 示例代码：
	 * ExecutorService executorService = new ThreadPoolExecutor(2, 2,
	 * 				0, TimeUnit.SECONDS,
	 * 				new ArrayBlockingQueue<>(512), // 使用有界队列，避免OOM
	 * 				new ThreadPoolExecutor.DiscardPolicy());
	 * */
	
	/*
	 * 拒绝策略
	 * 拒绝策略								拒绝行为
	 * AbortPolicy						抛出RejectedExecutionException
	 * DiscardPolicy					什么也不做，直接忽略
	 * DiscardOldestPolicy		丢弃执行队列中最老的任务，尝试为当前提交的任务腾出位置
	 * CallerRunsPolicy			直接由提交任务者执行这个任务
	 *
	 *
	 * */
	
	/*
	 * 线程池的常用场景
	 * */
	
	/*
	 * 正确构造线程池示例：
	 *	int poolSize = Runtime.getRuntime().availableProcessors() * 2;
	 *	BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(512);
	 *	RejectedExecutionHandler policy = new ThreadPoolExecutor.DiscardPolicy();
	 *	executorService = new ThreadPoolExecutor(poolSize, poolSize,
	 *	    0, TimeUnit.SECONDS,
	 *	            queue,
	 *	            policy);
	 * */
	
	/*
	 * 获取单个线程的执行结果
	 * 通过submit()向线程池提交任务后会返回一个Future，调用V Future.get()方法能够阻塞等待执行结果，
	 * V get(long timeout, TimeUnit unit)方法可以指定等待的超时时间
	 *
	 * */
	
	/*
	 * 获取多个执行结果
	 * 如果向线程池提交了多个任务，要获取这些任务的执行结果，可以依次调用Future.get()获得。
	 * 但对于这种场景，我们更应该使用 ExecutorCompletionService，该类的take()方法总是阻塞等待某一个任务完成，然后返回该任务的Future对象。
	 * 向CompletionService批量提交任务后，只需调用相同次数的CompletionService.take()方法，就能获取所有任务的执行结果，
	 * 获取顺序是任意的，取决于任务的完成顺序
	 * 获取示例代码：
	 *void solve(Executor executor, Collection<Callable<Result>> solvers)
	 *   throws InterruptedException, ExecutionException {
	 *
	 *   CompletionService<Result> ecs = new ExecutorCompletionService<Result>(executor);// 构造器
	 *
	 *   for (Callable<Result> s : solvers)// 提交所有任务
	 *        ecs.submit(s);
	 *
	 *   int n = solvers.size();
	 *    for (int i = 0; i < n; ++i) {// 获取每一个完成的任务
	 *        Result r = ecs.take().get();
	 *        if (r != null)
	 *            use(r);
	 *    }
	 * }
	 *
	 *
	 * */
	
	/*
	 * 线程池捕获处理异常
	 * 线程池的处理结果、以及处理过程中的异常都被包装到Future中，并在调用Future.get()方法时获取，
	 * 执行过程中的异常会被包装成ExecutionException，submit()方法本身不会传递结果和任务执行过程中的异常。
	 *
	 * */
	
	/*
	 * 单个任务指定超时时间
	 * V Future.get(long timeout, TimeUnit unit)方法可以指定等待的超时时间，超时未完成会抛出TimeoutException
	 *
	 * */
	
	/*
	 * 多个任务超时时间
	 * 等待多个任务完成，并设置最大等待时间，可以通过CountDownLatch完成：
	 * 示例代码：
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
	 * 	  latch.await(10, TimeUnit.SECONDS); // 指定超时时间
	 *   }
	 *
	 * */
}
