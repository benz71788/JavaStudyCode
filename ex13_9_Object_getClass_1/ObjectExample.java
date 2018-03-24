package ex13_9_Object_getClass_1;

public class ObjectExample {
	
	public static void main(String[] args) {
		Point p = new Point(5, 10);
		
		//Class ��ü�� ��� ���
		//1. ������ ��ü�� ���� ��� ���
		Class c1 = p.getClass();
		
		//2. Ŭ���� ���ͷ�(.class)�� ���� ��� ���
		Class c2 = Point.class;
		
		//3. Ŭ���� �̸����� ���� ��� ��� - throws ClassNotFoundException
		Class c3 = null;
		
		try {					//�Ű������� ��Ű����.Ŭ�������� ����Ѵ�.
			c3 = Class.forName("ex13_9_Object_getClass_1.Point");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(c1.toString());
		System.out.println(c2);
		System.out.println(c3);
		
		//��Ű����.Ŭ������
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		
		//���������� class ��Ű����.Ŭ������
		System.out.println(c1.toGenericString());
		System.out.println(c2.toGenericString());
		System.out.println(c3.toGenericString());
		
	}

}
