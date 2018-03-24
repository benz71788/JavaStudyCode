package ex19_6_serialVersionUID_no;

import java.io.*;

class ObjectOutputExample {
	
	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("output10.dat"));
				){
			Rectangle obj = new Rectangle(100, 200);
			System.out.println("길이: " + obj.width);
			System.out.println("높이: " + obj.height);
			
			System.out.println("***직렬화합니다.***");
			out.writeObject(obj);
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
