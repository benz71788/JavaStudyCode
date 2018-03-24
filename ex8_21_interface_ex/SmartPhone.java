package ex8_21_interface_ex;

class SmartPhone implements SmartFunction{

	String type;
	String call;
	String data;
	String remote;
	SmartPhone(){
		
	}
	
	SmartPhone(String type, String call, String data, String remote){
		this.type = type;
		this.call = call;
		this.data = data;
		this.remote = remote;
	}
	
	public void phoneType(String type) {
		this.type = type;
	}
	
	@Override
	public void callingFun(String call) {
		// TODO Auto-generated method stub
		this.call = call;
	}

	@Override
	public void dataFun(String data) {
		// TODO Auto-generated method stub
		this.data = data;
	}

	@Override
	public void remoteFun(String remote) {
		// TODO Auto-generated method stub
		this.remote = remote;
	}

}
