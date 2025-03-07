package interfacepackage;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PhoneInterface p1=new PhoneInterface();
//		System.out.println(PhonInterFace.timeout);
		SmartPhone smartPhone=new SmartPhone();		
		System.out.println(smartPhone.calculate(3, 5));
		smartPhone.Mp3RingTone();
		smartPhone.play();
		smartPhone.stop();
		smartPhone.sendSMS();
		smartPhone.receiveSMS();
		smartPhone.sendCall();
		smartPhone.receiveCall();
		smartPhone.printLog();		
//		sp.printLog();
//		sp.sendCall();
//		sp.receiveCall();
//		sp.flash();
	}

}
