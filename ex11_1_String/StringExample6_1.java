package ex11_1_String;

class StringExample6_1 {
	
	public static void main(String[] args) {
		
		String str = "123456-1123456";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("index = " + i + ", ���ڿ� = " + ch);
		}
		
		System.out.println();
		
		if(str.substring(7, 8).equals("1") || str.substring(7, 8).equals("3")) {
			System.out.println("�����Դϴ�.");
		} else if(str.substring(7, 8).equals("2") || str.substring(7, 8).equals("4")) {
			System.out.println("�����Դϴ�.");
		} else
			System.out.println("�ܱ����Դϴ�.");
		
		System.out.println();
		
		String s = str.substring(7, 8);
		System.out.println("������ ���ڴ� " + s + "�̰� ");
		
		if(s.equals("1") || s.equals("3")) {
			System.out.println("�����Դϴ�.");
		} else if(s.equals("2") || s.equals("4")) {
			System.out.println("�����Դϴ�.");
		} else
			System.out.println("�ܱ����Դϴ�.");

	}

}
