package training01;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>a=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int[] b= {1,2,3,4,5};
		
		for(int i=0; i<5; i++) {
			System.out.println("입력하세요>>");
			String name=sc.next();
			a.add(name);
		}
		for(int i=0; i<a.size(); i++) {
			String name=a.get(i);
			System.out.println(name+" ");
		}
		for(int i=0; i<b.length; i++) {
			System.out.println("입력해요");
			
		}
	}

}
