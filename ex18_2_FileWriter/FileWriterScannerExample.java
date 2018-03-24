package ex18_2_FileWriter;

import java.io.*;
import java.util.Scanner;

class FileWriterScannerExample {
	
	public static void main(String[] args) {
		FileWriter writer = null;
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[1000];
		try {
			System.out.println("입력하세요: ");
			String data = sc.nextLine();
			writer = new FileWriter("output_Scanner.txt");
			
			for(int i = 0; i < arr.length; i++) {
				char dataChar = data.charAt(arr[i]);
				writer.write(dataChar);
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sc.close();
				writer.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
