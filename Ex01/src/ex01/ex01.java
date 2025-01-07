package ex01;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("지불할 금액을 입력하세요");
		int price=sc.nextInt();
		int w50000=0;
		int sum50000=0;
		
		
		
		if(price>=100000) {
			if(price>=50000) {
				for(int i=0; 50000<=price%50000; sum50000++) {
				price=price/50000;
			
			}
			
		}
			
			
			
			
			
			
			
			
		
		}else {
			System.out.println("잘못 입력하셨어요. 10만원 이상 입력해세요.");
		}
		
		
	}

}
