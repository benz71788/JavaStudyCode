package ex17_12_notify_wait;

class PrintThread extends Thread{
	
	SharedArea sharedArea;
	public void run() {
		if(sharedArea.isReady != true) {	//파이가 계산을 하고 있는 중인 경우
			/*
			 * 이전의 방식 - 파이 계산이 끝날때 까지 계속 체크해야 했다.
			 * while(sharedArea.isReady != true) {
					System.out.println("실행중~");
				}
			 */
			try {
				synchronized(sharedArea) {
					sharedArea.wait();	//다른 스레드로 부터 신호를 기다린다.
						//파이의 계산이 끝나면 다른 스레드에서 신호를 보낸다.
				}
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}// if end
		
		System.out.println("공유 영역의 데이터 = " + sharedArea.result);
	}

}
