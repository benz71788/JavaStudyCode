package ex11_7_Math;

class MathExample3 {
	
	public static void main(String[] args) {
		System.out.println(Math.random());	// 0 <= ���� < 1 : double��
		System.out.println((int)(Math.random() * 10));
		System.out.println((int)(Math.random() * 100));
		
		
		int num;
		/*
		 * 0���� 9������ ���� ������ ���ϴ� ������ �����
		 * 1. 0 <= ���� < 1
		 * 2. 0 <= ���� * 10 < 10
		 * 3. 0 <= int(���� * 10) < 10 ==> ������ �����
		 */
		
		//���� : (����ȭ)((���Ѱ� - ���Ѱ� + 1) * ���� + ���Ѱ�)
		//		(int)((9 - 0 + 1) * ���� + 0)
		num = (int)(Math.random() * 10);
		System.out.println(num);

				
	}
}
