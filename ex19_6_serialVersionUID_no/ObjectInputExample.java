package ex19_6_serialVersionUID_no;

import java.io.*;

class ObjectInputExample {
	
	public static void main(String[] args) {
		try(ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("output10.dat"))){
			System.out.println("***역직렬화 합니다.***");
			Rectangle rec = (Rectangle)in.readObject();
			System.out.println("길이: " + rec.width);
			System.out.println("높이: " + rec.height);
			System.out.println(rec.getArea());
			
			
		}  catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch(EOFException eof) {
			System.out.println("끝");
		} catch(IOException ioe) {
			//직렬화할 때 사용한 클래스와 역직렬화할 때 사용한 클래스의 버전이
			//다를 때 발생하는 에러 메세지 출력하는 곳
			System.out.println(ioe.getMessage());
		}  catch(ClassNotFoundException cne) {
			System.out.println(cne.getMessage());
		}
	}

}
