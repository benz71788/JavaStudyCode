package ex19_2_Serialization_error;

import java.io.*;

class ObjectOutputExample_resource {
	
	public static void main(String[] args) {
		try(
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output2.dat"));
				){
			out.writeObject(new GoodsStock("70101", 100));
			out.writeObject(new GoodsStock("70102", 50));
			out.writeObject(new GoodsStock("70103", 200));
		} catch(IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
			ioe.printStackTrace();
		}
	}

}
