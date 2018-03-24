package ex17_15_join_2;

class JoinEx {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " start");
		Runnable r = new MyRunnableTwo();
		Thread myThread = new Thread(r);
		myThread.start();
		try {
			//myThread�� �۾��� ���� ������ main �����尡 ��ٸ���.
			myThread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " end");
	}

}
