package ex8_9_abstract_method;

public class EmailSender extends MessageSender{
	
	String senderAddr;
	String emailBody;
	
	EmailSender(String title, String senderName, String senderAddr, String emailBody){
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	
	@Override
	void sendMessage(String recipient) {
		System.out.println("-----------EMAIL----------");
		System.out.println("제목: " + title);
		System.out.println("보내는 사람: " + senderName);
		System.out.println("주소: " + recipient);
		System.out.println("회신 주소: " + senderAddr);
		System.out.println("이메일 내용: " + emailBody);
	}

}
