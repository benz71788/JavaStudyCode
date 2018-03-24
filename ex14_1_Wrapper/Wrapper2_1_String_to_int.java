package ex14_1_Wrapper;

public class Wrapper2_1_String_to_int {
	
	public static void main(String[] args) {
		
		/* 
		 * Integer��ü�� �̿��� String -> int ��� �� ����
		 * 
		 * ���1.
		 * 	String -> Integer ��ü
		 * 	Integer ��ü -> int�� ��
		 */
		
		int total = 0;
		for(int cnt = 0; cnt < args.length; cnt++) {
			//�����߻�(Stirng -> int ����ȯ �䱸)
			Integer obj = new Integer(args[cnt]);
			total = obj.intValue() + total;
		}
		System.out.println(total);
		
		
		/*
		 * ���2.
		 * 	String -> int
		 * 	��)Integer.parseInt(args[cnt]);
		*/
		int total2 = 0;
		for(int cnt = 0; cnt < args.length; cnt++) {
			int arg = Integer.parseInt(args[cnt]);
			total2 = arg + total2;
		}
		System.out.println(total2);
	}

}
