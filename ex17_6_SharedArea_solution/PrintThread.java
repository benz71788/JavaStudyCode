package ex17_6_SharedArea_solution;

class PrintThread extends Thread{
	
	SharedArea sharedArea;
	public void run() {
		//공유 영역의 데이터를 출력
		while(sharedArea.isReady != true) {
			System.out.println("실행중~");
		}
		//공유 영역의 데이터를 출력
		System.out.println("공유 영역의 데이터 = " + sharedArea.result);
	}

}
