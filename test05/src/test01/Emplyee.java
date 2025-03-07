package test01;

public class Emplyee extends Person{
	private int eno;
	private String dept;
	private String position;
	private int sal;
	
	public Emplyee() {}
	public Emplyee(int eno, String name, int age, String gender, 
				    String dept, String position, int sal) {
		super(name, age, gender);
		this.eno=eno;
		this.dept=dept;
		this.position=position;
		this.sal=sal;
	}
	public void show() {
		System.out.print(eno+"");
		super.show();
		System.out.print(dept);
		System.out.print(position);
		System.out.println(sal);
	}
}
