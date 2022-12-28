package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		
		System.out.println("This is my Mobile");
		Mobile mobileobject = new Mobile();
		mobileobject.sendMsg();
		mobileobject.makeCall();
	}
	
	public void sendMsg() {
		System.out.println("This is sendMsg() method");
		String mobileModel = "MOTO G";
		float mobileWeight = 500.45f;
	}
	
	public void makeCall() {
		System.out.println("This is makeCall() method");
		boolean isFullyCharged = true;
		int mobileCost = 20000;
	}
}
