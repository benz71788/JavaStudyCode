package ex17_4_Runnable_Interface;

class MultithreadExample3 {
	
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
		
		/*
		 * 쓰레드는 우선순위(priority)라는 속성(멤버변수)을 가지고 있는데
		 * 이 우선순위의 값에 따라 쓰레드가 얻는 실행시간이 달라진다.
		 * 쓰레드가 수행하는 작업의 중요도에 따라 쓰레드의 우선순위를
		 * 서로 다르게 지정하여 특정 쓰레드가 더 많은 작업시간을 갖도록 할 수 있다
		 * 프로그램에서 우선 순위를 지정하지 않으면 우선 순위가 5로 출력된다.
		 * 최대 우선 순위 : public static final int MAX_PRIORITY = 10; 
		 * 순위 미지정     : public static final int NORM_PRIORITY = 5;
		 * 최저 순위       : public static final int MIN_PRIORITY = 1;
		 */
		System.out.println("Thread의 우선순위를 출력하는 부분");
		System.out.println("first priority = \t" + first.getPriority());
		System.out.println("second priority = \t" + second.getPriority());
		System.out.println("third priority = \t" + third.getPriority());
		first.start();
		second.start();
		third.start();
	}

}
