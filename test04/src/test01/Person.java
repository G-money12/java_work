package test01;

public class Person {
	String name;
	int age;
	String gender;
	
	public Person() {}
	public Person(String name) {
		this.name=name;					// this > ? 객체 자기자신을 가르키는 레퍼런스 this.멤버 
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;		
	}
	public Person(String name, int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void setName(String name) {	// setName 나중에 이름을 바꾸겠다.
		this.name=name;
	}
	public void display() {
		System.out.println("name:"+name);
		System.out.println("age"+age);
		System.out.println("gender"+gender);
	}
	
	public boolean nameEqual(Person p) {
		if(this.name.equals(p.name)){
			return true;
		}else {
			return false;
		}
	}
}
