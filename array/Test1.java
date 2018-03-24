package array;

public class Test1 {
	
	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int total = 0;
		double avg = 0.0;
		
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				total += array[i][j];
				count++;
			}
		}
		
		avg = (double) total / count;
		System.out.println("ÇÕ°è : " + total);
		System.out.println("Æò±Õ : " + avg);
	}

}
