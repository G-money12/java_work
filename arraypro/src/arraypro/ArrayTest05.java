package arraypro;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray=new int[10];
		
		// int num=(int)(Math.random()*100)+1;                  // Math : Class 수학과 관련된 함수나 연산자를 부를때 쓴다. random : 0~1사이의 실수를 랜덤하게 발생
		// System.out.println(num);
		
		for(int i=0; i<numArray.length; i++) {
			numArray[i]=(int)(Math.random()*100)+1;
			System.out.println(numArray[i]);
		}
		for(int num:numArray) {                               // for-each : 그냥 값을 가져올때 많이 사용한다.
			System.out.println(num);
		}
	}

}
