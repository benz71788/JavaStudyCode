package array;

public class nextBigNumber {
	public static void main(String[] args) {
		int n = 78;
		String str = "";
		String[] strNum = null;
		int answer = 0;
		while(n != 1) {
			str = (n % 2) + str;
			n = n / 2;
			if(n == 1) {
				str = n + str;
			}
		}
		
		strNum = str.split("");
		
		
	}
}
