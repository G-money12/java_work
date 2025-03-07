package collectionPro;			// 그냥 출력하는 문

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<>();
		a.add("hello");
		a.add("Hi");
		a.add("Java");
		a.add(1,"사과");
		a.remove("Hi");		
		System.out.println(a.contains("사과"));
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		Object[] arr=a.toArray();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
//		a.clear();
//		System.out.println(a.isEmpty());
//		System.out.println("clear 이후");
//		for(int i=0; i<a.size(); i++) {			
//		System.out.println(a.get(i));
//		}
	}

}
