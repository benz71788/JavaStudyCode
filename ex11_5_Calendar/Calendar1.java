package ex11_5_Calendar;

import java.util.Calendar;

/*
 * Calendar�� �߻� Ŭ������ �̷��� ����� �� ����.
 * 1. Calendar c = new Calendar();
 * 
 * 2. Calendar ���� �ΰ���
 * 	�ϳ�) ���� �޼ҵ带 �̿��ؼ� ����ϴ� ���
 * 		Calendar c1 = Calendar.getInstance();
 * 		getInstance() : Calendar Ŭ������ ������ Ŭ������ �ν��Ͻ��� ��ȯ
 * 	��) ��ĳ���� ���(�ڽ��� �ּҸ� �θ𿡰� ��)
 * 		Calendar c2 = new GregorianCalendar();
 */
public class Calendar1 {
	
	public static void main(String[] args) {
		//�⺻������ ���糯¥�� �ð����� �����Ѵ�.
		Calendar today = Calendar.getInstance();
		
		System.out.println("�� ���� �⵵: " + today.get(Calendar.YEAR));
		
		System.out.println("��(0~11, 0:1��): " + today.get(Calendar.MONTH));
		
		System.out.println("��(0~11, 0:1��): " + (today.get(Calendar.MONTH) + 1));
		
		System.out.println("�� ���� �� ° ��: " + today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("�� ���� �� ° ��: " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("�� ���� �� ° ��: " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("�� ���� �� ° ��: " + today.get(Calendar.DAY_OF_MONTH));
		
		//1:�Ͽ���, 2:������, 3:ȭ����, ..., 7:�����
		if(today.get(Calendar.DAY_OF_WEEK) == 1) {
			System.out.println("����(1~7, 1:�Ͽ���): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 2) {
			System.out.println("����(1~7, 2:������): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 3) {
			System.out.println("����(1~7, 3:ȭ����): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 4) {
			System.out.println("����(1~7, 4:������): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 5) {
			System.out.println("����(1~7, 5:�����): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 6) {
			System.out.println("����(1~7, 6:�ݿ���): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 7) {
			System.out.println("����(1~7, 7:�����): " + today.get(Calendar.DAY_OF_WEEK));
		}
			
		
		if(today.get(Calendar.AM_PM) == 0) {
			System.out.println("����_����(0:����, 1:����): ");
			System.out.println("�����Դϴ�." + today.get(Calendar.AM_PM));
		} else if(today.get(Calendar.AM_PM) == 1) {
			System.out.println("����_����(0:����, 1:����): ");
			System.out.println("�����Դϴ�." + today.get(Calendar.AM_PM));
		}
		
		
		System.out.println("�ð�(0~11): " + today.get(Calendar.HOUR));
		
		System.out.println("�ð�(0~23): " + today.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("��(0~59): " + today.get(Calendar.MINUTE));
		
		System.out.println("��(0~59): " + today.get(Calendar.SECOND));
		
		//�� ���� ������ ���� ã�´�.
		System.out.println("�� ���� ������ �� : " + today.getActualMaximum(Calendar.DATE));
		
		System.out.println("1000���� 1��(0~999): " + today.get(Calendar.MILLISECOND));
		
		System.out.println("=====================================");
		
		System.out.printf("%d��", today.get(Calendar.YEAR));
		System.out.printf("%d��", (today.get(Calendar.MONTH) + 1));
		System.out.printf("%d��", today.get(Calendar.DAY_OF_MONTH));
		if(today.get(Calendar.AM_PM) == 0) {
			System.out.print(" ���� ");
		} else {
			System.out.print(" ���� ");
		}
		System.out.printf("%d��", today.get(Calendar.HOUR));
		System.out.printf("%d��", today.get(Calendar.MINUTE));
		System.out.printf("%d��", today.get(Calendar.SECOND));
		if(today.get(Calendar.DAY_OF_WEEK) == 1) {
			System.out.println(" �Ͽ����Դϴ�.");
		} else if(today.get(Calendar.DAY_OF_WEEK) == 2) {
			System.out.println(" �������Դϴ�.");
		} else if(today.get(Calendar.DAY_OF_WEEK) == 3) {
			System.out.println(" ȭ�����Դϴ�.");
		} else if(today.get(Calendar.DAY_OF_WEEK) == 4) {
			System.out.println(" �������Դϴ�.");
		} else if(today.get(Calendar.DAY_OF_WEEK) == 5) {
			System.out.println(" ������Դϴ�.");
		} else if(today.get(Calendar.DAY_OF_WEEK) == 6) {
			System.out.println(" �ݿ����Դϴ�."); 
		} else {
			System.out.println(" ������Դϴ�.");
		}
	}

}
