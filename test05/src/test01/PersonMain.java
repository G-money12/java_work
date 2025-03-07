package test01;



public class PersonMain {
	static void display(Person p, String str) {
		if(str.equals("p"))
		p.show();
		else if(str.equals("s")) {
			Student s=(Student)p;
			p.show();
			System.out.println();
		}
		else if(str.equals("e")) {
			Emplyee e=(Emplyee)p;
			e.show();
		}
	}
	public static void main(String[] args) {
		Person p1=new Person("홍",20,"남자");
		display(p1,"p");
		Student s1=new Student(1,"홍길동",25,"남자","컴공");
		display(s1,"s");
		Emplyee e1=new Emplyee(2," G",43,"남자","정보통신","부서 ",40);
		display(e1,"e");
		
		Person[] persons=new Person[3];
		persons[0]=new Person("홍",20,"남자");
		persons[1]=new Student(1,"홍길동",25,"남자","컴공");
		persons[2]=new Emplyee(2," G",43,"남자","정보통신","부서 ",40);
		
		for(Person p:persons) {
			p.show();
		}
		// TODO Auto-generated method stub		
//		Person p1=new Person("홍",20,"남자");
//		Student s1=(Student)p1;//		
//		Person p=new Student(1, "홍길동",20,"남자","컴공");
//		p.showPerson();
//		Student s=(Student)p;
//		s.showStudent();		
		Emplyee e=new Emplyee(1, " 홍길동", 35, "남자", "영업부", "과정 ", 400);
		e.show();
	}

}
