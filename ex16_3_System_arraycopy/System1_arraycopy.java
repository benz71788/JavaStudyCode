package ex16_3_System_arraycopy;

class System1_arraycopy {
	
	public static void main(String[] args) {
		
		char arr1[] = {'가', '나', '다', '라', '마', '바', '사', 
				'아', '자', '차', '카', '타', '파', '하'};
		
		char arr2[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
				'h', 'i', 'j', 'k'};
		
		char arrcopy[] = new char[arr1.length];
		
		//System.arraycopy(원본 배열, 원본 항목 시작 위치,
		//		복사 대상 배열, 복사 대상 항목 시작 위치, 복사할 항목의 수);
		
		System.arraycopy(arr1, 10, arr2, 2, 3);
		
		//arr1[10] ~ arr1[12]의 값을 arr2[2] ~ arr2[4]에 복사
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
		System.out.println();
		
		System.arraycopy(arr1, 0, arrcopy, 0, arr1.length);
		
		for(int i = 0; i < arrcopy.length; i++) {
			System.out.print(arrcopy[i] + "\t");
		}
		System.out.println();
		
		for(char ch : arrcopy) {
			System.out.print(ch + "\t");
		}
	}

}
