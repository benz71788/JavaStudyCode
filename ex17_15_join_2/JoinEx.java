package ex17_15_join_2;

class JoinEx {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " start");
		Runnable r = new MyRunnableTwo();
		Thread myThread = new Thread(r);
		myThread.start();
		try {
			//myThread의 작업이 끝날 때가지 main 스레드가 기다린다.
			myThread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " end");
	}

}
