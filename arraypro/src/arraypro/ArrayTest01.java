package arraypro;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray;                // intArray라는 4byte 공간이 생성
		intArray=new int[10];          // index는 0~9까지 만들어짐
																		// 배열은 만들면 기본 디폴트 값을 가지고 있다. 정수: 0, 실수: 0.0, 문자: 공백란
		double dArrary[]=new double[10];
		
		for(int i=0; i<10; i++) {
			System.out.println(dArrary[i]);
		}
		
		
		
		
		
		char[] chArray=new char[26];
		
		int testArray[]= {1,2,3,4,5};
		
		
		char ch='A';
		for(int i=0; i<26; i++) {
			chArray[i]=ch++;
			System.out.println(chArray[i]);
		}
		
		
		
//		intArray[0]=10;				   // 정수형 배열 
//		intArray[5]=20;
//		intArray[9]=60;
//		intArray[10]=100;
		
		for(int i=0; i<10; i++) {
			System.out.println(intArray[i]);
		}
	}

}
