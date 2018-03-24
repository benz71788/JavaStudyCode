package ex19_2_Serialization_transient;

import java.io.*;

class ObjectOutputExample_resource {
	
	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("output3.dat"));
				){
			BBSItem obj = new BBSItem("�ּ���", "sunshine", "�����սô�.", "�̹��� �ָ� �����?");
			//�Խù��� �� - ���� �ʵ�� ����ȭ ����� ���� �ʴ´�.
			System.out.println("��ü�Խù��� ��: " + BBSItem.itemNum);
			System.out.println("�۾���: " + obj.writer);
			//transient�ν��Ͻ� �ʵ�� ����ȭ ����� ���� �ʴ´�.
			System.out.println("�н�����: " + obj.passwd);
			System.out.println("����: " + obj.title);
			System.out.println("����: " + obj.content);
			out.writeObject(obj);	//��ü�� ����ȭ�ϴ� �κ�
		} catch(IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
	}

}
