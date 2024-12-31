package ch02;

import java.util.Scanner;

public class 영어_소문자를_대문자로2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		char ch=input.charAt(0);
		char ch2=(char)(ch-32);
		System.out.print(ch2);
		
		
		
		
		char[] arr;
		arr=input.toCharArray();
		
		for(int i=0; i<arr.length; ++i) {
			if(97<=arr[i] && arr[i]<=122) {
				arr[i]=(char)(arr[i]-32);
			}
		}
			System.out.print(arr);
			
		
	}

}
