package ex5_5_for;

public class For01_1 {
	
	public static void main(String[] args) {
		
		int i, result;
		
		System.out.println("==1씩 증가==");
		
		
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("===홀수 출력하기===");
		for(i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		
		
		System.out.println("===짝수 출력하기===");
		for(i = 2; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		
		
		System.out.println("===합 구하기===");
		result = 0;
		for(i = 1; i <= 10; i += 1) {
			result = result + i;
		}
		System.out.println("합: " + result);
		
		
		System.out.println("===홀수 합 구하기===");
		result = 0;
		for(i = 1; i <= 10; i += 2) {
			result = result + i;
		}
		System.out.println("홀수 합: " + result);
		
		
		System.out.println("===짝수 합 구하기===");
		result = 0;
		for(i = 2; i <= 10; i += 2) {
			result = result + i;
		}
		System.out.println("짝수 합: " + result);
		
	}
}
