package ex11_1_String;

class StringExample2 {
	
	public static void main(String[] args) {
		String str1 = "�ڹ�";		//���������� �������� �޶� ���买�� ������ �ּҰ��� ���� ���� ����Ų��.
		String str2 = "�ڹ�";
		
		if(str1 == str2) {
			System.out.println("str1 == str2 ����");
		} else {
			System.out.println("str1 == str2 �ٸ�");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1.equals(str2) ����");
		} else {
			System.out.println("str1.equals(str2) �ٸ�");
		}
	}

}
