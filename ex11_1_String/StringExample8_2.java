package ex11_1_String;

class StringExample8_2 {
	
	public static void main(String[] args) {
		String message = "Hello, Galaxy";
		String message2 = "Helloaa, Apple";
		
		//������ ���ڰ� ���ʷ� ��ġ�� �ε����� ���մϴ�. �������� �ʴ� ��� -1�� �����Ѵ�.
		//���ڿ� �տ��� ���� ���ʴ�� �˻��Ѵ�.
		int index1 = message.lastIndexOf('a');
		System.out.println("a�� ��ġ�� " + index1);
		
		//�ƽ�Ű�ڵ� 97�� �ҹ��� 'a'
		int index2 = message.lastIndexOf(97);
		System.out.println("a�� ��ġ�� " + index2);
		
		//�ƽ�Ű�ڵ� 65�� �빮�� 'A'
		int index3 = message.lastIndexOf(65);
		//'A'�� ���� ���� index ���� -1dmf ��ȯ�Ѵ�.
		System.out.println("A�� ��ġ�� " + index3);

	}	
}
