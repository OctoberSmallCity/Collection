package TreadClass;
//�߳�ִ��˳����������
//ִ��start����������˳�򲻴����߳�������˳��
public class MyThreadTest extends Thread{
	
	public void run() {
		for(int i = 0;i < 5;i++) {
			int time = (int) (Math.random()*1000);
			try {
				Thread.sleep(time);
				System.out.println("run = "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThreadTest myThread = new MyThreadTest();
		myThread.setName("MyThread");
		myThread.start();
		for(int i = 0;i < 5;i++) {
			int time = (int)(Math.random()*1000);
			try {
				Thread.sleep(time);
				System.out.println("main ="+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
