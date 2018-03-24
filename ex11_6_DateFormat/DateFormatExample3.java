package ex11_6_DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat Ŭ������ ����Ͽ� �� ��¥ ���̸� ���ϴ� ���α׷�
//String -> Date ������ ��ȯ
class DateFormatExample3 {
	
	public static void main(String[] args) {
		String start = "2018-02-05";
		String end = "2018-08-14";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			//String -> Date ������ ��ȯ
			Date beginDate = dateFormat.parse(start);
			Date endDate = dateFormat.parse(end);
			
			System.out.println(beginDate);
			System.out.println(endDate);
			
			System.out.println(endDate.getTime());
			System.out.println(beginDate.getTime());
			
			long diff = endDate.getTime() - beginDate.getTime();	
			
			long diffDays = diff /(1000 * 24 * 60 * 60);
			
			System.out.println("��¥ ����: " + diffDays + "��");

			
		} catch(ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
