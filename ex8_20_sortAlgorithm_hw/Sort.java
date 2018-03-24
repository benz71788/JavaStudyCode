package ex8_20_sortAlgorithm_hw;

public class Sort {
	
	public void selectionSort(int[] a) {
		
		for(int i = 0; i < a.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
//					System.out.println("a[j] < a[min] = "+ "a[" + j + "] < a[" + min + "]");
				}
			}
			
			swap(a, min, i);
//			System.out.printf("\n선택정렬 %d단계: ", i + 1);
//			for(int v : a) {
//				System.out.printf("%3d", v);
//			}
//			System.out.println(Arrays.toString(a));
		}
		System.out.println();
	}
	
	public void swap(int a[], int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

}
