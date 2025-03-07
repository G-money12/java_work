package collectionPro;				// class 를 만들어 놓은거 활용문
									// sno, name, major, score 5번 입력 전체 출력문
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			System.out.println("sno,name,major,score>>");
			int sno=sc.nextInt();
			String name=sc.next();
			String major=sc.next();
			int score=sc.nextInt();
			a.add(new Student(sno,name,major,score));
		}
		for(int i=0; i<a.size();i++) {
			Student s=a.get(i);
			System.out.println(s);
		}
		int maxIndex=0;
		Student maxS=a.get(maxIndex);
		for(int i=0; i<a.size(); i++) {
			Student s=a.get(i);
			if(maxS.getScore()<s.getScore()){
				maxIndex=i;
				maxS=s;
			}
		}
		System.out.println(maxS);
		System.out.println(a.get(maxIndex));
	}

}
