package stringPro;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="";
		for(int i=0; i<100; i++) {
			ss+=i;
		}
		String a=" ab cd\t";
		String b="java";
		String c=a.concat(b);				// 두 문자열을 연결한다.
		String d=c.replace("java","python"); // 저런문자를 찾아서 python으로 고쳐라
		String s1="java,program,python";
		System.out.println(s1.indexOf(","));
		System.out.println(s1.lastIndexOf(","));
		System.out.println(s1.substring(s1.indexOf(",")+1,s1.lastIndexOf(",")));
		
		String[] arr=s1.split(",");			// split 공백으로 써서 문자열을 나누겠다
		String s2=s1.substring(5);
		String s3=s1.substring(5,8);
		System.out.println(s3);
		System.out.println(s1.charAt(0));	// charAt 캐릭터화해서 문자를 하나 뽑아온다.
		System.out.println(s1.charAt(1));
		System.out.println(s1.codePointAt(1)); // codePointAt 문자열에 코드를 알려준다.
		System.out.println("s2="+s2);		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(d);
		System.out.println(c);
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println("|"+a+"|");		
		System.out.println("|"+a.trim()+"|");		// trim 좌,우의 공백을 제거
		
	}

}
