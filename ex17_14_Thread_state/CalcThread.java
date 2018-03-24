package ex17_14_Thread_state;

class CalcThread extends Thread{
	SharedArea sharedArea;
	public void run() {
		double total = 0.0;
		// 파이를 계산하는 부분
		for(int cnt = 1; cnt < 1000000000; cnt += 2) {
			if(cnt / 2 % 2 == 0) {
				total += 1.0 / cnt;
//				System.out.println("if : " + cnt + ", total : " + total);
			} else {
				total -= 1.0 / cnt;
//				System.out.println("else : " + cnt + ", total : " + total);
			}
		}
		// 계산 결과를 공유 영역에 저장
		sharedArea.result = total * 4;
		
		// SharedArea 객체의 isReady 필드 값을 true로 설정
		sharedArea.isReady = true;	//파이 계속 끝났다라는 의미
		
		synchronized(sharedArea) {
			sharedArea.notify(); // 어떤 스레드로 신호를 보내는 메소드
		}
	}
	
}
