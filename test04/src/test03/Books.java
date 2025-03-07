package test03;

public class Books {
	String title;
	String author;
	String pub;
	int page;
	
	public Books() {}
	public Books(String title, String author, String pub, int page) {
		this.title=title;
		this.author=author;
		this.pub=pub;
		this.page=page;
	}
	public void display() {
		System.out.printf("%s,%s, %s, %d", title, author, pub, page);
	}
}
