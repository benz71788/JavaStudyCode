package ex13_8_clone_2;

class ObjectExample2 {
	
	public static void main(String[] args) {
		//��ü �����Ѵ�.
		Rectangle obj1 = new Rectangle(10, 20);
		
		//clone �޼���� ��ü�� �����Ѵ�.)
		Rectangle obj2 = obj1.clone();
		
		//���� ��ü�� ���� ��ü�� ���� ����Ѵ�.
		System.out.println("obj1 = " + obj1.width + " x " + obj1.height);
		System.out.println("obj2 = " + obj2.width + " x " + obj2.height);
		
		obj1.height = 100; obj1.width = 200;
		System.out.println("obj1 = " + obj1.width + " x " + obj1.height);
		System.out.println("obj2 = " + obj2.width + " x " + obj2.height);
	}

}
