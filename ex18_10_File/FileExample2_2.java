package ex18_10_File;

import java.io.*;

class FileExample2_2 {
	
	public static void main(String[] args) {
		
		String dir = "d:\\newDirectory";
		
		File f2 = new File(dir);
		if(!f2.exists()) {
			System.out.println("새로 만든 디렉토리 이름 : " + f2.getPath());
			f2.mkdir();	//디렉토리 생성
		} else {
			System.out.println("이미 있는 디렉토리 이름 : " + f2.getPath());
		}
		
		File f = new File(dir + "\\newFile.txt");
		if(f.exists()) {
			System.out.println(f.getPath() + "경로에 " + f.getName() + "파일이 있습니다.");
		} else {
			try {
				//IOException 발생
				//boolean java.io.File.createNewFile() throws IOException
				if(f.createNewFile()) {
					System.out.println(f.getPath() + "에 새로운 파일을 만들었습니다.");
				}
			} catch(IOException ioe) {
				System.out.println(ioe.getMessage());
			}
		}
	}

}
