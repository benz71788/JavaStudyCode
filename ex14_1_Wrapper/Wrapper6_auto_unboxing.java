package ex14_1_Wrapper;

//Wrapper��ü -> �⺻�� ������ �ڵ�(����) Unboxing�ϴ� ��
//�⺻���� ���� ��� �� �ڸ��� Wrapper ��ü�� ����ϸ�
//�� Wrapper ��ü�� ���� �⺻���� ���� �ڵ����� ����Ǿ� ���ȴ�.
public class Wrapper6_auto_unboxing {
	
	public static void main(String[] args) {
		
		//���ڿ� "10"�� Wrapper ��ü Integer�� �ٲ�
		Integer obj = new Integer("10");
		
		//Integer ��ü�� int Ÿ���� ���� ���ϴ� ��ɹ�
		int sum = obj + 20;		//�ڵ�(����) unboxing
		//int sum = obj.intValue() + 20;
		
		System.out.println(sum);
	}

}
