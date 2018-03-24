package ex17_3_Thread_four;

class AlphabetThread extends Thread{
	
	public void run() {
		for(char cnt = 'A'; cnt <= 'Z'; cnt++) {
			System.out.print(cnt);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
