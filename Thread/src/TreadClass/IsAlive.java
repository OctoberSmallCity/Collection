package TreadClass;
//currentThread()�ǵ�ǰ�̵߳����ã����ش�������ڱ��ĸ��̵߳��õ���Ϣ
//isAlive()��ǰ�߳��Ƿ��ڴ��״̬
public class IsAlive extends Thread {
	
	public IsAlive() {
		System.out.println("IsAlive - begin");
		System.out.println("Thread.currentThread.getName()="+
		Thread.currentThread().getName());
		System.out.println("Thread.currentThread.isAlive()="+
		Thread.currentThread().isAlive());
		System.out.println("this.getName()="+this.getName());//��ǰthis��IsAlive�����ã��Ǹ��߳��࣬��������߳��ಢû���������֣�����ThreadĬ�ϸ���һ��Thread-0
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
        t.start();  //currentThread()ΪThread������,thisΪIsAlive������
        System.out.println("main end="+t.isAlive());
        
        //�ָ���
        System.out.println("main begin="+myThread.isAlive());
        myThread.setName("T");
        myThread.start();  //��ʱrun������this��currentThread()����IsAlive������
        try {
			myThread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("main end="+myThread.isAlive()); //��ֵ��ȷ��
        
	}

}
