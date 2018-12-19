package TreadClass;

public class ThreadOperation extends Thread{
	
	public void run() {
		super.run();
		try {
			for(int i = 0;i < 500000;i++) {
				if(this.isInterrupted()) {   //�ж��߳��Ƿ��Ѿ��ж�  this.Interrupted()��ǰ�߳��Ƿ��Ѿ��ж�
					System.out.println("�Ѿ���ֹͣ״̬�ˣ���Ҫ�˳���");
					throw new InterruptedException();
				}
				System.out.println("i="+(i+1));
			}
		}catch(InterruptedException e) {    //���ֹͣ�̵߳����ŷ���-��catch���
			
			System.out.println("���뵽catch����");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		try {
			ThreadOperation thread = new ThreadOperation();
			thread.start(); 
			Thread.sleep(2000);  //ֻ�ܿ��Ƶ�ǰ����ִ�е��߳�
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
		

	}

}
