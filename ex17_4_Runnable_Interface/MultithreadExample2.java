package ex17_4_Runnable_Interface;

class MultithreadExample2 {
	
	public static void main(String[] args) {
		ThreadLife t1 = new ThreadLife();
		
		//첫 번째 Thread 생성
		Thread first = new Thread(t1, "first1");
		//생성자 형식 : Thread(Runnable target, String name)
		//Allocates a new Thread object.
		
		//두 번째 Thread 생성
		Thread second = new Thread(t1, "second1");
		
		//세 번째 Thread 생성
		Thread third = new Thread(t1, "thrid1");
		
		first.start();
		second.start();
		third.start();
	}

}
