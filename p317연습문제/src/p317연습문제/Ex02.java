package p317연습문제;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> a=new ArrayList<>();		
		System.out.println("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>>");
		String str=sc.next();
		for(int i=0; i<str.length(); i++) {
			a.add(str.charAt(i));
		}		
//		for(int i=0; i<5; i++) {
//			System.out.println("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F)>>");
//			String search=sc.next();
//			a.add(search.charAt(i));
//		}
		for(int i=0; i<a.size(); i++) {
			char ch=a.get(i);
			switch(ch) {
			case'A':System.out.println(4.0+" ");break;
			case'B':System.out.println(3.0+" ");break;
			case'C':System.out.println(2.0+" ");break;
			case'D':System.out.println(1.0+" ");break;
			case'F':System.out.println(0.0+" ");break;
			}
		}
		
	}
	

}
