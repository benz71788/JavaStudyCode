package ex11_5_Calendar;

enum DayOfWeek {
	
	SUNDAY(" �Ͽ����Դϴ�."), MONDAY(" �������Դϴ�."), TUESDAY(" ȭ�����Դϴ�."), WEDNESDAY(" �������Դϴ�."), TURSDAY(" ������Դϴ�."), FRIDAY(" �ݿ����Դϴ�."), SATURDAY(" ������Դϴ�.");
	
	final private String day;
	private DayOfWeek(String day) {
		this.day = day;
	}
	
	String value() {
		return day;
	}

}
