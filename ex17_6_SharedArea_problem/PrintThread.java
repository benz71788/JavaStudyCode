package ex17_6_SharedArea_problem;

class PrintThread extends Thread{
	
	SharedArea sharedArea;
	public void run() {
		//공유 영역의 데이터를 출력
		System.out.println("공유 영역의 데이터 = " + sharedArea.result);
	}

}
