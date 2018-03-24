package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

class StringTokenizerExample3 {
	
	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("사과,배|복숭아", ",|");
		
		//구획문자 - 콤마(,)와 수직선(|)
		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}

}
