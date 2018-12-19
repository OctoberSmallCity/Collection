package TreadClass;

public class ThreadOperation extends Thread{
	
	public void run() {
		super.run();
		try {
			for(int i = 0;i < 500000;i++) {
				if(this.isInterrupted()) {   //判断线程是否已经中断  this.Interrupted()当前线程是否已经中断
					System.out.println("已经是停止状态了！我要退出了");
					throw new InterruptedException();
				}
				System.out.println("i="+(i+1));
			}
		}catch(InterruptedException e) {    //如何停止线程的最优方法-用catch语句
			
			System.out.println("进入到catch中了");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		try {
			ThreadOperation thread = new ThreadOperation();
			thread.start(); 
			Thread.sleep(2000);  //只能控制当前正在执行的线程
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
		

	}

}
