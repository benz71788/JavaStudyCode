package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

class StringTokenizerExample3 {
	
	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("���,��|������", ",|");
		
		//��ȹ���� - �޸�(,)�� ������(|)
		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}

}
