package ex01;

import java.util.Scanner;

public class Ex04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("영문 소문자 알파벳을 입력하세요");
		String s=sc.next();
		char ch=s.charAt(0);
		for(char c1='a'; c1<=ch; c1++) {
			System.out.println(c1);
			for(char c2='a'; c2<=(ch-c1)+97;c2++) {
				System.out.print(c2);
			}
			System.out.println();
		}
	}

}
