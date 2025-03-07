package collectionPro;				// Student 클래스 와 생성자

public class Student {
	private int sno;
	private String name;
	private String major;
	private int score;
	
	public Student(int sno, String name, String major, int score) {
		this.sno=sno;
		this.name=name;
		this.major=major;
		this.score=score;
	}
	public String toString() {
		return sno+" "+name+" "+major+" "+score;
	}
	public int getScore() {
		return score;
	}
}
