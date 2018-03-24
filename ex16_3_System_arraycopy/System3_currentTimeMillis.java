package ex16_3_System_arraycopy;

class System3_currentTimeMillis {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		System.out.println("���� = " + time1);
		double total = 0.0;
		for(int cnt = 1; cnt < 1000000000; cnt += 2) {
			if(cnt / 2 % 2 == 0) {
				total += 1.0 / cnt;
			} else {
				total -= 1.0 / cnt;
			}
		}
		
		double pi = total * 4;
		
		
		long time2 = System.currentTimeMillis();
		System.out.println("result = " + pi);
		System.out.println("�� = " + time2);
		
		long result = time2 - time1;
		double result1 = (double)result / 1000D;
		
		System.out.printf("��꿡 %d ms�� �ҿ�Ǿ����ϴ�.\n", result);
		System.out.printf("��꿡 %f �ʰ� �ҿ�Ǿ����ϴ�.\n", result1);
		System.out.printf("��꿡 %6.3f �ʰ� �ҿ�Ǿ����ϴ�.\n", result1);
		
	}
}
