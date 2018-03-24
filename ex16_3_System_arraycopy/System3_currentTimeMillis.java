package ex16_3_System_arraycopy;

class System3_currentTimeMillis {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		System.out.println("시작 = " + time1);
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
		System.out.println("끝 = " + time2);
		
		long result = time2 - time1;
		double result1 = (double)result / 1000D;
		
		System.out.printf("계산에 %d ms가 소요되었습니다.\n", result);
		System.out.printf("계산에 %f 초가 소요되었습니다.\n", result1);
		System.out.printf("계산에 %6.3f 초가 소요되었습니다.\n", result1);
		
	}
}
