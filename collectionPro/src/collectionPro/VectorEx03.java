package collectionPro;

import java.util.Vector;

public class VectorEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<>();
		v.add("사과");
		v.add("배");
		v.add("포도");
		v.add(2,"바나나");
		System.out.println(v);
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

}
