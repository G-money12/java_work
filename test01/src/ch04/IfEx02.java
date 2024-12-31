package ch04;

public class IfEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=91;
		
		if(score>=90)
			System.out.println("A학점");
		else if(score>=80)
			System.out.println("B학점");
		else if(score>=70)
			System.out.println("C학점");
		else
			System.out.println("F학점");
	
		
		int age=9;
		int charge;
		if(age<8) {
			charge=1000;
			System.out.println("취학 전 아동입니다.");
		}
		else if(age<14) {
			charge=2000;
			System.out.println("초등학생입니다.");
		}
		else if(age<20) {
			charge=2500;
			System.out.println("중, 고등학생입니다.");
		}
		else {
			charge=3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는"+charge+"원입니다.");
		
		
		
	}

}

// if 
// if   else
// if   else if   else
// if   else if   else if   else