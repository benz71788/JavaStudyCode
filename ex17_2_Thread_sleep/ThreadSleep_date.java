package ex17_2_Thread_sleep;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class ThreadSleep_date extends Thread{
	
	public void run() {
		Calendar calendar = new GregorianCalendar();
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일 E요일 aa hh시mm분ss초");
		while(true) {
			String str = dateFormat.format(calendar.getTime()); // Date형
			String str2 = dateFormat.format(date.getTime());	// long형 -> 밀리세컨드 단위
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
