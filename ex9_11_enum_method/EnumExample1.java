package ex9_11_enum_method;

/*
 * ���� Ÿ�Կ� ���� values �޼ҵ带 ȣ���ϴ� ��
 * public static ex9_11_enum_method.Day[] values();
 * 		=> ���� Ÿ�Կ� ���ϴ� ��� ���� ������� �迭�� ��Ƽ� �����ϴ� �޼ҵ�
 */
public class EnumExample1 {
	
	public static void main(String[] args) {
		Day days[] = Day.values();
		
		for(int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}
		
		System.out.println("=============");
		
		for(Day day : days) {
			System.out.println(day);
		}
	}
}
