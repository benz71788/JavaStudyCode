package ex13_1_Object_toString;

/*
 * objectŬ������ ���ǵ� toString()�� �ν��Ͻ��� ���� ������
 * ���ڿ�(String)�� ������ �������� ������ ���̴�.
 * Ŭ���� �ۼ��� �� toString()�� �������̵� ���� ������ �Ʒ��� ����
 * ���ǵ� ������ �״�� ���� ���̴�.
 * 
 * 	public String toString(){
 * 		return getClass().getName() + "@"
 * 				+ Integer.toHexString(hasCode());
 * 	}
 * 
 * - getClass()�޼ҵ�� hashCode()�޼ҵ� ���� ObjectŬ������ �޼ҵ��̹Ƿ�
 * 	 �ν��Ͻ� �������� �ٷ� ȣ���� �� �ִ�.
 * 	 �ؽ� �ڵ�� �ν��Ͻ��� �ּҿ� ���õ� ���̴�.
 * 
 * - hashCode()�޼���� �ؽ�(hashing) ����� ���Ǵ�
 * 	 �ؽ��Լ�(hash function)�� ������ ���̴�.
 * 	 �ؽ��� ������ ���� ��� ���� �ϳ��� �ٷ��� �����͸� �����ϰ�
 *	 �˻��ϴ� �� �����ϴ�.
 *	 �ؽ��Լ��� ã�����ϴ� ���� �Է��ϸ� �� ���� ����� ��ġ�� �˷��ִ�
 *	 �ؽ��ڵ带 ��ȯ�Ѵ�.
 *
 * - Circle �ν��Ͻ� �� ���� ������ ���� �� �ν��Ͻ��� toString()��
 * 	 ȣ���� ����� ����ߴ�.
 * 	 Circle Ŭ�������� Object Ŭ�����κ��� ��ӹ��� toString()��
 * 	 �������̵� ���� �ʾұ� ������
 * 	 Circle �ν��Ͻ��� toString()�� ȣ���ϸ�
 * 	 Object Ŭ������ toString()�� ȣ��ȴ�.
 */
class ObjectExample2 {
	
	public static void main(String[] args) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		System.out.println(obj1.toString());
		//System.out.print()�� System.out.println()�޼ҵ忡
		//���ڿ��� �ƴ� ��ü�� �Ѱ��ָ� �� �޼ҵ�ȿ��� ����������
		//toString()�޼ҵ尡 ȣ��ȴ�.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}

}
