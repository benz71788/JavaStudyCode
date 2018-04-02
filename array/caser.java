package array;

public class caser {
	public static void main(String[] args) {
		int num = 0;
		String result = "";
	    String[] arr = null;
	    String s = "OAOAFMHpuKyFZyNCPBoJvFTBashlscOSE nQOcwUxgzYtZY tP";
	    int n = 39;
	    arr = s.split("");
	    
	    char[] ch_arr = new char[arr.length];
	    
	    for(int i = 0; i < arr.length; i++){
	    		if(arr[i].charAt(0) >= 'A' && arr[i].charAt(0) <= 'Z') {
	    			num = arr[i].charAt(0) + n;
	    			while(num > 90) {
	    				num = num - 26;
	    			}
	    			result = result + (char)num;
	    		} else if(arr[i].charAt(0) >= 'a' && arr[i].charAt(0) <= 'z') {
	    			num = arr[i].charAt(0) + n;
	    			while(num > 122) {
	    				num = num - 26;
	    			}
	    			result = result + (char)num;
	    		} else if(arr[i].charAt(0) == ' ') {
	    			result = result + " ";
	    		}
	    		
	    }
	    System.out.println(result);
	}
}
