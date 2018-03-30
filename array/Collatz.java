package array;

public class Collatz {
	
	public static void main(String[] args) {
		int num = Collatz();
		System.out.println(num);
	
	}
	
	public static int Collatz() {
		int num = 6;
		int answer = 1;
		while(answer <= 500) {
			if(num % 2 == 0) {
				num = num / 2;
				answer++;
				System.out.println(num);
				if(num == 1) {
					break;
				}
			} else if(num % 2 == 1) {
				num = num * 3 + 1;
				answer++;
				System.out.println(num);
			} else {
				answer++;
			}

		}
		
		if(answer > 500) {
			return -1;
		}
		
		return answer - 1;
	}

}
