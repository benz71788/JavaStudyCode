package ex8_20_sortAlgorithm_hw;

public class SortExam {
	
	public static void main(String[] args) {
		
		System.out.println("===��������===");
		int[] a = {68, 9, 32, 2, 14, 7, 31, 26};
		Sort s = new Sort();
		System.out.printf("\n������ ����: ");
		for(int v : a) {
			System.out.printf("%3d", v);
		}
		System.out.println();
		s.selectionSort(a);
	}

}
