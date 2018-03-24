package ex11_1_String;

public class StringExample9 {
	
	public static void main(String[] args) {
		
		String message = "Java program creates many objects.";
		
		stringNum(message);
		
		indexCharAt(message);
		
		indexSubString(message);
		
	}
	
	static void stringNum(String message) {
		System.out.println("===�� ���� ����===");
		int num = message.length();
		System.out.println("�� : " + num);
		
	}
	
	static void indexCharAt(String message) {
		System.out.println("===������ index ��ġ ã�� : charAt()===");
		for(int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			if(ch == ' ') {
				System.out.println("index = " + i);	
			}
			
		}
	}
	
	static void indexSubString(String message) {
		System.out.println("===������ index ��ġ ã�� : substring()===");
		for(int i = 0; i < message.length(); i++) {
			String str = message.substring(i, i + 1);
			if(str.equals(" ")) {
				System.out.println("index = " + i);
			}
		}
	}

}
