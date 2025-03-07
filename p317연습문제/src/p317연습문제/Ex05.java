package p317연습문제;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> nations =new HashMap<>();
		
		System.out.println("나라이름과 인구를 5개 입력하세요(예:Korea 5000");
		
		
		for(int i=0; i<5; i++) {
			System.out.print("나라이름, 인구>>");       // ln안쓰면 뒤에 커서가 깜박이겠죠
			String key=sc.next();
			int value=sc.nextInt();	
			nations.put(key, value);
			
		}
		Set<String> keys=nations.keySet();          // 집합으로 만들어요
		Iterator<String> it=keys.iterator();
		String maxKey=null;
		int maxValue=0;
		
		while(it.hasNext()) {
			String key=it.next();
			int value=nations.get(key);
			if(value>maxValue) {
				maxValue=value;
				maxKey=key;
			//System.out.println(key+":"+value);
			
		}
		
		}
		System.out.println("제일 인구가 많은 나라는 ("+maxKey+","+maxValue+")");
//		int index=0;
//		for(int i=0; i<nations.size(); i++) {
//			if(nations.get(index)<nations.get(i)) {
//				index=i;
//			}
//		System.out.println(nations.get(index));
	}

}
