package ex7_10_in_method_call;

class Numbers2 {
	
	int[] num;
	
	Numbers2(int[] num){
		this.num = num;
	}
	
	int getTotal() {
		
		int sum = 0;
		
		for(int i = 0; i < this.num.length; i++) {
			sum = sum + num[i];
		}
		
		return sum;
	}
	
	int getAverage() {
		
		int avg = 0;
		int total = getTotal();
		
		avg = total / this.num.length;
		
		return avg;
	}
	

}
