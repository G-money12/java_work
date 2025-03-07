package oppWithJava;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Phone> a=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("인원수>>");
		int no=sc.nextInt();
		
		for(int i=0; i<no; i++) {
			System.out.println("이름과 전화번호(번호는 연속적으로 입력),주소>>");
			String name=sc.next();
			int tel=sc.nextInt();
			String address=sc.next();
			a.add(new Phone(name,tel,address));
			
		}
		
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.println("검색할 이름>>");
			String name=sc.next();
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			
			boolean found = false;
			for(Phone phone:a) {
				if(phone.getName().equals(name)) {
					System.out.printf("%s의 번호와 주소는 %d, %s입니다.\n",name,phone.getTel(),phone.getAddress());
					found=true;
					break;
				}
			}
			if(!found) {
				System.out.println(name+"은 없습니다.");
			}
			
			
			
//			String number=a.get(name);
//			if(number==null)
//				System.out.println(name+"은 없습니다.");
//			else				
//				System.out.printf("%s의 번호와 주소는 %d, %s입니다",name,tel,address);
		}
	}

}
