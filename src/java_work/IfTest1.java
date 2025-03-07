package java_work;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 넣으세요");
		int n=sc.nextInt();
		if(n<=10) {
			System.out.println("G");
		}else if(n<=20) {
			System.out.println("S");
		}else if(n<=30) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
		
	}

}
