package TreadClass;
//继承Thread类
//运行结果和代码执行顺序或调用顺序无关(线程调用的随机性)
public class MyThread extends Thread{
	
	public void run() {
		super.run();
		System.out.println("MyThread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.start(); //多次调用会抛出异常，第二次调用时，线程可能处于终止或其他（非new）状态
		System.out.println("运行结束！");

	}

}
