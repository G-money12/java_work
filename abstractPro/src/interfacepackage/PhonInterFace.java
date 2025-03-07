package interfacepackage;

public interface PhonInterFace {
	public static final int timeout=10000;
	
	public abstract void sendCall();
	public void receiveCall();
	
	public default void printLog(){
		System.out.println("***Phone***");
	}
}
