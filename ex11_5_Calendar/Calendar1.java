package ex11_5_Calendar;

import java.util.Calendar;

/*
 * Calendar는 추상 클래스로 이렇게 사용할 수 없다.
 * 1. Calendar c = new Calendar();
 * 
 * 2. Calendar 사용법 두가지
 * 	하나) 정적 메소드를 이용해서 사용하는 방법
 * 		Calendar c1 = Calendar.getInstance();
 * 		getInstance() : Calendar 클래스를 구현한 클래스의 인스턴스를 반환
 * 	둘) 업캐스팅 방법(자식의 주소를 부모에게 줌)
 * 		Calendar c2 = new GregorianCalendar();
 */
public class Calendar1 {
	
	public static void main(String[] args) {
		//기본적으로 현재날짜와 시간으로 설정한다.
		Calendar today = Calendar.getInstance();
		
		System.out.println("이 해의 년도: " + today.get(Calendar.YEAR));
		
		System.out.println("월(0~11, 0:1월): " + today.get(Calendar.MONTH));
		
		System.out.println("월(0~11, 0:1월): " + (today.get(Calendar.MONTH) + 1));
		
		System.out.println("이 해의 몇 째 주: " + today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("이 달의 몇 째 주: " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 해의 몇 째 일: " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("이 달의 몇 째 일: " + today.get(Calendar.DAY_OF_MONTH));
		
		//1:일요일, 2:월요일, 3:화요일, ..., 7:토요일
		if(today.get(Calendar.DAY_OF_WEEK) == 1) {
			System.out.println("요일(1~7, 1:일요일): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 2) {
			System.out.println("요일(1~7, 2:월요일): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 3) {
			System.out.println("요일(1~7, 3:화요일): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 4) {
			System.out.println("요일(1~7, 4:수요일): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 5) {
			System.out.println("요일(1~7, 5:목요일): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 6) {
			System.out.println("요일(1~7, 6:금요일): " + today.get(Calendar.DAY_OF_WEEK));
		} else if(today.get(Calendar.DAY_OF_WEEK) == 7) {
			System.out.println("요일(1~7, 7:토요일): " + today.get(Calendar.DAY_OF_WEEK));
		}
			
		
		if(today.get(Calendar.AM_PM) == 0) {
			System.out.println("오전_오후(0:오전, 1:오후): ");
			System.out.println("오전입니다." + today.get(Calendar.AM_PM));
		} else if(today.get(Calendar.AM_PM) == 1) {
			System.out.println("오전_오후(0:오전, 1:오후): ");
			System.out.println("오후입니다." + today.get(Calendar.AM_PM));
		}
		
		
		System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
		
		System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
		
		System.out.println("초(0~59): " + today.get(Calendar.SECOND));
		
		//이 달의 마지막 일을 찾는다.
		System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE));
		
		System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND));
		
		System.out.println("=====================================");
		
		System.out.printf("%d년", today.get(Calendar.YEAR));
		System.out.printf("%d월", (today.get(Calendar.MONTH) + 1));
		System.out.printf("%d일", today.get(Calendar.DAY_OF_MONTH));
		if(today.get(Calendar.AM_PM) == 0) {
			System.out.print(" 오전 ");
		} else {
			System.out.print(" 오후 ");
		}
		System.out.printf("%d시", today.get(Calendar.HOUR));
		System.out.printf("%d분", today.get(Calendar.MINUTE));
		System.out.printf("%d초", today.get(Calendar.SECOND));
		if(today.get(Calendar.DAY_OF_WEEK) == 1) {
			System.out.println(" 일요일입니다.");
		} else if(today.get(Calendar.DAY_OF_WEEK) == 2) {
			System.out.println(" 월요일입니다.");
		} else if(today.get(Calendar.DAY_OF_WEEK) == 3) {
			System.out.println(" 화요일입니다.");
		} else if(today.get(Calendar.DAY_OF_WEEK) == 4) {
			System.out.println(" 수요일입니다.");
		} else if(today.get(Calendar.DAY_OF_WEEK) == 5) {
			System.out.println(" 목요일입니다.");
		} else if(today.get(Calendar.DAY_OF_WEEK) == 6) {
			System.out.println(" 금요일입니다."); 
		} else {
			System.out.println(" 토요일입니다.");
		}
	}

}
