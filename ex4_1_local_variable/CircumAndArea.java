package ex4_1_local_variable;

public class CircumAndArea {
	
	public static void main(String[] args) {
		final double PI = 3.14; //������
		double radius = 3.0; //������
		double circum, area;
		
		
		circum = 2 * radius * PI; //���� �ѷ�
		area = radius * radius * PI; //���� ����
		
		System.out.println("������ : " + PI);			//������
		System.out.println("���� �ѷ� : " + circum);	//���� �ѷ�
		System.out.println("���� ���� : " + area);	//���� ����
	}

}
