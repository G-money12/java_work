package test01;

import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);		
		a.add(1,10);
		
		for(int i=0; i<a.size(); i++) {
			
		}
		
		System.out.println(a.size());
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		a.remove(0);
		
		
		System.out.println("-------------------------------");
		
		
		
		
		
		
		
		
		
		Vector<String> v=new Vector<>();
		v.add("홍길동");
		v.add("김소정");
		v.add(1,"지정우");
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		v.remove(0);
		v.remove("김소정");
		
	}

}
