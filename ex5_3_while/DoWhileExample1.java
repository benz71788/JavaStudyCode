package ex5_3_while;

public class DoWhileExample1 {
	
	public static void main(String[] args) {
		
		int result;
		int cnt = 0;
		do {
			System.out.println(cnt);
			cnt++;
		} while(cnt < 10);
		System.out.println("Done.");
		
		cnt = 1;
		do {
			System.out.println(cnt);
			cnt = cnt + 2;
		} while(cnt <= 10);
		System.out.println("Done.");
		
		cnt = 2;
		do {
			System.out.println(cnt);
			cnt = cnt + 2;
		} while(cnt <= 10);
		
		result = 0;
		cnt = 1;
		do {
			result = result + cnt;
			cnt = cnt + 1;
		} while(cnt <= 10);
		
		System.out.println("합구하기: " + result);
		
		result = 0;
		cnt = 1;
		do {
			result = result + cnt;
			cnt = cnt + 2;
		} while(cnt <= 10);
		
		System.out.println("홀수 합구하기: " + result);
		
		result = 0;
		cnt = 2;
		do {
			result = result + cnt;
			cnt = cnt + 2;
		} while(cnt <= 10);
		System.out.println("짝수 합구하기: " + result);
	}

}
