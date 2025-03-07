package training01;

import java.util.Scanner;

public class TrainingBookTest {
	static Scanner sc=new Scanner(System.in);
	static TrainingBook add() {
		System.out.println("제목");
		String title=sc.next();
		System.out.println("작가");
		String author=sc.next();
		System.out.println("pub");
		String pub=sc.next();
		System.out.println("페이지");
		int page=sc.nextInt();
		TrainingBook e=new TrainingBook(title, author, pub, page);
		return e;
	}
	static void list(TrainingBook[] emps, int k) {
		for(int i=0; i<k; i++) {
			emps[i].display();
		}
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		TrainingBook[] books=new TrainingBook[10];
		
		boolean flag=false;
		int k=0;
		while(true) {
			System.out.println("1.추가,2.목록보기,3.종료");
			 int num=sc.nextInt();
			 switch(num) {
			 case 1:books[k++]=add();break;
			 case 2:list(books,k);break;
			 case 3:flag=true;break;
			 default:
				 System.out.println("입력오류");
			 }
			 if(flag || k==10)
				 break;
		
		}
		System.out.println("end!!");
		
	}

}
