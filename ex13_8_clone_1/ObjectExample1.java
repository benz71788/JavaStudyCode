package ex13_8_clone_1;

import java.util.GregorianCalendar;

class ObjectExample1 {
	
	public static void main(String[] args) {
		
		//��ü�� �����Ѵ�.
		GregorianCalendar obj1 = new GregorianCalendar(2007, 0, 1);
		
		//clone�޼���� ��ü�� �����Ѵ�.
		GregorianCalendar obj2 = (GregorianCalendar) obj1.clone();
		
		//%tF : ���� ���ڴ� ��¥�� YYYY-MM-DD �������� �����ϴ� ������ �Ѵ�.
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
		obj1.set(2018, 1, 26);
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
	}

}
