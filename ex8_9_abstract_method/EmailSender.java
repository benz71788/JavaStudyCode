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
		System.out.println("����: " + title);
		System.out.println("������ ���: " + senderName);
		System.out.println("�ּ�: " + recipient);
		System.out.println("ȸ�� �ּ�: " + senderAddr);
		System.out.println("�̸��� ����: " + emailBody);
	}

}
