package ex8_20_sortAlgorithm_hw;

public class Sort_ex {
	
	public void selectionSort(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			
			swap(a, min, i);
			System.out.printf("선택 정렬 %d단계: ", i + 1);
			for(int v : a) {
				System.out.printf("%3d", v);
			}
			
			System.out.println();
		}
	}
	
	public void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

}
