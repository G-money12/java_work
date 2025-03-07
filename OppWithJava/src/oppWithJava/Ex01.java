package oppWithJava;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시요>>");
		String i=sc.next();
		char ch=i.charAt(0);
		for(char c1='a'; c1<=ch; c1++) {
			for(char c2='a'; c2<=c1;c2++)

				
			{
				
				System.out.print(c2);
			}
			System.out.println();
		}
		System.out.println();
	}

}
