package ex01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("소문자 알파벳 하나를 입력하시오");
		char input = sc.next().charAt(0);
		
		if(input<'a' || input > 'z') {
			System.out.println("잘못된 입력입니다. 소문자 알파벳만 이력해주세요");
			return;
		}
		for(char c =input; c >= 'a'; c--) {
			for(char i='a'; i<=c; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
