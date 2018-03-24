package ex18_6_Buffered;

import java.io.*;

class BufferedInputStreamExample {
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Arguments �ǿ� output.txt�� �Է��ϼ���");
			return;
		}
		//������ ��
		try(
				BufferedInputStream in = 
				new BufferedInputStream(new FileInputStream(args[0]));
				){
			
			//BufferedInputStream in2 = new BufferedInputStream(
			//		new FileInputStream(args[0], 1024);
			//�� ��° �Ķ���ͷ� ������ �Ѱ��ָ� �� ũ���� ���۰� �����ȴ�.
			byte[] arr = new byte[16];
			
			while(true) {
				int num = in.read(arr);
				if(num < 0) {
					break;
				}
				
				System.out.println("10���� : ");
				for(int cnt = 0; cnt < arr.length; cnt++) {
					System.out.printf("%d \t", arr[cnt]);
				}
				System.out.println("\n\n8���� : ");
				for(int cnt = 0; cnt < arr.length; cnt++) {
					System.out.printf("%o \t", arr[cnt]);
				}
				System.out.println("\n\n16���� : ");
				for(int cnt = 0; cnt < arr.length; cnt++) {
					System.out.printf("%02X \t", arr[cnt]);
				}
				
				System.out.println("\n");
			}

		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
