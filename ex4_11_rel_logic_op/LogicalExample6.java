package ex4_11_rel_logic_op;

/*
 * - �ܶ� ��(short circuit evaluation)
 * 	1. &&������ ��� ù��° �ǿ����ڸ� ���ؼ� false�� ���
 * 		�ι�° �ǿ����ڸ� ������ �ʰ� false�� ��ȯ�մϴ�.
 * 	2. ||������ ��� ù��° �ǿ����ڸ� ���ؼ� true�� ���
 * 		�ι�° �ǿ����ڸ� ������ �ʰ� true�� ��ȯ�մϴ�.	
 */

public class LogicalExample6 {
	
	public static void main(String[] args) {
		
		int a = 10, b = 20;
//		int a = 20, b = 20;
		
		if(a >= 20 && ++b >= 20) {
			System.out.println("�� " + b);
		} else {
			System.out.println("����");
		}
		System.out.println(b);
	}

}
