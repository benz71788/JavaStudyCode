package ex15_6_HashMap_TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Method_Test05_Map {
	
	public static void main(String[] args) {
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요 : ");
		for(int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		
		Map<String, Integer> m = max_min(data);
		System.out.println("최대값 = " + m.get("최대값"));
		System.out.println("최소값 = " + m.get("최소값"));
		System.out.println(m.keySet());
		
		
		sc.close();
	}
	
	static Map<String, Integer> max_min(int[] data){
		Map<String, Integer> hm = new HashMap<String, Integer>();

		int result[] = {data[0], data[0]};
		
		for(int i = 1; i < data.length; i++) {
			if(result[0] < data[i]) {
				result[0] = data[i];
			}
			if(result[1] > data[i]) {
				result[1] = data[i];
			}
		}
		hm.put("최대값", result[0]);
		hm.put("최소값", result[1]);
		
		return hm;
	}

}
