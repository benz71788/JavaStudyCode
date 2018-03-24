package ex13_8_clone_1;

import java.util.GregorianCalendar;

class ObjectExample1 {
	
	public static void main(String[] args) {
		
		//객체를 생성한다.
		GregorianCalendar obj1 = new GregorianCalendar(2007, 0, 1);
		
		//clone메서드로 객체를 복제한다.
		GregorianCalendar obj2 = (GregorianCalendar) obj1.clone();
		
		//%tF : 포맷 명세자는 날짜를 YYYY-MM-DD 형식으로 포맷하는 역할을 한다.
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
		obj1.set(2018, 1, 26);
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
	}

}
