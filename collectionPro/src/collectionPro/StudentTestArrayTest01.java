package collectionPro;				// 이름을 4번 입력받고 전체를 출력하는 문

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>a=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println("이름을 입력하세요>>");
			String name=sc.next();
			a.add(name);
		}
		for(int i=0; i<a.size(); i++) {
			String name=a.get(i);
			System.out.println(name+" ");
		}
	}
}
