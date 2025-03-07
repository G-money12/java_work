package test01;

public class Student {
	int sno;
	String name;
	String major;
	
	public Student() {
		this(3,"황기태","정보통신");				// this 생성자 앞에는 그 누구도 올수 없다.
		System.out.println("기본 생성자");
	}
//	public Student(int sno, String name) {
//		this.sno=sno;
//		this.name=name;
//	}
//	public Student(int sno, String name, String major) {
//		this.sno=sno;
//		this.name=name;
//		this.major=major;
//	}
	public Student(int sno, String name) {
		
		this.sno = sno;
		this.name = name;
	}
	public Student(int sno, String name, String major) {    // 마우스 오른쪽 source-> generater using cont
		this.sno = sno;
		this.name = name;
		this.major = major;
	}
		public void display() {
		System.out.printf("%d, %s, %s%n", sno, name, major);
	}
	
}
