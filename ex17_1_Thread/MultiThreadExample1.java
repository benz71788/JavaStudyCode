package ex17_1_Thread;

//알파벳과 숫자를 동시에 출력하는 멀티스레드 프로그램
/*
 * JVM이 스레드에 할당하는 시간과 실행 순서는 하드웨어의 성능이나 시스템 환경에
 * 따라 달라 실행 결과는 매번 다른 결과가 나올 수 있다.
 */
class MultiThreadExample1 {
	
	public static void main(String[] args) {
		
		Thread thread = new DigitThread(); //스레드 생성
		//thread를 실행 시킨다.
		thread.start();
		
		/*
		 * 	- start() 설명 : 
		 * 		Causes this thread to begin execution;
		 * 		the Java Virtual Machine calls the run method of this
		 * 		this thread(Thread thread = new DigitThread()의 thread)
		 * 		가 실행을 시작하도록 한다.
		 * 		Java 가상 머신이 스레드의 run() 메소드를 호출한다.
		 * 	- start() method는 java.lang.Thread 클래스의 메소드이다.
		 * 		새로 생성한 Thread를 start하면 Runnable 상태가 된다
		 * 	- thread.run(); 이렇게 호출 하지 않는다.
		 */
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
		
		System.out.println("스레드: " + Thread.currentThread().getName());
	}

}
