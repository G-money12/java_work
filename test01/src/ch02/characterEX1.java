package ch02;

public class characterEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch1='A';
		System.out.println(ch1);       // 문자 출력
		System.out.println((int)ch1);  // 문자에 해당하는 정수 값(아스키 코드 값) 출력
		
		char ch2=66;                   // 정수 값 대입
		System.out.println(ch2);	   // 정수 값에 해당하는 문자 출력
		
		int ch3=67;
		System.out.println(ch3);	   // 문자 정수 값 출력
		System.out.println((char)ch3); // 정수 값에 해당하는 문자 출력
		
		// System.out.println();은 기본적으로 정수를 출력한다.
		// 변수선언을 문자로 char로 선언하고 문자를 대입하고 -> System.out.println(변수명);로 출력하면 정수로 출력한다.
		//                                       -> System.out.println((int)변수명);로 출력하면 정수로 출력한다.
		
		// 변수선언을 문자로 char로 선언하고 정수를 대입하고 -> System.out.println (변수명);로 출력하면 문자로 출력한다.
		
		// 변수선언을 정수로 int로 선언하고 정수를 대입하고 -> System.out.println(변수명);로 출력하면 정수로 출력한다.
		//                                       -> System.out.println((char)변수명);로 출력하면 문자로 출력한다.
		double dnum=3.14;
		float fnum=3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		double dnum1=1;
		for(int i=0; i < 10000; i++) {
			dnum1=dnum1 + 0.1;
		}
		System.out.println(dnum1);
	
		boolean isMarried=true;
		boolean isMarrieds=false;
		System.out.println(isMarried);
		System.out.println(isMarrieds);
		
	}

}


