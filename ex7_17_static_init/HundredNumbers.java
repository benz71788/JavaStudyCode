package ex7_17_static_init;

public class HundredNumbers {
	
	static int arr[];
	
	HundredNumbers(){
		System.out.println("����� �������Դϴ�.");
	}
	
	// Ŭ���� �ʱ�ȭ(���� �ʱ�ȭ) ���
	static {
		System.out.println("Ŭ���� �ʱ�ȭ ��");
		arr = new int[100];
		for(int cnt = 0; cnt < 100; cnt++) {
			arr[cnt] = cnt;
			System.out.print(arr[cnt] + "\t");
		}
		System.out.println();
	}

}
