package ex11_7_Math;

import java.util.Random;

class RandomExample1 {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		//0���� 100�̸��� ������ ���� �߻� - ��, 0���� 99������ ������ ���� �߻�
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		
		//1���� 45������ ���� �߻�
		System.out.println("1~45������ ���� �߻�: " + (random.nextInt(45) + 1));
		/*
		 * 0 	<= random.nextInt(45)		<= 44
		 * 1	<= random.nextInt(45) + 1	<= 45
		 */
	}

}
