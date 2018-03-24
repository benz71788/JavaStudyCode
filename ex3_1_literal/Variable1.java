package ex3_1_literal;

public class Variable1 {
	
	public static void main(String[] args) {
		//����������
		//1����Ʈ(���� ������ ������ �����ϱ⿡ �����ϴ�.)
		byte b = 10;
		short s = 100;
		int i = 1000;
		
		//8����Ʈ(l[�ҹ��� ��] �Ǵ� L�� ���� �ڿ� ���δ�.)
		long l = 10000L;
		b = 20;
		
		System.out.println("b=" + b);
		System.out.println("s=" + s);
		System.out.println("i=" + i + ", l=" + l);
		
		//�Ǽ��� ����
		//f�� F�� ���� �ڿ� ���Դϴ�.
		float ft = 3.14f;
		
		//d�� D�� ���� �ڿ� ���̰ų� ������ �� �ֽ��ϴ�.
		double d = 42.195d;
		System.out.println("f=" + ft + ", d=" + d);
		
		/*
		 * ��ǻ�Ͱ� ���ڹۿ� �𸣱� ������ ���ڰ� ���ڷ� ��ȯ�Ǿ�
		 * ����Ǵµ� � �������� ����ɱ��?
		 * ���ڿ� �ش��ϴ� �����ڵ��Դϴ�.
		 * 'A' -> 65
		 * 	: ���ڸ� �ڵ�� ��ȯ�ϴ� ���� ���� ���ڵ�(encoding)�̶� �Ѵ�.
		 * '65 -> 'A'
		 * 	: �ڵ带 ���ڷ� ��ȯ�ϴ� ���� ���� ���ڵ�(decoding)�̶� �Ѵ�.
		 */
		
		// ������ ���� - �ϳ��� ���ڸ� ��Ÿ�� �� �ִ� �ڷ�������
		// 16��Ʈ�� �����ڵ带 ����մϴ�.
		char c1 = 'A'; //2����Ʈ
		char c2 = '@';
		char c3 = 'ȫ';
		System.out.println("c1=" + c1 + ", c2=" + c2 + ", c3=" + c3);
		System.out.printf("%c\n", c1);
		System.out.printf("%d\n", (int)c1);
		System.out.printf("%c, %d\n", c1, (int)c1);
		System.out.printf("%c, %d\n", c2, (int)c2);
		System.out.printf("%c, %d\n", c3, (int)c3);
		System.out.println(c1 + c2 + c3);
		
		/*������ ��
		 * 1. char cerror = 'AB';		�� ���� �Է��ϸ� ����
		 * 2. char cerror_blank = '';	�ݵ�� �ϳ��� ���ڰ� �ʿ�
		 */
		
		//�������� ������ �����ϸ� ������ �ش��ϴ� �����ڵ带 ã�Ƽ� ������
		char c4 = 65;			// ���� 'A'�� �ǹ�
		char c5 = '\uAC00';		// �ѱ� �����ڵ� '��'�� �ǹ�
		char c6 = '\uAC01';
		System.out.println("c4=" + c4 + ", c5=" + c5 + ", c6=" + c6);
		
		//0���� �����ϸ� 8������ �ǹ�, 0x�� �����ϸ� 16������ �ǹ��Ѵ�.
		char c7 = 0101; //0���� �����ϸ� 8������ �ǹ�
		char c8 = 0x41; //0x�� �����ϸ� 16������ �ǹ�
		System.out.println("8���� 0101=" + c7 + "\n" 
				+ "16���� 0x41=" + c8);
		
		//���� ����
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1�� ���� " + b1);
		System.out.println("b2�� ������ " + b2);
		
		//������ -s1, s2�� �޸� �ּ�, new�� ������,
		//new String("�ڹ�"); ���� String()�� ������
		String s1="�ڹ�";
		System.out.println("s1=" + s1);
		
	}

}
