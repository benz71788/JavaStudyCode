package ex11_5_Calendar;

import java.util.Calendar;

class Calendar4 {
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		String[] dayOfWeek = new String[] {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};
		String[] ampm = new String[] {"����", "����"};
		
		System.out.printf("%d��", today.get(Calendar.YEAR));
		System.out.printf("%d��", (today.get(Calendar.MONTH) + 1));
		System.out.printf("%d��", today.get(Calendar.DAY_OF_MONTH));
		System.out.printf(" %s ", ampm[today.get(Calendar.AM_PM)]);
		System.out.printf("%d��", today.get(Calendar.HOUR));
		System.out.printf("%d��", today.get(Calendar.MINUTE));
		System.out.printf("%d��", today.get(Calendar.SECOND));
		System.out.printf(" %s�Դϴ�.\n", dayOfWeek[today.get(Calendar.DAY_OF_WEEK) - 1]);
	}

}
