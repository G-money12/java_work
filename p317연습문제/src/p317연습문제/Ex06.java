package p317연습문제;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> map=new HashMap<>();
		
		System.out.println("** 포인트 관리 프로그램입니다 **");
		
		while(true) {
			System.out.print("이름과 포인트 입력>>");
			String key=sc.next();
			if(key.equals("exit")) break;		// 그만 나오는 부위			
			int value=sc.nextInt();
			map.put(key, value);
			
			Set<String> keys=map.keySet();
			Iterator<String> it=keys.iterator();
			while(it.hasNext()) {
				String k=it.next();
				int v=map.get(k);
				System.out.print("("+key+","+value+")");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료합니다.");
	}

}
