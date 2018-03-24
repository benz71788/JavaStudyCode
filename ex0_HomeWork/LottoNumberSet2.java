package ex0_HomeWork;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

class LottoNumberSet2 {
	
	public static void main(String args[]) {
		Set<Integer> set = new TreeSet<Integer>();
		Random r = new Random();
		while (set.size() < 6) {
			//int num =  (int) (Math.random() * 45) + 1;
			int num = r.nextInt(45) + 1;
			set.add(num);
		}

		System.out.println("로또번호 : " + set);

	}

}
