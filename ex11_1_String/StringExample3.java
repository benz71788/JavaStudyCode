package ex11_1_String;

//String �����ڴ� ���� ������ String ��ü�� �����ϱ� ������ ��ü ������ �ּҰ��� �ٸ���.
public class StringExample3 {
	
	public static void main(String[] args) {
		String str1 = new String("�ڹ�");		//��ü�� ���������� �޸� ��ü���� �ٲ�� ���빰�� ���Ƶ� ���� �ٸ� �ּҷ� ����Ų��. 
		String str2 = new String("�ڹ�");
		
		if(str1 == str2) {			// �ּ� ���� ���ϴ� ���̱� ������ �ٸ�.
			System.out.println("str1 == str2 ����");
		} else {
			System.out.println("str1 == str2 �ٸ�");
		}
		
		if(str1.equals(str2)) {		// �ּ� �ȿ� �ִ� ���� ���� ���ϴ� ���̱� ������ ����.
			System.out.println("str1.equals(str2) ����");
		} else {
			System.out.println("str1.equals(str2) �ٸ�");
		}
	}

}
