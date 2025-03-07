package p317연습문제;

import java.util.Scanner;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Double> a=new Vector<>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("입력하세요");
			Double number=sc.nextDouble();
			a.add(number);
		}
		int index=0;
		
		for(int i=0; i<a.size(); i++) {
			if (a.get(index)<a.get(i)){
				index=i;
			}
		}
		System.out.println(a.get(index));
		
	}

}
