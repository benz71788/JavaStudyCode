package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

class StringTokenizerExample1_1 {
	
	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("��� �� ������");
		
		String s1 = stok.nextToken();
		System.out.println(s1);
		
		String s2 = stok.nextToken();
		System.out.println(s2);
		
		String s3 = stok.nextToken();
		System.out.println(s3);
		
//		String s4 = stok.nextToken();
//		System.out.println(s4);
		
		System.out.println("=================");
	}

}
