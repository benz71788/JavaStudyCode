package ex14_1_Wrapper;

public class Wrapper1_boxing_unboxing {
	
	public static void main(String[] args) {
		
		//�ڽ� - �⺻�� Ÿ���� ���� ��ü�� ��ȯ
		//int -> Integer
		Integer obj1 = new Integer(12);	//Integer ��ü�� �����Ѵ�.
		Integer obj2 = new Integer(7);
		
		//��ڽ� - ��ü�� �⺻�� Ÿ���� ������ ��ȯ
		//Integer -> int
		int n1 = obj1.intValue();
		int n2 = obj2.intValue();	//Integer��ü �ȿ� int���� �����´�.
		int sum = n1 + n2;
		System.out.println(sum);
		
		//String -> Integer -> int
		Integer n02 = new Integer("20");	//�ڽ��� �ƴմϴ�.
											//"20"�� ���ڿ��� �⺻���� �ƴϴ�.
		int n3 = n02.intValue();			//��ڽ� �̷����, �̰����� ����ȯ�� �̷������.
		System.out.println(n3);
		
	}

}
