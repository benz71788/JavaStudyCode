package ex17_5_Daemon_thread;

class ThreadAutoSaveExample {
	
	public static void main(String[] args) {
		Threadautosave tsave = new Threadautosave();
		Thread tread = new Thread(tsave);
		tread.setDaemon(true);	//이 부분이 없으면 종료되지 않는다.
								//데몬 스레드로 만듭니다.
		tread.start();
		
		for(int i = 1; i <= 30; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
			
			if(i == 5) {
				Threadautosave.autoSave = true;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}
