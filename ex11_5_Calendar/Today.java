package ex11_5_Calendar;

import java.util.Calendar;


class Today {
	
	void print(Calendar today) {
		
		String[] dayOfWeek = new String[] {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		String[] ampm = new String[] {"오전", "오후"};
		
		System.out.printf("%d년", today.get(Calendar.YEAR));
		System.out.printf("%d월", (today.get(Calendar.MONTH) + 1));	//월이 0부터 11까지 구해져서 1을 더해야 함.
		System.out.printf("%d일", today.get(Calendar.DAY_OF_MONTH));
		System.out.printf(" %s ", ampm[today.get(Calendar.AM_PM)]);	//오전:0, 오후:1
		System.out.printf("%d시", today.get(Calendar.HOUR));
//		System.out.printf("%d시", today.get(Calendar.HOUR_OF_DAY)); //24시간
		System.out.printf("%d분", today.get(Calendar.MINUTE));
		System.out.printf("%d초", today.get(Calendar.SECOND));
		System.out.printf(" %s입니다.\n", dayOfWeek[today.get(Calendar.DAY_OF_WEEK) - 1]);

	}
	
}
