package ex19_2_Serialization_transient;

//transient 키워드: 직렬화에서 제외시킬 필드를 표시하는 키워드
//실행순서 : ObjectOutputExample -> ObjectInputExample
class BBSItem implements java.io.Serializable{
	
	static int itemNum = 0;		//게시물의 수-정적 필드는 직렬화 대상이 되지 않는다.
	String writer;				//글쓴이 - 인스턴스 필드는 직렬화 대상이 된다.
	transient String passwd;	//패스워드 - transient 키워드 붇은 인스턴스 필드는 직렬화 대상이 되지 않는다.
	
	String title;				//제목 - 인스턴스 필드는 직렬화 대상이 된다.
	String content;				//내용 - 인스턴스 필드는 직렬화 대상이 된다.
	
	//생성자는 직렬화 대상이 되지 않는다.
	BBSItem(String writer, String passwd, String title, String content){
		this.writer = writer;
		this.passwd = passwd;
		this.title = title;
		this.content = content;
		itemNum++;
	}
	
	//메소드는 직렬화 대상이 되지 않는다.
	void modifyContent(String content, String passwd) {
		if(!passwd.equals(this.passwd)) {
			return;
		}
		this.content = content;
	}

}
