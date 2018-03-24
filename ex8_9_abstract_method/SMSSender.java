package ex8_9_abstract_method;

public class SMSSender extends MessageSender{
	
	String returnPhoneNo;
	String message;
	
	SMSSender(String title, String senderName, String returnPhoneNo, String message){
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}
	
	
	//���� Ŭ������ �޼ҵ带 �������̵��ϴ� �޼ҵ�
	//�߻�޼ҵ带 ����(implement)
	@Override
	void sendMessage(String recipient) {
		System.out.println("-----------SMS----------");
		System.out.println("����: " + title);
		System.out.println("������ ���" + senderName);
		System.out.println("��ȭ��ȣ: " + recipient);
		System.out.println("ȸ�� ��ȭ��ȣ: " + returnPhoneNo);
		System.out.println("�޼��� ����: " + message);
	}

}
