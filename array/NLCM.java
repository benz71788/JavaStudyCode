package array;

public class NLCM {
	public static void main(String[] args) {
		int[] num = { 2, 6, 8, 14, 11};
		int lc = 1, mc = 1;
		int result = 0;
		long answer = 1;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = i; j < num.length; j++) {
				if(num[i] > num[j]) {
					result = num[i];
					num[i] = num[j];
					num[j] = result;
				}
			}
		}
		
		result = num[num.length - 1];
		
		for(int i = 2; i < result; i++) {
			for(int j = 0; j < num.length; j++) {
				if(num[j] % i == 0 && num[j] >= i) {
					System.out.println("i : " + i + ", num[" + j + "] : " + num[j]);
					num[j] = num[j] / i;
					lc = lc * i;
					if(mc < lc) {
						mc = lc;
					}
					j--;
				} else {
					System.out.println("i : " + i + ", num[" + j + "] : " + num[j]);
					lc = 1;
				}
				
			
			}
			answer = answer * mc;
			mc = 1;
		}
		System.out.println(answer);
	}
}
