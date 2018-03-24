package ex17_15_join_1_before;

class JoinEx {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " start");
		Runnable r = new MyRunnableTwo();
		Thread myThread = new Thread(r);
		myThread.start();
		
		System.out.println(Thread.currentThread().getName() + " end");
	}

}
