//Object�� toString �޼ҵ� �������̵� ��
package ex13_2_Object_toString_override;

class ObjectExample3 {
	
	public static void main(String[] args) {
		
		GoodsStock gs = new GoodsStock("12345", 90);
		
		String str = gs.toString();
		
		System.out.println(str);
		
		System.out.println(gs);
		
		System.out.println("=================================");
		
		GoodsStock gs2 = new GoodsStock("57293", 100);
		String str2 = "������� = " + gs2;
		//���ڿ��� GoodsStock ��ü ������ +�����ڷ� �����ϸ�
		//�� ��ü�� toString �޼ҵ尡 �ڵ����� ȣ��� �� ���ڿ��� ����ȴ�.
		// String str = "������� = " + gs2.toString()
		System.out.println(str2);
		
	}
	
	
}
