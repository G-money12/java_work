package collectionPro;			// 이름을 4번 입력하고 그 이후 전부 출력

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>a=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요>>");
			String name=sc.next();
			a.add(name);
		}
		for(int i=0; i<a.size(); i++) {
			String name=a.get(i);
			System.out.print(name+" ");
		}
//		int index=0;
//		for(int i=1; i<a.size(); i++) {
//			if(a.get(longIndex)).length()<a.get(i).length()
//				longIndex=i;		
//						
//		}
//		System.out.println(a.get(longIndex));
	}

}
