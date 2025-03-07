package test03;

import java.util.Scanner;

public class DivdeByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int dividend; // 나뉨수
		int divisor;  // 제수
		
		System.out.println("나뉨수를 입력하세요");
		dividend=sc.nextInt();
		System.out.println("제수를 입력하세요");
		divisor=sc.nextInt();
		try {
		System.out.printf("%d를 %d로 나누면 몫은 %d입니다. %n", dividend, divisor, dividend/divisor);
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
			System.out.println("0으로 나누는 예외 발생");			
		}
//		catch(InputMismatchException ex) {
//			ex.printStackTrace();
//			System.out.println(ex.getMessage());
//			System.out.println("정수가 아닌 문자를 입력했습니다.");
//		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("finall 영역");
		}
		sc.close();
		System.out.println("end");
	}

}










