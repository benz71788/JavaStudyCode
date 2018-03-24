package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

class StringTokenizerExample4 {

	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("사과=10|초콜렛=3|샴페인=1", "=|", true);
		
//		while(stok.hasMoreTokens()) {
//			String str = stok.nextToken();
//			System.out.print(str + "\t");
//		}
//		
		System.out.println("상품이름\t상품 수");
		while(stok.hasMoreTokens()) {
			String str2 = stok.nextToken();
			if(str2.equals("=")) {
				System.out.print("\t");
			} else if(str2.equals("|")) {
				System.out.print("\n");
			} else {
				System.out.print(str2);
			}
			
		}
	}
	
}
