package ex5_5_for;

public class For01_1 {
	
	public static void main(String[] args) {
		
		int i, result;
		
		System.out.println("==1�� ����==");
		
		
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("===Ȧ�� ����ϱ�===");
		for(i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		
		
		System.out.println("===¦�� ����ϱ�===");
		for(i = 2; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		
		
		System.out.println("===�� ���ϱ�===");
		result = 0;
		for(i = 1; i <= 10; i += 1) {
			result = result + i;
		}
		System.out.println("��: " + result);
		
		
		System.out.println("===Ȧ�� �� ���ϱ�===");
		result = 0;
		for(i = 1; i <= 10; i += 2) {
			result = result + i;
		}
		System.out.println("Ȧ�� ��: " + result);
		
		
		System.out.println("===¦�� �� ���ϱ�===");
		result = 0;
		for(i = 2; i <= 10; i += 2) {
			result = result + i;
		}
		System.out.println("¦�� ��: " + result);
		
	}
}
