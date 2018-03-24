package ex13_8_clone_1;

//���� ������ Ŭ������ �����
//1�ܰ� - Cloneable �������̽� ����
//2�ܰ� - clone()�޼ҵ� �������̵� �ϱ�

class Rectangle implements Cloneable {
	
	//Cloneable�������̽��� �����Ǿ� �ִٴ� ���� Ŭ���� �ۼ��ڰ� ������ ����Ѵٴ� �ǹ��̴�.
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	/*
	 * Object Ŭ������ ���ǵ� clone()
	 * protected Object clone() throws CloneNotSupportException;
	 * ==> �������̵��� ���� ������ ����
	 * (protected => public : ��Ӱ��� ���� �ٸ� Ŭ�������� ȣ�� �� �� �ִ�.
	 */
	public Object clone() {	//��ȯ���� Object�� �̴�.
		try {
			//���� Ŭ������ clone�޼ҵ带 ȣ���ؼ� �� ����� ����
			return super.clone();
		} 
		//���� Ŭ������ clone�޼ҵ尡 �߻��ϴ� �ͼ����� ó��
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
}
