package ex17_4_Runnable_Interface;

class RunnableExample {
	
	public static void main(String[] args) {
		//Runnable�������̽��� �����ϴ� Ŭ������ ��ü�� �����ؼ�
		//Thread �������� �Ķ���ͷ� ���
		SmallLetters letter = new SmallLetters();
		Thread thread = new Thread(letter);	//������ ����
		thread.start();
		
		char arr[] = {'��', '��', '��', '��', '��', '��', '��',
				'��', '��', '��', '��', '��', '��', '��'};
		
		for(char ch : arr) {
			System.out.print(ch + " ");
		}
	}	
}
