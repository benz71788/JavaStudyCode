package ex17_4_Runnable_Interface;

class MultithreadExample2 {
	
	public static void main(String[] args) {
		ThreadLife t1 = new ThreadLife();
		
		//ù ��° Thread ����
		Thread first = new Thread(t1, "first1");
		//������ ���� : Thread(Runnable target, String name)
		//Allocates a new Thread object.
		
		//�� ��° Thread ����
		Thread second = new Thread(t1, "second1");
		
		//�� ��° Thread ����
		Thread third = new Thread(t1, "thrid1");
		
		first.start();
		second.start();
		third.start();
	}

}
