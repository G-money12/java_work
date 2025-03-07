package collectionPro;				// class 와 생성자 기입

public class Person {
	private String name;
	int age;
	private String gender;
	
	public Person() {}
	public Person(String name, int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+age+" "+gender;
		
	}

	public String getName() {
		return name;
	}
	
}	
	

