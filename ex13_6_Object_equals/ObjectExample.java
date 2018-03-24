package ex13_6_Object_equals;

/*
 * Object Ŭ������ equals()�޼ҵ�
 * �Ű������� ��ü�� ���������� �޾Ƽ� ���Ͽ� �� ����� boolean������
 * �˷� �ִ� ������ �Ѵ�.
 * ������ equals�޼ҵ��� ���� �����̴�.
 * public boolean equals(Object arg0){
 * 		return this == arg0;
 * }
 * �� ��ü�� ���� �ٸ��� ���������� ������ �Ǵ��ϰ� �ִ�.
 * ���� �ٸ� �� ��ü�� equals�޼���� ���ϸ� �׻� false ����� ��� �ȴ�.
 * 
 */

// equals�޼ҵ� ��� �� - �Ȱ��� ���� ���� �� ���� ��ü�� ����
import java.util.GregorianCalendar;

class ObjectExample {
	
	public static void main(String[] args) {
		GregorianCalendar obj1 = new GregorianCalendar(2017, 10, 9);
		GregorianCalendar obj2 = new GregorianCalendar(2017, 10, 9);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1.equals(obj2): ����");
		} else {
			System.out.println("obj1.equals(obj2): �ٸ�");
		}
		
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2: ����");
		} else {
			System.out.println("obj1 == obj2: �ٸ�");
		}
	}

}
