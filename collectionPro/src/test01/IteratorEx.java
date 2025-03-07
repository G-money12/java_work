package test01;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();   // ctrl + shift + o
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		Iterator<Integer> it=a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
