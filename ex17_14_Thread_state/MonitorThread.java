package ex17_14_Thread_state;

class MonitorThread extends Thread{
	
	Thread thread;
	MonitorThread(Thread thread){	//생성자
		this.thread = thread;
	}
	
	//모니터링 대상 스레드(thread)의 상태를 2초마다 한번씩 출력합니다.
	public void run() {
		while(true) {
			//thread.getState() : 쓰레드의 상태를 얻어온다.
			Thread.State state = thread.getState();
			
			System.out.println(thread.getName() + " 쓰레드의 상태: " + state);
			
			//쓰레드의 상태가 종료 상태일 경우 반복문을 벗어난다.
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			} //catch end
		} //while end
	} //run end
} //class end
