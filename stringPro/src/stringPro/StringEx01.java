package stringPro;

public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="java";
		String s3="abcd";
		String s4=new String("abcd");
		String s5=new String("java");
		String s6=new String("java");
		char[] ch= {'a','b','c','d'};
		String s7=new String(ch);
		
		System.out.println(s1.equals(s2));		
		int n1=s1.compareTo(s7);
		int n2=s1.compareTo(s6);
		int n3=s6.compareTo(s1);
		System.out.println(s1.compareTo(s7));		// Error시 바로 쓸수없음
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println("-------------------------");
		
		
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s4);				// 값은 같지만 똑같은 객체를 가르키지는 않는다.
		System.out.println(s1.equals(s4));
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6)); 		// 값은 같다.
		System.out.println(s4==s7);
		System.out.println(s4.equals(s7));
	}

}
