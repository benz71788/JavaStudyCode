package ex19_2_Serialization_transient;

import java.io.*;

class ObjectOutputExample_resource {
	
	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("output3.dat"));
				){
			BBSItem obj = new BBSItem("최선희", "sunshine", "정모합시다.", "이번주 주말 어떠세요?");
			//게시물의 수 - 정적 필드는 직렬화 대상이 되지 않는다.
			System.out.println("전체게시물의 수: " + BBSItem.itemNum);
			System.out.println("글쓴이: " + obj.writer);
			//transient인스턴스 필드는 직렬화 대상이 되지 않는다.
			System.out.println("패스워드: " + obj.passwd);
			System.out.println("제목: " + obj.title);
			System.out.println("내용: " + obj.content);
			out.writeObject(obj);	//객체를 직렬화하는 부분
		} catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
	}

}
