package ch04;

import java.util.Scanner;

public class TestIf001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();
		if(score>70) {
			System.out.println(score);
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}

}
