package HomeWork;

public class HW2_ex06 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int result = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 5 == 0) {
				sum += i;
				continue;
			}
			result = result + i;
		}
		System.out.println(result);
		System.out.println(sum);
	}

}
