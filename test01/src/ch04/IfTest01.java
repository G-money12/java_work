package ch04;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		// 1. TODO Auto-generated method stub
		// 점수 2개를 입력 받아서 
		// 두점수 모두 80점 이상이면 합격
		// 그렇지 않으면 '불합격'을 출력되도록
		// IF-ELSE, 논리 연산(&&,||)를 사용하여 구하라.
		
		// 2. 평균이 70점 이상이고 각 과목의 점수가 60점 이상이면 합격,
		// 그렇지 않으면 불합격이 되도록 구현하라.
		
		// 3. 
		// 
		
		// 1.
//		Scanner sc=new Scanner(System.in);
//		System.out.println("점수 2개를 입력하세요.");
//		int score1=sc.nextInt();
//		int score2=sc.nextInt();
		
		
		
		// 4. 숫자 3개를 입력하여 가장 큰수를 구하라. 
		// a, b, c
//		System.out.println("숫자 3개를 입력하세요.");
//		int a=sc.nextInt();		
//		int b=sc.nextInt();		
//		int c=sc.nextInt();		
//		if(a>b) {
//			if(a>c) {
//				System.out.println("a");
//			}else {
//				System.out.println("c");
//			}
//		}else {
//			if(b>c) {
//				System.out.println("b");
//			}else {
//				System.out.println("c");
//			}
//		}
//		
		
		// 5. 음료수의 종류와 잔수를 입력받아 가격을 알려주는
		// 프로그램을 작성하라.
		// 1.에스프레소 :2000 
		// 2.아메리카노 :2500 
		// 3.카프치노 :3000
		// 4.카페라떼:3500
//		Scanner sc=new Scanner(System.in);
//		System.out.println("음료수의 번호와 잔수를 입력하시오.");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=0;
//		
//		if(a==1) {
//			c=2000*b;
//			System.out.println("에스프레소");
//			System.out.println(b+"잔이고");
//			System.out.println("가격은"+c+"원 입니다");
//		}else if(a==2) {
//			c=2500*b;
//			System.out.println("가격은"+c+"원 입니다");
//		}else if(a==3) {
//			c=3000*b;
//			System.out.println("가격은"+c+"원 입니다");
//		}else if(a==4) {
//			c=3500*b;
//			System.out.println("가격은"+c+"원 입니다");
//		}else {
//			System.out.println("번호를 잘못입력했습니다.");
//		}
//		System.out.println("금액은"+c+"입니다.");
//	}
//}
		
		
		// 6.월을 입력하면 계절을 출력해주세요.
		// 봄:   3월~5월
		// 여름:  6월~8월
		// 가을:  9월~11월
		// 겨울:  12월~2월
		Scanner sc=new Scanner(System.in);
		System.out.println("월을 입력 해주세요.");
		int a=sc.nextInt();
		
		if(a>=3 && a<=5) {
			System.out.println("봄");
		}else if(a>=6 && a<=8) {
			System.out.println("여름");
		}else if(a>=9 && a<=11) {
			System.out.println("가을");
		}else if(a==12 || a<=2) {
			System.out.println("겨울");
		}else {
			System.out.println("잘못 입력하셨어요.");
		}
			
		
	
	}
	

	
}
		
		
		
		
		
		
		
		
		// 2. 
//		if(score1>=80 && score2>=80){
//			System.out.println("합격");
//		}else	{
//			System.out.println("불합격");
//			
//		}
//		
		// if(score1<80 || score2<80){
		//	System.out.println("불합격");
	    // }else {
		//		System.out.println("불합격");
	    
		// 3.
		// if 중첩
//		int avg=(score1+score2)/2;
//		System.out.println("평균:"+avg);
//		if(avg>=70 && score1>=60 && score2>=60) {
//			System.out.println("합격");
//			if(avg>=90)
//				System.out.println("1등급");
//			else if(avg>=80)
//				System.out.println("2등급");
//			else if(avg>=70)
//				System.out.println("3등급");
//		}else {
//			System.out.println("불합격");
//		}
		
		
		
		
		
		