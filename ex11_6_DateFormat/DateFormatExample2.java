package ex11_6_DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

class DateFormatExample2 {
	
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY년 MM월 dd일 aa HH시 mm분 ss초");
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy년 M월 d일 a h시 m분 s초");
		
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy년 M월 d일 E a h시 m분 s초");
		
		//calendar.getTime() : calendar객체가 가지고 있는 날짜와 사긴과 똑같은
		//정보를 갖는 Date 객체를 만들어서 리턴하는 메서드입니다.
		System.out.println(calendar.getTime());
		System.out.println(new Date());
		System.out.println(calendar.getTimeInMillis());
		
		//calendar.getTime()의 리턴형은 Date형
		String str = dateFormat.format(calendar.getTime());
		System.out.println(str);
		
		String str2 = dateFormat2.format(calendar.getTime());
		System.out.println(str2);
		
		String str3 = dateFormat3.format(calendar.getTime());
		System.out.println(str3);
	}

}
