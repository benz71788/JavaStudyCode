package ex11_6_DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat 클래스를 사용하여 두 날짜 차이를 구하는 프로그램
//String -> Date 형으로 변환
class DateFormatExample3 {
	
	public static void main(String[] args) {
		String start = "2018-02-05";
		String end = "2018-08-14";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			//String -> Date 형으로 변환
			Date beginDate = dateFormat.parse(start);
			Date endDate = dateFormat.parse(end);
			
			System.out.println(beginDate);
			System.out.println(endDate);
			
			System.out.println(endDate.getTime());
			System.out.println(beginDate.getTime());
			
			long diff = endDate.getTime() - beginDate.getTime();	
			
			long diffDays = diff /(1000 * 24 * 60 * 60);
			
			System.out.println("날짜 차이: " + diffDays + "일");

			
		} catch(ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
