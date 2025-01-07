package ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("3,6,9게임 시작합니다, 숫자를 입력해 주세요");
		int tree=sc.nextInt();
		int res=0;
		int num;
		int number=0;
		if(tree>=1 && tree<100) {
			res=tree%10;
			if(res==3||res==6||res==9) number++;
			res=tree/10;
			if(res==3||res==6||res==9)number++;
			if(number==1) 
			System.out.println("박수짝");
			else if(number==2)
				System.out.println("박수짝짝");
			else 
				System.out.println("없음");
			
			
			}
		else 
			System.out.println("입력을 잘못하셨어요. 1~99까지 넣어주세요.");
		
		
	}

}
