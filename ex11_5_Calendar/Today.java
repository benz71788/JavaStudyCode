package ex11_5_Calendar;

import java.util.Calendar;


class Today {
	
	void print(Calendar today) {
		
		String[] dayOfWeek = new String[] {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};
		String[] ampm = new String[] {"����", "����"};
		
		System.out.printf("%d��", today.get(Calendar.YEAR));
		System.out.printf("%d��", (today.get(Calendar.MONTH) + 1));	//���� 0���� 11���� �������� 1�� ���ؾ� ��.
		System.out.printf("%d��", today.get(Calendar.DAY_OF_MONTH));
		System.out.printf(" %s ", ampm[today.get(Calendar.AM_PM)]);	//����:0, ����:1
		System.out.printf("%d��", today.get(Calendar.HOUR));
//		System.out.printf("%d��", today.get(Calendar.HOUR_OF_DAY)); //24�ð�
		System.out.printf("%d��", today.get(Calendar.MINUTE));
		System.out.printf("%d��", today.get(Calendar.SECOND));
		System.out.printf(" %s�Դϴ�.\n", dayOfWeek[today.get(Calendar.DAY_OF_WEEK) - 1]);

	}
	
}
