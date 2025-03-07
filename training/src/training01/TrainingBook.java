package training01;

public class TrainingBook {
	String title;
	String author;
	String pub;
	int page;
	
	public TrainingBook() {}
	public TrainingBook(String title, String author, String pub, int page) {
		this.title=title;
		this.author=author;
		this.pub=pub;
		this.page=page;
	}
	public void display() {
		System.out.printf("%s, %s, %s, %d%n", title, author, pub, page);
	}
}
