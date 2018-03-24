package ex11_1_String;

/*
 * 1. substring(int beginIndex):
 * 		beginIndex부터 문자열 끝까지 부분 문자열 리턴
 * 2. subString(int beginIndex, int endIndex):
 * 		beginIndex부터 endIndex-1 까지 부분 문자열 리턴
 */
class StringExample6_0 {
	
	public static void main(String[] args) {
		String str = "나를 사랑하는 자바";
		
		for(int cnt = 0; cnt < str.length(); cnt++) {
			char ch = str.charAt(cnt);
			System.out.println("index = " + cnt + ", 문자열 = " + ch);
		}
		System.out.println();
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 6));
	}

}
