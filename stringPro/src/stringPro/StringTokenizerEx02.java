package stringPro;

import java.util.StringTokenizer;

import java.util.Scanner;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s=" 3 * 5 ";
//		StringTokenizer st=new StringTokenizer(s,"+-*/%",true);
//		int num1=Integer.parseInt(st.nextToken().trim());      
//		String op=st.nextToken();
//		int num2=Integer.parseInt(st.nextToken().trim());
//		System.out.println(num1);
//		System.out.println(op);
//		System.out.println(num2);
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print("입력>>");
		String s=sc.nextLine();
		if(s.equals("quit"))break;
		
		StringTokenizer stt=new StringTokenizer(s,"+-*/%",true);
		int num01=Integer.parseInt(stt.nextToken().trim());
		String op01=stt.nextToken();
		int num02=Integer.parseInt(stt.nextToken().trim());
		
		switch(op01) {
			case "+":System.out.println(num01+num02);break;
			case "-":System.out.println(num01+num02);break;
			case "*":System.out.println(num01+num02);break;
			case "/":System.out.println(num01+num02);break;
			case "%":System.out.println(num01+num02);break;
			default:
				System.out.println("연사자를 입력 오류");
		}
		
	
		}
		
	}

}
