package ex8_12_polymorphism;

public class Polymorphism_main {
	
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("-----Child c = new Child();-----");
		c.parentPrn();
		c.childPrn();
		System.out.println("c.message = " + c.message);
		
		System.out.println("--------------------------------");
		
		Parent p;
		p = c;	// Praent p = new Child();
		
		System.out.println("-----Parent p = new Child(); ��ĳ�� ��------");
		
		//������ ���� �Ŀ��� �θ�κ��� ��ӹ��� �޼��常 ȣ���� �� �ִ�.
		//���� ���ε� ���� - �������̵��� �޼��带 ȣ���� ��� ������ �ÿ��� ���� ����������
		//Ÿ�� ������ üũ�ϰ� ���α׷� ���� �߿� ��ü�� Ÿ���� �����Ǿ� ȣ��� �������̵� �޼��尡
		//�θ� Ŭ������ �޼������� �ڽ� Ŭ�������� �Ǵ��Ͽ� �����ϰ� �ȴ�.
		//�θ� Parent�� parentPrn()�� �����ϱ� ������ ������ ������ �����ϴ�.
		//parentPrn()�� �������̵��� �޼����̰� ��ü�� Ÿ���� Child�̱� ������
		//Child�� parentPrn()�� �����ϰ� �ȴ�.
		p.parentPrn();
		
		//p.childPrn(); //������ ������ �߻��ϰ� �ȴ�.
		//���� ������ �ڷ��� Parent Ŭ�������� childPrn()�޼ҵ尡 ���� ����
		
		//������ ���� �� �ʵ�� �θ��� �ʵ尪�� ���
		//���� ���ε� ���� - ��ü�� Ÿ���� �����Ϸ��� ���� ������ �Ǵ� ������ �����Ǵ� ����
		//private, final, static �޼���, �ν��Ͻ� ���� ���� �ش�ȴ�.
		//�θ� Ŭ������ �ʵ忡 �ּ��� �޸� ���� �߻�
		System.out.println("p.message = " + p.message);
		
		Parent p1 = new Parent();
		
		p1.parentPrn();
	}

}
