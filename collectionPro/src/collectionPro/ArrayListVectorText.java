package collectionPro;						// 이름, 나이, 성별은 5번 입력 후 전부 출력 후
											// 검색 할 이름 입력하면 찾아주는 문
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListVectorText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> c=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("이름,나이,성별>>");
			String name=sc.next();
			int age=sc.nextInt();
			String gender=sc.next();
			c.add(new Person(name,age,gender));
		}
		for(int i=0; i<c.size();i++) {
			Person p=c.get(i);
			System.out.println(p);
		}
		System.out.println("검색할 이름을 입력하세요>>");
		String name=sc.next();
		boolean flag=false;
		for(int i=0; i<c.size(); i++) {
			Person p=c.get(i);
			if(name.equals(p.getName())) {
				System.out.println(p);
				break;
			}
		}
		if(!flag) {
			System.out.println("검색한 이름이 없음");
		}
	}

}
