package ex17_4_Runnable_Interface;

class RunnableExample2 {
	
	public static void main(String[] args) {
		//Runnable�������̽��� �����ϴ� Ŭ������ ��ü�� �����ؼ�
		//Thread �������� �Ķ���ͷ� ���

		Thread thread = new Thread(new Runnable() {
			public void run() {
				for(char ch = 'a'; ch <= 'z'; ch++) {
					System.out.print(ch);
				}
			}
		});	//������ ����
		thread.start();
		
		char arr[] = {'��', '��', '��', '��', '��', '��', '��',
				'��', '��', '��', '��', '��', '��', '��'};
		
		for(char ch : arr) {
			System.out.print(ch + " ");
		}
	}	
}
