package ex19_7_serialVersionUID;

//���� �簢�� Ŭ������ �޼ҵ� �߰��� ���
//���� �߻� : ����ȭ�� �� ����� Ŭ������
//������ȭ�� �� ����� Ŭ������ ������ �ٸ��� ����
class Rectangle implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1182191355357906580L;
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return width * height;
	}

}
