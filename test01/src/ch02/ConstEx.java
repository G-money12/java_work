package ch02;

public class ConstEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수를 선언할시 기본적으로 영문 소문자 
		// 상수를 선언할시 기본적으로 영문 대문자
		// 상수는 선언할때 값을 넣어줘야한다.
		final double PI=3.14;
		final int MAX_NUM=100;
		
		System.out.println(PI);
		System.out.println(MAX_NUM);
		
		
		
		// Java 10이상 변수형 작성하지 않아도 알아서 작동됨.
		// 값이 입력될때 데이터 형태가 결정됨.
		
		final var DD=2;
		System.out.println(DD);
		
	}

}
