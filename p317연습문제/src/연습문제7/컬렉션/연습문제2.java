package 연습문제7.컬렉션;

import java.util.Scanner;
import java.util.Vector;

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> a=new Vector<>();
		Scanner sc=new Scanner(System.in);		
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료)>>");
			int key=sc.nextInt();
			if(key==0) break;				// 빠져나오고
			int value=sc.nextInt();
			a.add(key);
			
			
			
		}
		for(int i=0; i<a.size(); i++) {
			int n=a.get(i);
			System.out.println(n);
		}
	}
	

}
