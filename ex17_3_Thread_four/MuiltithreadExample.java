package ex17_3_Thread_four;

// �� ���� ������� ����Ǵ� ��Ƽ������ ���α׷�
class MuiltithreadExample {
	
	public static void main(String[] args) {
		//�� ���� �����带 �����ؼ� �����Ѵ�.
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlphabetThread();
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
