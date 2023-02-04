package Selenium;

public class Mobile {

	public void sendSms() {
		System.out.println("from Oppo");
		
	}
	
public void makeCall() {
	System.out.println("Calling my friend");
		
	}
	
	public static void main(String[] args) {
		
	Mobile device = new Mobile(); 
		device.sendSms();
		device.makeCall();
		
	}

}
