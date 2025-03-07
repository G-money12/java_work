package p317연습문제;

import java.util.Scanner;
import java.util.Vector;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Child> v=new Vector<>();
		Scanner sc=new Scanner(System.in);
		int year=2000;
		
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
		for(int i=0; i<10; i++) {
			v.add(new Child(year++, sc.nextInt()));
			
		}
		
		int index=0;
		int step=0;
		for(int i=1; i<v.size(); i++) {
			int n=v.get(i).getHeight()-v.get(i-1).getHeight();
			if(step<n) {
				step=n;
				index=i;
			}
		}
		Child child=v.get(index);
		System.out.println("가장 키차이가 많이 나는 년도는 "+child.getYear()+" "+step+"cm");
		
		for(int i=0; i<v.size(); i++) {
			Child c=v.get(i);
			System.out.println(c.getYear()+","+c.getHeight());
		}
	}

}
