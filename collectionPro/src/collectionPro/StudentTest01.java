package collectionPro;					// Student class 와 생성자 

public class StudentTest01 {
	private String name;
	private int age;
	private String gender;
	
	public StudentTest01() {}
	public StudentTest01(String name, int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public String toString() {
		return name+""+""+gender;
	}
	public String getName() {
		return name;
	}
}
