package array;

public class NumberOfPrime {
	
	public static void main(String[] args) {
		int result = 1;
		int n = 5;
		for(int i = 2; i <= n; i++){
			for(int j = 2; j <= i; j++) {
				if(i!=j && i % j == 0) {
					result++;
					break;
				}
			}
		}
		System.out.println(n - result);
	}

}
