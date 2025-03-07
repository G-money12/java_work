package packagepro;

public class StudentEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Student.count);
		Student s1=new Student();
		System.out.println(s1.getCount());
		System.out.println(Student.count);
		Student s2=new Student(1, "홍", "컴공");
		System.out.println(s2.getCount());
		Student s3=new Student();
		System.out.println(s3.getCount());
		
		s1.setSno(2);
		s1.setName("kim");
		s1.setMajor("정보통신");
		System.out.println(s1.getSno());
		System.out.println(s1.getName());
		System.out.println(s1.getMajor());
		
		System.out.println(s2.getSno());
		System.out.println(s2.getName());
		System.out.println(s2.getMajor());
	}

}
