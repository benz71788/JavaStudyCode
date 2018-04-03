package array;

public class reverseStr {
	public static void main(String[] args) {
		String str = "KAqIpMctgpf";
		String result = "";
		String[] arr = str.split("");
		int[] arrNum = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arrNum[i] = arr[i].charAt(0);
		}
		
		for(int i = 0; i < arrNum.length; i++) {
			for(int j = i; j < arrNum.length; j++) {
				if(arrNum[i] < arrNum[j]) {
					int change = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = change;
				}
			}
			result = result + (char)arrNum[i];
		}
		System.out.println(result);
	}
}
