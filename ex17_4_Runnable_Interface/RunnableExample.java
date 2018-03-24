package ex17_4_Runnable_Interface;

class RunnableExample {
	
	public static void main(String[] args) {
		//Runnable인터페이스를 구현하는 클래스의 객체를 생성해서
		//Thread 생성자의 파라미터로 사용
		SmallLetters letter = new SmallLetters();
		Thread thread = new Thread(letter);	//스레드 생성
		thread.start();
		
		char arr[] = {'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ',
				'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};
		
		for(char ch : arr) {
			System.out.print(ch + " ");
		}
	}	
}
