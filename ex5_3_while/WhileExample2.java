package ex5_3_while;

public class WhileExample2 {
	
	public static void main(String[] args) {
		
		int result;
		int i = 1;
		System.out.println("===Ȧ�� ���===");
		while(i <= 10) {
			System.out.println(i);
			i = i + 2;
		}
		System.out.println("Done.\n");
		
		i = 2;
		System.out.println("===¦�� ���===");
		while(i <= 10) {
			System.out.println(i);
			i = i + 2;
		}
		System.out.println("Done.\n");
		
		result = 0;
		i = 1;
		System.out.println("===�� ���ϱ�===");
		while(i <= 100) {
			result = result + i;
			i = i + 1;		// i++;
		}
		System.out.println("�� ���ϱ� : " + result);
		System.out.println("Done.\n");
		
		result = 0;
		i = 1;
		System.out.println("===Ȧ�� �� ���ϱ�===");
		while(i <= 100) {
			result = result + i;
			i = i + 2;
		}
		System.out.println("Ȧ�� �� ���ϱ� : " + result);
		System.out.println("Done.\n");
		
		result = 0;
		i = 2;
		System.out.println("===¦�� �� ���ϱ�===");
		while(i <= 100) {
			result = result + i;
			i = i + 2;
		}
		System.out.println("¦�� �� ���ϱ� : " + result);
		System.out.println("Done.\n");
		
		while(true) {
			System.out.println("Hello, Java");
			break;
		}
	}

}
