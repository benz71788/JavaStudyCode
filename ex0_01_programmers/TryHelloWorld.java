package ex0_01_programmers;

import java.util.Arrays;

class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
      	if(a < b) {
      		for(int i = 1; i <= b; i++) {
          		if(a % i == 0 && b % i == 0) {
          			answer[0] = i;
          			answer[1] = a * b / i;
          		}
          	}
      	} else {
      		for(int i = 1; i <= a; i++) {
          		if(a % i == 0 && b % i == 0) {
          			answer[0] = i;
          			answer[1] = a * b / i;
          		}
          	}
      	}


        return answer;
    }

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(80, 57)));
    }
}
