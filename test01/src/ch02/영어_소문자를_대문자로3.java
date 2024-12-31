package ch02;

import java.util.Scanner;

public class 영어_소문자를_대문자로3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("영문 소문자를 입력하세요");
		String s=sc.next();
		char ch=s.charAt(0);
		
		System.out.println((char)(ch-32));
		
		
	}

}

