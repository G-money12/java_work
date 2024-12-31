package ch02;

public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=3;
		
		// 묵시적 형변환 (작은데이터 -> 큰데이터로 넣을때 자동적으로...)
		int num=b;
				
		// 명시적 형변환 (큰 데이터 -> 작은데이터로 넣을때는 작성해야한다...)
		b=(byte)num;
		
		int num1=(int)(num+3.5);
		System.out.println(num1);
		
		
		
	}

}
