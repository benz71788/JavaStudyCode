package ex11_7_Math;

class LottoGame {
	
	public static void main(String[] args) {
		int lottoNum[] = new int[6];
		
		printLottoNum(lottoNum);
		
		System.out.println("\n===========================================");
		
		printSelectSorting(lottoNum);
		
	}
	
	static void printLottoNum(int[] lottoNum) {
		for(int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i; j++) {
				if(lottoNum[i] == lottoNum[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < lottoNum.length; i++) {
			System.out.print(lottoNum[i] + "\t");
		}
	}
	
	static void printSelectSorting(int[] lottoNum) {
		for(int i = 0; i < lottoNum.length; i++) {
			for(int j = i + 1; j < lottoNum.length; j++) {
				if(lottoNum[j] < lottoNum[i]) {
					int stmp = lottoNum[j];
					lottoNum[j] = lottoNum[i];
					lottoNum[i] = stmp;
				}
			}
			System.out.print(lottoNum[i] + "\t");
		}
	}

}
