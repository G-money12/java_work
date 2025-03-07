package oppWithJava;

public class Phone {
	private String name;
	private int tel;
	private String address;
	
	public Phone(String name, int tel, String address) {
		this.name=name;
		this.tel=tel;
		this.address=address;
	}
	public String toString() {
		return name+" "+tel+" "+address+" ";
	}
	public String getName() {
		return name;
	}
	public int getTel() {
		return tel;
	}
	public String getAddress() {
		return address;
	}
}
