package collectionPro;					// Vector 만들고 출력

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,10);
		
		System.out.println(v.lastElement());
		for(int i=0; i<30; i++) {
			v.add((int)(Math.random()*100+1));
		}
	 // v.remove(10);
		int n=v.size();
		int c=v.capacity();
		System.out.printf("n=%d,c=%d%n",n,c);
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

}
