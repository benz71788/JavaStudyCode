package ex17_2_Thread_sleep;

class MultithreadExampleSleep2 {
	
	public static void main(String[] args) {
		Thread thread = new DigitThread2();
		thread.start();
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
				//sleep �޼ҵ�: ���� �ð��� ����Ǳ⸦ ��ٸ��� �޼ҵ�.
				//public static void sleep(long millis) throws Interrupt
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}// catch end
		}//for end
	}//main end

}