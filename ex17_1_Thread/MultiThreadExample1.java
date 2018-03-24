package ex17_1_Thread;

//���ĺ��� ���ڸ� ���ÿ� ����ϴ� ��Ƽ������ ���α׷�
/*
 * JVM�� �����忡 �Ҵ��ϴ� �ð��� ���� ������ �ϵ������ �����̳� �ý��� ȯ�濡
 * ���� �޶� ���� ����� �Ź� �ٸ� ����� ���� �� �ִ�.
 */
class MultiThreadExample1 {
	
	public static void main(String[] args) {
		
		Thread thread = new DigitThread(); //������ ����
		//thread�� ���� ��Ų��.
		thread.start();
		
		/*
		 * 	- start() ���� : 
		 * 		Causes this thread to begin execution;
		 * 		the Java Virtual Machine calls the run method of this
		 * 		this thread(Thread thread = new DigitThread()�� thread)
		 * 		�� ������ �����ϵ��� �Ѵ�.
		 * 		Java ���� �ӽ��� �������� run() �޼ҵ带 ȣ���Ѵ�.
		 * 	- start() method�� java.lang.Thread Ŭ������ �޼ҵ��̴�.
		 * 		���� ������ Thread�� start�ϸ� Runnable ���°� �ȴ�
		 * 	- thread.run(); �̷��� ȣ�� ���� �ʴ´�.
		 */
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
		
		System.out.println("������: " + Thread.currentThread().getName());
	}

}
