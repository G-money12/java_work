package ex01;

import java.util.Scanner;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1-99사이의 숫자를 입력하세요");
		int n=sc.nextInt();
		if(n==100) {
			break;
		}
		int count=0;
		if(n>=1 && n<=99) {
			int n10=n/10;   //10자리 수
			int n1=n%10;	// 단자리 수
			
			if(n10%3==0 && n10!=0) {
				count++;
			}
			if(n1%3==0 && n1!=0) {
				count++;
			}
			if(count==1) {
				System.out.println(count);
				System.out.println("박수짝");
				}
			if(count==2) {
				System.out.println(count);
				System.out.println("박수짝짝");
			}else {
				break;
			}
				
			
		}
		
	}
	}
}
