package test02;

import java.util.Scanner;

class Book{
	String title, author;
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	public void display() {
		System.out.println(title+","+author);
	}
}

public class BookArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books=new Book[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<books.length; i++) {
			System.out.println("제목>>");
			String title=sc.nextLine();
			System.out.println("저자>>");
			String author=sc.nextLine();                    // nextLine : Enter를 칠때까지 기입이 가능
			books[i]=new Book(title, author);
		}
		for(Book book:books) {
			book.display();
			
		}
		sc.close();
	} 

}
