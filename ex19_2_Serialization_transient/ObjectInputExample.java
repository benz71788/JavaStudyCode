package ex19_2_Serialization_transient;

import java.io.*;

class ObjectInputExample {
	
	public static void main(String[] args){
		try(ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("output3.dat"));
				){
			BBSItem obj = (BBSItem)in.readObject();	//��ü�� ������ȭ �ϴ� �κ�
			//�Խù��� �� - ���� �ʵ�� ����ȭ ����� ���� �ʴ´�.
			System.out.println("��ü�Խù��� ��: " + BBSItem.itemNum);
			System.out.println("�۾���: " + obj.writer);
			//transient�ν��Ͻ� �ʵ�� ����ȭ ����� ���� �ʴ´�.
			System.out.println("�н�����: " + obj.passwd);
			System.out.println("����: " + obj.title);
			System.out.println("����: " + obj.content);
		} catch(FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		} catch(EOFException eofe) {
			System.out.println("��");
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe.getMessage());
		}
	}

}
