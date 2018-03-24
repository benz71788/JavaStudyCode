package ex17_6_SharedArea_solution;

//CalcThread가 계산된 파이 값을 공유 영역에 쓰기도 전에
//PrintThread가 공유 영역의 데이터를 읽어 갔기 때문에
//result 필드가 가지고 있던 기본값 0.0이 출력된 것이다.
//해결책??
class MultithreadExample {
	
	public static void main(String[] args) {
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		
		//공유 영역 객ㅊ를 생성해서 그 객체의 참조값을 두 스레드의 필드에 저장한다.
		SharedArea obj = new SharedArea();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;

		thread1.start();
		thread2.start();
	}

}
