package p317연습문제;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> a=new HashMap<>();
		a.put("에스프레소",2000);
		a.put("아메리카노", 2500);
		a.put("카푸치노", 3000);
		a.put("카페라떼", 3500);
		Scanner sc=new Scanner(System.in);
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
		String menu=sc.next();
	}
	
}
