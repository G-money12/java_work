package ch01;

import java.util.Scanner;

public class DowhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("소문자를 입력하여 대문자로 변환합니다.");
				
		do {			
			System.out.println("변환할 소문자를 입력하세요, quit를 입력하면 종료합니다.");
			s=sc.next();
			char ch=s.charAt(0);
			System.out.println((char)(ch-32));
		}while(!s.equals("quit"));
			System.out.println("end");
			
// while문, do-while문 끝나는 조건을 입력할때까지 쓰는 문
		
	}

}
