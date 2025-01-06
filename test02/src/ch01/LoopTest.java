package ch01;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("대소문자 변환, 소문자 입력, 종료조건 : quit 입력");
			String s=sc.next();
			if(s.equals("quut"))
				break; 					// break를 감싸고 있는 가장 가까운 반복문을 빠져나온다.
			char ch=s.charAt(0);
			System.out.println((char)(ch-32));
			
		}
		
//		do {
//			System.out.println("do_while");
//			
//		}while(true);
//		for(;;) {
//			System.out.println("for");
//		}
	}

}
