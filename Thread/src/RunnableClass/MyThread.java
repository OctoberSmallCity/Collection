package RunnableClass;
//Thread关于Runnable接口的构造方法：Thread(Runnable target),Thread(Runnable target,String name)
//共享资源是对同一个变量的操作会出现线程不安全的现象
public class MyThread implements Runnable{
/*    private volatile int count = 10;*/ //无法保证线程安全，只能保证主内存写到线程工作内存的值是最新的
	public int count = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		Thread a = new Thread(myThread,"a");
		Thread b = new Thread(myThread,"b");
		Thread c = new Thread(myThread,"c");
		a.start();
		b.start();
		c.start();
	}

	@Override
	synchronized public void run() {   //加锁实现线程安全
		// TODO Auto-generated method stub
		count --;
		System.out.println(Thread.currentThread().getName()+"计算"+count);
		
	}

}
