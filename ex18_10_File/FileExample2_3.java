package ex18_10_File;

import java.io.*;

class FileExample2_3 {
	
	public static void main(String[] args) {
		
		String dir = "d:\\newDirectory\\newFile.txt";
		
		File f3 = new File(dir);
		if(f3.exists()) {
			if(f3.delete()) {
				System.out.println(f3.getPath() + " 삭제했습니다.");
			} else {
				System.out.println(f3.getPath() + " 삭제 하지 못했습니다.");
			}
			
		} else {
			System.out.println(f3.getPath() + "존재하지 않습니다.");
		}
		
		/*디렉토리 삭제
		 * 	boolean java.io.File.delete() : 디렉토리 삭제합니다.
		 * 	단 디렉토리 안에 파일이 있으면 삭제 하지 못한다.
		 *  이때 반환값은 false가 된다.
		 */
		
		File f4 = new File("d:\\newDirectory");
		if(f4.exists()) {
			if(f4.delete()) {	//디렉토리 삭제
				System.out.println(f4.getPath() + " 삭제했습니다.");
			} else {
				System.out.println(f4.getPath() + " 삭제하지 못했습니다.");
			}
		} else {
			System.out.println(f4.getPath() + "에 삭제하고자 하는 디렉토리가 없습니다.");
		}
	}

}
