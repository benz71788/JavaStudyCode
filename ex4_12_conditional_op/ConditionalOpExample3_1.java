package ex4_12_conditional_op;

public class ConditionalOpExample3_1 {
	
	public static void main(String[] args) {
		
		char c = '@';
		int num = c;
		
		if(num >= 65 && num <= 90) {
			System.out.printf("�빮�� %c�� �Է��Ͽ����ϴ�.\n", num);
			int small = num + 32;
			System.out.printf("�ҹ��ڴ� %c�Դϴ�.\n", small);
		} else {
			if(num >= 97 && num <= 122) {
				System.out.printf("�ҹ��� %c�� �Է��Ͽ����ϴ�.\n", num);
				int big = num - 32;
				System.out.printf("�빮�ڴ� %c�Դϴ�.\n", big);
			} else {
				System.out.printf("%c�� ���ĺ��� �ƴմϴ�.\n", num);
			}
		}
		
		System.out.println("\n===============================\n");
		
		if(num >= 65 && num <= 90) {
			int small1 = (num >= 65 && num <= 90) ? (num + 32) : (num);
			System.out.printf("�빮�� %c�� �Է��Ͽ����ϴ�.\n", num);
			System.out.printf("�ҹ��ڴ� %c�Դϴ�.\n", small1);
		} else {
			if(num >= 97 && num <= 122) {
				int big1 = (num >= 97 && num <= 122) ? (num - 32) : (num);
				System.out.printf("�ҹ��� %c�� �Է��Ͽ����ϴ�.\n", num);
				System.out.printf("�빮�ڴ� %c�Դϴ�.\n", big1);
			} else {
				System.out.printf("%c�� ���ĺ��� �ƴմϴ�.\n", num);
			}
		}
		
		System.out.println("\n===============================\n");
		
		char lower = ('A' <= c && c <= 'Z') ? (char)(c + 32) : c;
		System.out.println(lower);
		
		System.out.println("\n===============================\n");
	}

}
