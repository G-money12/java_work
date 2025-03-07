package 연습문제7.컬렉션;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class 연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("나라이름과 인구를 입력하세요.(예 : Korea 5000)");
		for(int i=0; i<5; i++) {
			System.out.print("나라 이름, 인구>>");
			String key=sc.next();
			int value=sc.nextInt();
			nations.put(key, value);
		}
		Set<String> keys=nations.keySet();
		Iterator<String> it=keys.iterator();
		String maxKey=null;
		int maxValue=0;
		
		while(it.hasNext()) {					// 
			String key=it.next();
			int value=nations.get(key);
			if(value>maxValue) {
				maxValue=value;
				maxKey=key;
			}				
		}
		while(true) {							// 무한 다시 검색
		System.out.print("인구 검색");	
		String eng=sc.next();					// 입력받는것
		if(eng.equals("그만"))break;				// 빠져나오는 구간
		Integer value=nations.get(eng);			// 저장되어있는 value에 
		if(value==null) {
			System.out.println(eng+"나라는 없습니다.");
		}else {
			System.out.println(eng+" 인구는 "+value);
		}
		
		}
	}
}
