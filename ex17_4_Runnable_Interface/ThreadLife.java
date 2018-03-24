package ex17_4_Runnable_Interface;

//순서대로 안나와요 - 실행할 때마다 결과가 달라진다
class ThreadLife implements Runnable{
	//반드시 오버라이딩 해야 한다.
	public void run() {
		for(int i = 1; i < 3; i++) {
			//현재 실행 중인 Thread의 이름과 정수 출력
			System.out.println("현재 실행 중인 스레드의 이름은 " + 
					Thread.currentThread().getName() + "이고, "
					+ "\t number = " + i);
		}
	}
}
