package ex8_9_abstract_method;

public class AbstractExample1 {
	
	public static void main(String[] args) {
		
		SMSSender smsSender = new SMSSender("���� �����մϴ�." , "������", "010-1111-1111", "10% ���������� ����Ǿ����ϴ�.");
		
		EmailSender emailSender = new EmailSender("���� �� ���� ��������", "�̱��", "benz@gmail.com", "����Ʈ �Ӵϰ� �ԱݵǾ����ϴ�.");
		
		smsSender.sendMessage("010-2222-2222");
		
		System.out.println();
		
		emailSender.sendMessage("aaa@gmai.com");
		
		
	}

}
