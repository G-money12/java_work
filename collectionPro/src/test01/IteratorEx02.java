package test01;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Student> v=new Vector<>();
		v.add(new Student(1,"홍길동","컴공",75));
		v.add(new Student(2,"이길동","컴공",80));
		v.add(new Student(3,"박길동","정보통신",65));
		v.add(new Student(4,"김길동","정보통신",95));
		v.add(new Student(5,"최길동","멀티미디어",90));
		
//		for(int i=0; i<v.size(); i++) {
//			System.out.println(v.get(i));
//		}
//		
		Iterator<Student> it=v.iterator();
		Student maxS=it.next();
		System.out.println(maxS);
		while(it.hasNext()) {
			Student s=it.next();
			if(maxS.getScore()<s.getScore()) {
				maxS=s;
			}
		}
		System.out.println(maxS);
	}

}
