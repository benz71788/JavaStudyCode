package ex9_11_enum_method;

/*
 * - ���� Ÿ�� �̸��� �ҽ� ���ϸ�� ��ҹ��� ��� ��ġ�ؾ� �Ѵ�.
 * 
 * - ���� Ÿ���� �������� �ϰ� ���� ���������� Ŭ������ ����� ���µ�
 *   �� �� values()��  valueOf(String s)��� �� ���� �޼ҵ尡 �ڵ����� �߰��ȴ�.
 *   
 *   1. public static ex9_11_enum_method.Day[] values();
 *   	���� Ÿ�Կ� ���ϴ� ��� ���� ������� �迭�� ��Ƽ� �����ϴ� �޼ҵ�
 *   
 *   2. public static ex9_11_enum_method.Day valueOf(java.lang.String);
 *   	���� ����� �̸��� ���ڿ��� �Ѱ��ָ� �׿� �ش��ϴ�
 *   	���� ����� �����ϴ� �޼ҵ�
 */
enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
