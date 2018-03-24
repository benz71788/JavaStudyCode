package ex8_9_abstract_method;

public class AbstractExample1 {
	
	public static void main(String[] args) {
		
		SMSSender smsSender = new SMSSender("생일 축하합니다." , "고객센터", "010-1111-1111", "10% 할인쿠폰이 발행되었습니다.");
		
		EmailSender emailSender = new EmailSender("새해 복 많이 받으세요", "이길순", "benz@gmail.com", "기프트 머니가 입금되었습니다.");
		
		smsSender.sendMessage("010-2222-2222");
		
		System.out.println();
		
		emailSender.sendMessage("aaa@gmai.com");
		
		
	}

}
