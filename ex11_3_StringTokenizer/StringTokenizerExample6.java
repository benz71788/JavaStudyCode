package ex11_3_StringTokenizer;

class StringTokenizerExample6 {
	
	public static void main(String[] args) {
		String post = "123-456";
		
		String[] st = post.split("-");
		//�迭�� ������ �������϶� length �Ӽ��� �̿��Ѵ�.
		for(int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	}

}
