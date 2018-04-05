package array;

public class NLCM {
	public static void main(String[] args) {
		int[] num = { 2, 7, 12, 16 };
		int lc = 1, mc = 1;
		long answer = 1;
		for(int i = 0; i < num.length; i++) {
			for(int j = 2; j < num[i]; j++) {
				if(num[i] % j == 0) {
					num[i] = num[i] / j;
					lc = lc * j;
					j--;
				} 
			}
			if(mc < lc){
				mc = lc;
			}
			answer = answer * num[i];
			System.out.println(answer);
		}

		System.out.println(answer * 2);
	}
}
