package ex19_2_Serialization_transient;

//transient Ű����: ����ȭ���� ���ܽ�ų �ʵ带 ǥ���ϴ� Ű����
//������� : ObjectOutputExample -> ObjectInputExample
class BBSItem implements java.io.Serializable{
	
	static int itemNum = 0;		//�Խù��� ��-���� �ʵ�� ����ȭ ����� ���� �ʴ´�.
	String writer;				//�۾��� - �ν��Ͻ� �ʵ�� ����ȭ ����� �ȴ�.
	transient String passwd;	//�н����� - transient Ű���� ���� �ν��Ͻ� �ʵ�� ����ȭ ����� ���� �ʴ´�.
	
	String title;				//���� - �ν��Ͻ� �ʵ�� ����ȭ ����� �ȴ�.
	String content;				//���� - �ν��Ͻ� �ʵ�� ����ȭ ����� �ȴ�.
	
	//�����ڴ� ����ȭ ����� ���� �ʴ´�.
	BBSItem(String writer, String passwd, String title, String content){
		this.writer = writer;
		this.passwd = passwd;
		this.title = title;
		this.content = content;
		itemNum++;
	}
	
	//�޼ҵ�� ����ȭ ����� ���� �ʴ´�.
	void modifyContent(String content, String passwd) {
		if(!passwd.equals(this.passwd)) {
			return;
		}
		this.content = content;
	}

}
