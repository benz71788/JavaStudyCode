package test.LottoTest;

import java.util.Set;
import java.util.TreeSet;

class LottoNumber {
	
	public static void main(String[] args) {
		
		Set<Integer> lottoNum = new TreeSet<Integer>();
		printLottoNum(lottoNum);
	}
	
	static void printLottoNum(Set<Integer> lottoNum) {
		while(true) {
			lottoNum.add((int)(Math.random() * 45 + 1));
			if(lottoNum.size() == 6) {
				System.out.println(lottoNum);
				break;
			}
		}
	}
}
