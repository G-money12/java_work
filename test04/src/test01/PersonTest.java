package test01;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.name="홍길동";
		p1.age=20;
		p1.gender="남자";
		p1.display();
		
		Person p2=new Person("홍길미",30,"여자");
		p2.setName("G");                       // setName 나중에 이름을 바꿀때 표시.
		p2.display();
		
		System.out.println(p1.nameEqual(p2));
		System.out.println(p2.nameEqual(p1));
	}

}
