package ex6_3_method_intro;

public class MethodExample1 {
	
	public static void main(String[] args) {
		
		// �޼��� ȣ�� ���1 - Ŭ������.�����޼���
		MethodExample1.printCharacter('*', 30); // �޼��� ȣ��
		
		// �޼��� ȣ�� ���2.
		printCharacter('-', 30);
		System.out.println("Hello, Java");
		printCharacter('-', 30);
		printCharacter('*', 30);
		
	}
	
	// �޼��� ����
	public static void printCharacter(char ch, int num) {
		
		for(int i = 0; i < num; i++) {
			System.out.print(ch);
		}
		System.out.println();
		return; // ��ȯ���� void�� ��� ���������ϴ�.
	}

}
