package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

//StringTokenizer�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//�Ѱ��� ��ȹ���ڸ� �������� ��ū�� �����Ѵ�.
class StringTokenizerExample2 {
	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("���,��,������", ",");
		
		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}
