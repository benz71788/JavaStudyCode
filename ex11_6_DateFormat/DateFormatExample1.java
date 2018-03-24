package ex11_6_DateFormat;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample1 {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy��MM��dd��");
		
		
		//���� �ý��� ��¥�� �ð� ���ϴ� ���
		//1. Ŭ���� Date �̿��ϴ� ��� - ���� �ý��� ��¥�� �ð� ���մϴ�.
		Date d = new Date();
		System.out.println("Date ���: " + d);
		//System.out.println(new Date());	//�� �� ����� ���� �ǹ�
		
		System.out.println(sd1.format(d));
		System.out.println(sd2.format(d));
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a h�� m�� s�� E����");
		//E : ������ �ѱ��̶� �ѱ���� ���. ���� ������ ����� �ϸ� ����� ���
		
		//SystemŬ������ �̿��ؼ� �ý����� �и��� ���ϱ�
		//(����ǥ�ؽð�(UTC, GMT) 1970/1/1/0/0/0���κ��� ����� �ð�)
		System.out.println(System.currentTimeMillis() + "�и���");
		
		//2. Ŭ����Timestamp �̿��ϴ� ��� - ���� �ý��� ��¥�� �ð� ���Ѵ�.
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println("Timestamp���: " + ts);	//��¥, �ð� ����
		
		//�� �� ����� ��ġ - ���۷��� �������� ��°���
//		System.out.println(new Timestamp(System.currentTimeMillis()));
		
		/*
		 * java.lang.Object
		 * 		java.util.Date
		 * 			java.sql.Timestamp
		 * 
		 * String java.text.DateFormat.format(Date date)
		 */
		
		System.out.println(sdf.format(ts));	//��ĳ����
	}

}
