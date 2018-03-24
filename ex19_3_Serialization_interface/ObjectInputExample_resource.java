package ex19_3_Serialization_interface;

import java.io.*;

class ObjectInputExample_resource {
	
	public static void main(String[] args) {
		String str, stockName = "";
		int stockNum;
		try(ObjectInputStream in = new ObjectInputStream
				(new FileInputStream("output2.dat"));
				){
			while(true) {
				GoodsStock gs = (GoodsStock)in.readObject();
//				stockName = gs.code;
//				stockNum = gs.num;
//				System.out.printf("��ǰ�ڵ�:%s\t ��ǰ����:%d\n", stockName, stockNum);
			
				System.out.println(gs.toString());
			}
		
		} catch(FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		} catch(EOFException eof) {
			System.out.println("��");
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}  catch(ClassNotFoundException cne) {
			System.out.println(cne.getMessage());
		}
	}

}
