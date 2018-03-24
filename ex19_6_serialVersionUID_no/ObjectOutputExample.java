package ex19_6_serialVersionUID_no;

import java.io.*;

class ObjectOutputExample {
	
	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("output10.dat"));
				){
			Rectangle obj = new Rectangle(100, 200);
			System.out.println("����: " + obj.width);
			System.out.println("����: " + obj.height);
			
			System.out.println("***����ȭ�մϴ�.***");
			out.writeObject(obj);
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
