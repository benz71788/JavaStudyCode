package ex11_1_String;

/*
 * 1. substring(int beginIndex):
 * 		beginIndex���� ���ڿ� ������ �κ� ���ڿ� ����
 * 2. subString(int beginIndex, int endIndex):
 * 		beginIndex���� endIndex-1 ���� �κ� ���ڿ� ����
 */
class StringExample6_0 {
	
	public static void main(String[] args) {
		String str = "���� ����ϴ� �ڹ�";
		
		for(int cnt = 0; cnt < str.length(); cnt++) {
			char ch = str.charAt(cnt);
			System.out.println("index = " + cnt + ", ���ڿ� = " + ch);
		}
		System.out.println();
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 6));
	}

}
