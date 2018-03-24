package ex11_6_DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

class DateFormatExample2 {
	
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY�� MM�� dd�� aa HH�� mm�� ss��");
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy�� M�� d�� a h�� m�� s��");
		
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy�� M�� d�� E a h�� m�� s��");
		
		//calendar.getTime() : calendar��ü�� ������ �ִ� ��¥�� ���� �Ȱ���
		//������ ���� Date ��ü�� ���� �����ϴ� �޼����Դϴ�.
		System.out.println(calendar.getTime());
		System.out.println(new Date());
		System.out.println(calendar.getTimeInMillis());
		
		//calendar.getTime()�� �������� Date��
		String str = dateFormat.format(calendar.getTime());
		System.out.println(str);
		
		String str2 = dateFormat2.format(calendar.getTime());
		System.out.println(str2);
		
		String str3 = dateFormat3.format(calendar.getTime());
		System.out.println(str3);
	}

}
