package ex11_2_StringBuffer_StringBuilder;

//StringBuffer�� ��Ƽ�����忡 �����ϵ��� ����ȭ�Ǿ� �ִ�.
//��Ƽ������� �ۼ��� ���α׷��� �ƴ� ��� StringBuffer�� ����ȭ��
//���ʿ��ϰ� ���ɸ� ����߸��� �Ǿ� StringBuffer���� �������� ����ȭ�� ��
//StringBuilder�� �߰��Ǿ���.
//StringBuilder�� StringBuffer�� �Ȱ��� ������� �ۼ��Ǿ� �ִ�.
public class StringBufferExample1 {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("���ع��� ��λ��� ������  ");
		
		System.out.println(sb.append("�⵵�� �����ϻ� "));		//���� ���ڿ��� �߰�
		System.out.println(sb.insert(19, "�ϴ����� �ϴ����� "));	//index�� ���ϴ� ��ġ�� ���ڿ� �߰�
		System.out.println(sb.delete(24, 28));				//index�� 24���� 27���� ���ڿ� ����
		System.out.println(sb.deleteCharAt(9));				//index�� 9�� ���� �����ϳ� ����
		System.out.println(sb.append("�൵�� �����ϻ�").delete(0, 5));
	}

}
