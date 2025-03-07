package test02;

public class wrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=Integer.valueOf(10);
		int i10=i.intValue();
		int i11=i;
		System.out.println(Character.toLowerCase('A'));
		char c1='4',c2='F';
		if(Character.isDigit(c1))
			System.out.println(c1+"는 숫자");
		if(Character.isAlphabetic(c2))
			System.out.println(c2+"는 영문자");
		// Integer 사용
		System.out.println(Integer.parseInt("28")); // 문자열 "28"을 10진수로 변환
		System.out.println(Integer.toString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
//		Integer i=Integer.valueOf(28);
		System.out.println(i.doubleValue());
		Double d=Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		boolean b=(4>3);
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
				
		String s10=Integer.toBinaryString(i10);
		System.out.println("s10="+s10);
		String s20=Integer.toHexString(i10);
		System.out.println("s20="+s20);
		String s30=Integer.toString(i10);
		System.out.println("s30="+s30);
		String s40=Boolean.toString(false);
		System.out.println("s40="+s40);
		
		System.out.println(i);
		String s1="100";
		String s2="3.5";
		String s3="true";
		Boolean b1=Boolean.valueOf(s3);
		int i2=Integer.valueOf(s1);
		double d1=Double.valueOf(s2);
//		double d=Double.parseDouble(s2);
		
		Integer ii=Integer.parseInt(s1);
		System.out.println(ii);
		
		
		
		
	}

}
