package ex01;

import java.util.Scanner;

public class Ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] eng= {"student", "love", "java", "happy", "future"};
		String[] kor= {"학생", "사랑", "자바", "행복한", "미래"};
		Scanner sc=new Scanner(System.in);
		while(true) {
		boolean flag=false;
		System.out.println("영어 단어를 입력하세요");
		String s=sc.next();
		if(s.equals("quit")) break;
		for(int i=0; i<eng.length; i++) {
			if(eng[i].equals(s)){
				System.out.println(kor[i]);
				flag=true;
			}
			}
		if(!flag) {         // if(flag==false)
			System.out.println("해당 단어가 없음");
		}
		}
		sc.close();
	}

}
