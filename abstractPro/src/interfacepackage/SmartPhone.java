package interfacepackage;

public class SmartPhone extends PDA implements MusicePhoneInterface{

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("sendSMS");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("receiveSMS");
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("sendCall");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("receiveCall");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop");
	}

	@Override
	public void Mp3RingTone() {
		// TODO Auto-generated method stub
		System.out.println("Mp3RingTone");
	}

	

}
