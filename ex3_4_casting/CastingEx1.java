package ex3_4_casting;

public class CastingEx1 {
	
	public static void main(String[] args) {
		
		// int -> double(�Ͻ���, ������)
		int i1 = 10;
		
		double d1 = i1; //�Ǽ��� ������ ������ ���� ������ �� �ִ�.(�ڵ����� ����ȯ�� �ȴ�.)
		
		System.out.println("d1 �����ʹ� " + d1 + "�Դϴ�.");
		
		System.out.println();
		
		
		// double -> int(�����, ������)
		double d2 = 10.1234;
		
		int i2 = (int)d2; //����ȯ�� ���ؼ��� �Ǽ��� ������ ������ ������ Ÿ���� �Է����ش�.
		
		System.out.println("i2 �����ʹ� " + i2 + "�Դϴ�.");
		
		System.out.println();
		
		// int -> char
		int i3 = 97;
		char c1 = (char)i3;
		System.out.println("i3�����ʹ� " + i3 + "�Դϴ�.");
		System.out.println("c1�����ʹ� " + c1 + "�Դϴ�.");
		System.out.println();
		
		i3 = 65;
		c1 = (char)i3;
		System.out.println("i3�����ʹ� " + i3 + "�Դϴ�.");
		System.out.println("c1�����ʹ� " + c1 + "�Դϴ�.");
		System.out.println();
		
		System.out.printf("%c\n", 'A');
		System.out.printf("�����ڵ� 65�� ���� %c�� �ǹ��մϴ�.\n", 65);
		System.out.printf("���� A�� �����ڵ�� %d�Դϴ�. \n", (int)'A');
	}

}
