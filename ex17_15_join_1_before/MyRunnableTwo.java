package ex17_15_join_1_before;

class MyRunnableTwo implements Runnable{

	public void run() {
		System.out.println("run");
		first();
	}
	
	public void first() {
		System.out.println("first");
		second();
	}
	
	public void second() {
		System.out.println("second");
		
	}

}
