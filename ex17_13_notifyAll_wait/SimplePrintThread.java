package ex17_13_notifyAll_wait;

class SimplePrintThread extends Thread{
	
	SharedArea sharedArea;
	public void run() {
		if(sharedArea.isReady != true) {	//파이가 계산을 하고 있는 중인 경우
			try {
				synchronized(sharedArea) {
					sharedArea.wait();	//다른 스레드로 부터 신호를 기다린다.
						//파이의 계산이 끝나면 다른 스레드에서 신호를 보낸다.
				}
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}// if end
		System.out.printf("SimplePrintThread : %.2f \n", sharedArea.result);
	}
	

}
