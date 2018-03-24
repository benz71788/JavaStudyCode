package ex11_3_StringTokenizer;

class StringTokenizerExample6 {
	
	public static void main(String[] args) {
		String post = "123-456";
		
		String[] st = post.split("-");
		//배열의 갯수가 가변적일때 length 속성을 이용한다.
		for(int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	}

}
