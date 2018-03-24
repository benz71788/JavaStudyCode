package ex11_5_Calendar;

enum DayOfWeek {
	
	SUNDAY(" 일요일입니다."), MONDAY(" 월요일입니다."), TUESDAY(" 화요일입니다."), WEDNESDAY(" 수요일입니다."), TURSDAY(" 목요일입니다."), FRIDAY(" 금요일입니다."), SATURDAY(" 토요일입니다.");
	
	final private String day;
	private DayOfWeek(String day) {
		this.day = day;
	}
	
	String value() {
		return day;
	}

}
