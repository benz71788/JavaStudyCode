package ex3_1_literal;

public class First1 {
	
	public static void main(String[] args) {
		
		/*
		System.out.println() : ��ȣ���� ������ ����� �� �� ���� ���ϴ�.
		
		System.out.print() : ��ȣ���� ������ ����� �� �� ���� ����� �ʰ� �����ϴϴ�.
		
		System.out.printf() : ������ �����ؼ� ����մϴ�.
		*/
		
		//���ͷ�(literal) - �� ��ü�� ���� �ǹ� �ϴ°�
		System.out.println("��¼���!!");
		System.out.println(30);
		System.out.println(3.14);
		System.out.println('A');
		System.out.println(true);
		System.out.println(false);
		System.out.println("���ڿ� ���");
		
		System.out.print("=====���� �ȹٲ�!!=====");
		System.out.print("test \n");
		
		//���ڿ� "�ڹ����"�� ���ڿ� ����(%s)���� ����ض�.
		System.out.printf("%s", "�ڹ����");
		
		//�Ǽ� 42.195�� �Ǽ� ����(%f)���� ����ض�.
		//(�⺻ �Ҽ������� 6�ڸ�)
		System.out.printf("%f", 42.195);
		System.out.println();
		
		//�Ǽ� 42.195�� �Ǽ� ���� �Ҽ��� ���� 2�ڸ�(%.2f)�� ����ض�.
		System.out.printf("%.2f\n", 42.195);
		
		// ���� 42�� ���� ����(%d)���� ����ض�.
		System.out.printf("%d\n", 42);
		
		//���� 'A'�� ���� ����(%c)���� ����ض�.
		System.out.printf("%c", 'A');
			
	}
	
	
}
