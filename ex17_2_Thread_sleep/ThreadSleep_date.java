package ex17_2_Thread_sleep;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class ThreadSleep_date extends Thread{
	
	public void run() {
		Calendar calendar = new GregorianCalendar();
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd�� E���� aa hh��mm��ss��");
		while(true) {
			String str = dateFormat.format(calendar.getTime()); // Date��
			String str2 = dateFormat.format(date.getTime());	// long�� -> �и������� ����
			System.out.println(str);
			System.out.println(str2);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			
		}
	}	
}
