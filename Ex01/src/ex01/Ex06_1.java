package ex01;

import java.util.Scanner;

public class Ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char[] days= {'일', '월', '화', '수', '목', '금', '토', '일'};
		
		System.out.println("정수를 입력하세요");
		int num=sc.nextInt();
		int index=num%7;
		System.out.println(days[index]);
		sc.close();
	}
	

}
