package ex5_3_while;

public class WhileExample2 {
	
	public static void main(String[] args) {
		
		int result;
		int i = 1;
		System.out.println("===홀수 출력===");
		while(i <= 10) {
			System.out.println(i);
			i = i + 2;
		}
		System.out.println("Done.\n");
		
		i = 2;
		System.out.println("===짝수 출력===");
		while(i <= 10) {
			System.out.println(i);
			i = i + 2;
		}
		System.out.println("Done.\n");
		
		result = 0;
		i = 1;
		System.out.println("===합 구하기===");
		while(i <= 100) {
			result = result + i;
			i = i + 1;		// i++;
		}
		System.out.println("합 구하기 : " + result);
		System.out.println("Done.\n");
		
		result = 0;
		i = 1;
		System.out.println("===홀수 합 구하기===");
		while(i <= 100) {
			result = result + i;
			i = i + 2;
		}
		System.out.println("홀수 합 구하기 : " + result);
		System.out.println("Done.\n");
		
		result = 0;
		i = 2;
		System.out.println("===짝수 합 구하기===");
		while(i <= 100) {
			result = result + i;
			i = i + 2;
		}
		System.out.println("짝수 합 구하기 : " + result);
		System.out.println("Done.\n");
		
		while(true) {
			System.out.println("Hello, Java");
			break;
		}
	}

}
