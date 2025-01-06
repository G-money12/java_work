package ch04_1;

import java.util.Scanner;

public class SwitchTest04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자1, 연산자, 숫자2를 입력하여 연산자에 따른 연산을 수행하세요");
		int num1=sc.nextInt();
		String op=sc.next();
		int num2=sc.nextInt();
		int result=0;
		
		// == : 변수 메모리에 정장된 값이 같은지 비교 
		if(op.equals("+")) {
			result=num1+num2;
		}else if(op.equals("-")) {
			result=num1-num2;
		}else if(op.equals("*")) {
			result=num1*num2;
		}else if(op.equals("/")){
			result=num1/num2;
		}else {
			System.out.println("입력오류");
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		switch(op) {
		case "+":result=num1+num2;break;
		case "-":result=num1-num2;break;
		case "*":result=num1*num2;break;
		case "/":result=num1/num2;break;
		case "%":result=num1%num2;break;
		default:
			System.out.println("입력 오류");
		}
		System.out.println(result);
	}

}

// String은 첫글자 영어 대문자로 표기하고, 문자열을 사용할때 쓴다.
// 