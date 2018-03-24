package ex18_10_File;

import java.io.File;
import java.util.GregorianCalendar;

class FileExample {
	
	public static void main(String[] args) {
		//현재 디렉토리 경로명을 가지고 File 객체를 생성한다.
		File file = new File(".");
		File[] arr = file.listFiles();		//서브 디렉토리와 파일 목록을 가져온다.
		
		for(int cnt = 0; cnt < arr.length; cnt++) {
			String name = arr[cnt].getName();
			
			if(arr[cnt].isFile()) {	//파일이면 true 아니면 false
				//arr[cnt].length():파일의 크기(바이트);
				System.out.printf("%-25s %7d \t", name, arr[cnt].length());
			} else {
				System.out.printf("%-25s   <DIR> \t", name);
			}
			
			
			//1970년 1월 1일 0시 0분 0초 기점으로 경과한 밀리세컨드 값을 리턴
			//사람이 이해할 수 있는 날짜와 시간으로 변경할 필요 있음.
			long time = arr[cnt].lastModified();	//최종 수정일시를 리턴
			//System.out.printf("%d\n", time);
			
			GregorianCalendar calendar = new GregorianCalendar();
			//setTimeInMillis메소드는 객체가 가지고 있는 시각 정보를 파라미터 값으로 갱신하는
			//이때 파라미터 1970년 1월 1일 0시 0분 0초 기점으로 경과한 밀리세컨드 값이어야 한다.
			calendar.setTimeInMillis(time);
			System.out.printf("%1$tF %1$tT \n", calendar);
			
//			System.out.printf("%1$tF %1$tH:%1$tM:%1$tS\n", calendar);
		}
	}

}
