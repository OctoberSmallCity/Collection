package RunnableClass;
//Thread����Runnable�ӿڵĹ��췽����Thread(Runnable target),Thread(Runnable target,String name)
//������Դ�Ƕ�ͬһ�������Ĳ���������̲߳���ȫ������
public class MyThread implements Runnable{
/*    private volatile int count = 10;*/ //�޷���֤�̰߳�ȫ��ֻ�ܱ�֤���ڴ�д���̹߳����ڴ��ֵ�����µ�
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
	synchronized public void run() {   //����ʵ���̰߳�ȫ
		// TODO Auto-generated method stub
		count --;
		System.out.println(Thread.currentThread().getName()+"����"+count);
		
	}

}
