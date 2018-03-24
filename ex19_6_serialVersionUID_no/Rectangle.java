package ex19_6_serialVersionUID_no;

//���� �簢�� Ŭ������ �޼ҵ� �߰��� ���
//���� �߻� : ����ȭ�� �� ����� Ŭ������
//������ȭ�� �� ����� Ŭ������ ������ �ٸ��� ����
class Rectangle implements java.io.Serializable{
	
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	/*
	 * ������
	 * 1. �Ʒ� getArea �޼ҵ��� �ּ��� �ް� ������ ��쿡�� ���� ����.
	 * 		ObjectOutputExample.java�� ����
	 * 		ObjectInputExample.java.�� ����
	 * 
	 * 2. �Ʒ� �޼ҵ��� �ּ��� Ǭ�� - �����߻�
	 * 		ObjectInputExample.java�� ����
	 * 	
	 * 	ex19_6_serialVersionUID_no.Rectangle;
	 * 	local class incompatible; // Ŭ������ ȣȯ���� �ʴ´�.
	 *	//��Ʈ���� ���� �о���� ���� �ȿ� ��ϵǾ� �ִ� ���� ��ȣ
	 *	stream classdesc serialVersionUID = -3177450505124451093,
	 *	//������ȭ ���α׷� 
	 *	local class serialVersionUID = -6756196667506680241
	 * 	serialVersionUID�� ���� Ŭ�������� �˷��ִ� �ĺ��� ������ �ϸ�
	 * 	Serializable �������̽��� ������ Ŭ������ �������ϸ� �ڵ�������
	 * 	serialVersionUID ���� �ʵ尡 �߰��ȴ�.
	 * 	
	 * 	���� ���� ��ȣ�� �ڹ��� ����ȭ ��Ŀ����� ������ȭ ��Ŀ������ ����� ��
	 * 	�ڵ����� �ο��Ǵµ� ����ȭ ���� Ŭ������ ������ �״���̸� ���� ��ȣ�� �ο��ǰ�
	 * 	Ŭ������ ������Ұ� �ϳ��� �ٲ�� ������ �ٸ� ���� ��ȣ�� �ο��ȴ�.
	 * 
	 * 	������ ��������� Ŭ������ serialVersionUID�� ����Ǿ� ������
	 * 	������ �� �߰� ���� �ʱ� ������ ������ ���� ������ �� �ִ�.
	 */
	
	int getArea() {
		return width * height;
	}

}
