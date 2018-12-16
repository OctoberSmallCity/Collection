package TreadClass;
//currentThread()是当前线程的引用，返回代码段正在被哪个线程调用的信息
//isAlive()当前线程是否处于存活状态
public class IsAlive extends Thread {
	
	public IsAlive() {
		System.out.println("IsAlive - begin");
		System.out.println("Thread.currentThread.getName()="+
		Thread.currentThread().getName());
		System.out.println("Thread.currentThread.isAlive()="+
		Thread.currentThread().isAlive());
		System.out.println("this.getName()="+this.getName());//当前this是IsAlive的引用，是个线程类，但是这个线程类并没有设置名字，所以Thread默认给了一个Thread-0
		System.out.println("this.isAlive()="+this.isAlive());
		System.out.println("IsAlive - end");
		
	}
	
	public void run() {
		System.out.println("run - begin");
		System.out.println("Thread.currentThread.getName()="+
		Thread.currentThread().getName());
		System.out.println("Thread.currentThread.isAlive()="+
		Thread.currentThread().isAlive());
		System.out.println("this.getName()="+this.getName());
		System.out.println("this.isAlive()="+this.isAlive());
		System.out.println("run - end");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IsAlive myThread = new IsAlive();
        
        Thread t = new Thread(myThread);
        System.out.println("main begin="+t.isAlive()); 
        t.setName("T");
        t.start();  //currentThread()为Thread的引用,this为IsAlive的引用
        System.out.println("main end="+t.isAlive());
        
        //分割线
        System.out.println("main begin="+myThread.isAlive());
        myThread.setName("T");
        myThread.start();  //此时run方法中this与currentThread()都是IsAlive的引用
        try {
			myThread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("main end="+myThread.isAlive()); //此值不确定
        
	}

}
