package ex7_0_object;

public class Saram4 {
	
	// �ʵ�(�������)
		String name;
		double w;
		double ki;
		int age;
		
		// ������
		Saram4(String name2, double w2){
			name = name2;
			w = w2;
		}
		
		// �޼���
		public void eat() {
			System.out.println(name + ", ���� �Դ´�.");
		}
		
		public void walk() {
			System.out.println("�ȱ� �� �����Դ� " + w + "�Դϴ�.");
		}
		
		public void sesu() {
			System.out.println(name + ", �����Ѵ�.");
		}

}
