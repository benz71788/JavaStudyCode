package ex9_11_enum_method;
/*
 * ���� Ÿ�Կ� ���� values �޼ҵ带 ȣ���ϴ� ��
 * public static ex9_11_enum_method.Day valueOf(java.lang.String);
 * 		=> ���� ����� �̸��� ���ڿ��� �Ѱ��ָ� �׿� �ش��ϴ�
 *  	     ���� ����� �����ϴ� �޼ҵ�
 */

public class EnumExample2 {
	
	public static void main(String[] args) {
		
		printDay("MONDAY");
		printDay("WEDNESDAY");
		printDay("FRIDAY");
//		printDay("FRIDAY2");
		
	}
	
	static void printDay(String name) {
		Day day = Day.valueOf(name);
		System.out.println(day);
		System.out.println(day.ordinal());
	}

}
