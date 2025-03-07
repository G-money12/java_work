package ex01;

import java.util.Scanner;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unit= {50000, 10000,5000,1000,500,100,50,10,5,1};
		
		System.out.println("금액을 입력해주세요");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int count=0;
		int r=0;
		for(int i=0; i<unit.length; i++) {
			count=n/unit[i];
			System.out.println(unit[i]+"권은"+count+"매입니다");
			n=n%unit[i];
		}
		sc.close();
	}

}
