package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

//StringTokenizer�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
class StringTokenizerExample1_2 {
	
	public static void main(String[] args) {
		
		System.out.println("=====������ ����=====");
		//StringTokenizerExample1_1 ���� �ذ�
		StringTokenizer stok2 = new StringTokenizer("��� �� ������");
		while(stok2.hasMoreTokens()) {		//��ū�� �ִ� ���� �ݺ��ض�
			String str = stok2.nextToken();	//���ڿ��κ��� ��ū�� ����
			System.out.println(str);
		}
	}

}
