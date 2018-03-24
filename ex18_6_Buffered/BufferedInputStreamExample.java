package ex18_6_Buffered;

import java.io.*;

class BufferedInputStreamExample {
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Arguments 탭에 output.txt를 입력하세요");
			return;
		}
		//수정된 곳
		try(
				BufferedInputStream in = 
				new BufferedInputStream(new FileInputStream(args[0]));
				){
			
			//BufferedInputStream in2 = new BufferedInputStream(
			//		new FileInputStream(args[0], 1024);
			//두 번째 파라미터로 정수를 넘겨주면 그 크기의 버퍼가 생성된다.
			byte[] arr = new byte[16];
			
			while(true) {
				int num = in.read(arr);
				if(num < 0) {
					break;
				}
				
				System.out.println("10진수 : ");
				for(int cnt = 0; cnt < arr.length; cnt++) {
					System.out.printf("%d \t", arr[cnt]);
				}
				System.out.println("\n\n8진수 : ");
				for(int cnt = 0; cnt < arr.length; cnt++) {
					System.out.printf("%o \t", arr[cnt]);
				}
				System.out.println("\n\n16진수 : ");
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
