package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

class StringTokenizerExample4 {

	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("���=10|���ݷ�=3|������=1", "=|", true);
		
//		while(stok.hasMoreTokens()) {
//			String str = stok.nextToken();
//			System.out.print(str + "\t");
//		}
//		
		System.out.println("��ǰ�̸�\t��ǰ ��");
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
