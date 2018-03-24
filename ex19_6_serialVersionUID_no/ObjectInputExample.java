package ex19_6_serialVersionUID_no;

import java.io.*;

class ObjectInputExample {
	
	public static void main(String[] args) {
		try(ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("output10.dat"))){
			System.out.println("***������ȭ �մϴ�.***");
			Rectangle rec = (Rectangle)in.readObject();
			System.out.println("����: " + rec.width);
			System.out.println("����: " + rec.height);
			System.out.println(rec.getArea());
			
			
		}  catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(EOFException eof) {
			System.out.println("��");
		} catch(IOException ioe) {
			//����ȭ�� �� ����� Ŭ������ ������ȭ�� �� ����� Ŭ������ ������
			//�ٸ� �� �߻��ϴ� ���� �޼��� ����ϴ� ��
			System.out.println(ioe.getMessage());
		}  catch(ClassNotFoundException cne) {
			System.out.println(cne.getMessage());
		}
	}

}
