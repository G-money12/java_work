package ch03;

public class OpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		double num2=3.0;
		int result=++num1; // num1=num1+1
		int result1=--num1; // num1=num1-1
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2); // 몫
		System.out.println(num1%num2); // 나머지
		
		System.out.println(num1);
		System.out.println(result);
		System.out.println(result1);
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		
		
		num1+=5;                 // num1과 5를 더해서 num1에 넣어준다.
		System.out.println(num1);
		num1-=5;				 // num1과 5를 빼고 num1에 넣어준다.
		System.out.println(num1);
		num1*=5;				 // num1과 5를 곱해서 num1에 넣어준다.
		System.out.println(num1);
		num1/=5;				 // num1과 5를 나누어서 num1에 넣어준다.
		System.out.println(num1);
		num1%=7;				 // num1과 7를 나눈 나머지를 num1에 넣어준다.
		System.out.println(num1);
		
	}

}
