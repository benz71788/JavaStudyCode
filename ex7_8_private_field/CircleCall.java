package ex7_8_private_field;

public class CircleCall {
	
	public static void main(String[] args) {
		
		Circle cc = new Circle(0.0);
		
//		cc.radius = 5.0; // radius�� private�̱� ������ ������ ���ѵǾ� ���� �߻�
		
		double area = cc.getArea();
		
//		System.out.println("���� ������: " + cc.radius);
		System.out.println("���� ����: " + area);
	
	}
	
}
