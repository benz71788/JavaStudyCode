package ex11_1_String;

class StringExample1 {
	
	public static void main(String[] args) {
		String str = "�ڹ� Ŀ��";
		int len = str.length();					// length �޼��� ȣ��
		
		for(int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt);			// charAt �޼��� ȣ��
			System.out.println("index = " + cnt + ", ���ڿ� = " + ch);
		}
	}

}
