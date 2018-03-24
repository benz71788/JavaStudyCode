package ex8_9_abstract_method;

abstract class MessageSender {
	
	String title;
	String senderName;
	
	MessageSender(String title, String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	
	abstract void sendMessage(String recipient);

}
