package ex18_2_FileWriter;

import java.io.FileWriter;

class GugudanExample {
	
	public static void main(String[] args) {
	
		FileWriter writer = null;
		try {
			
			writer = new FileWriter("src/ex18_2_FileWriter/gugudan1.txt");
			gugudan(writer);

		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				writer.close();
				
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	static void gugudan(FileWriter writer) {
		
		try {
			
			for(int i = 2; i < 10; i++) {
				writer.write("[" + i + "]´Ü\t\t");
			}
			writer.write("\n");
			for(int i = 1; i < 10; i++) {
				for(int j = 2; j < 10; j++) {
					writer.write(j + " * " + i + " = " + j * i);
					writer.write("\t");
				}
				writer.write("\n");
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
