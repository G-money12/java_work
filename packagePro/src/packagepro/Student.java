package packagepro;

public class Student {
	private int sno;
	private String name;
	private String major;
	static int count;
	
	public Student() {
		count++;
		System.out.println("default 생성자");
	}
	public Student(int sno, String name, String major) {
		this.sno=sno;
		this.name=name;
		this.major=major;
		count++;
	}
	public static int getCount() {
		
		return count;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
