package ex19_2_Serialization_transient;

import java.io.*;

class ObjectInputExample {
	
	public static void main(String[] args){
		try(ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("output3.dat"));
				){
			BBSItem obj = (BBSItem)in.readObject();	//객체를 역직렬화 하는 부분
			//게시물의 수 - 정적 필드는 직렬화 대상이 되지 않는다.
			System.out.println("전체게시물의 수: " + BBSItem.itemNum);
			System.out.println("글쓴이: " + obj.writer);
			//transient인스턴스 필드는 직렬화 대상이 되지 않는다.
			System.out.println("패스워드: " + obj.passwd);
			System.out.println("제목: " + obj.title);
			System.out.println("내용: " + obj.content);
		} catch(FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		} catch(EOFException eofe) {
			System.out.println("끝");
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe.getMessage());
		}
	}

}
