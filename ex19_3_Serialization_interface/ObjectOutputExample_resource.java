package ex19_3_Serialization_interface;

import java.io.*;

class ObjectOutputExample_resource {
	
	public static void main(String[] args) {
		try(
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output2.dat"));
				){
			out.writeObject(new GoodsStock("70101", 100));
			out.writeObject(new GoodsStock("70102", 50));
			out.writeObject(new GoodsStock("70103", 200));
			System.out.println("���Ϸ� ����Ͽ����ϴ�.");
		} catch(IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
			ioe.printStackTrace();
		}
	}

}
