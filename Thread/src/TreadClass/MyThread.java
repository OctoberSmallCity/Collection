package TreadClass;
//�̳�Thread��
//���н���ʹ���ִ��˳������˳���޹�(�̵߳��õ������)
public class MyThread extends Thread{
	
	public void run() {
		super.run();
		System.out.println("MyThread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.start(); //��ε��û��׳��쳣���ڶ��ε���ʱ���߳̿��ܴ�����ֹ����������new��״̬
		System.out.println("���н�����");

	}

}
