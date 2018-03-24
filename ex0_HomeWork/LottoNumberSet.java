package ex0_HomeWork;

import java.util.Set;
import java.util.TreeSet;

class LottoNumberSet {
	
	public static void main(String[] args) {

		Set<Integer> lottoNum = new TreeSet<Integer>();
		
		printNewLottoNum(lottoNum);

	}
	
	static void printNewLottoNum(Set<Integer> lottoNum) {
		while(true) {
			lottoNum.add((int)(Math.random() * 45 + 1));
			if(lottoNum.size() == 6) {
				System.out.println(lottoNum);
				break;
			}
		}		
	}

}
