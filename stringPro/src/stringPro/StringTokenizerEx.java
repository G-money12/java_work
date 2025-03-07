package stringPro;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query="name=kitae&addr=seoul&age=21";
		String [] arr=query.split("&");					// split 한개만 쓸때는 편하다.
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");		// StringTokenizer 여러요소 있을때 편하다
		StringTokenizer st=new StringTokenizer(query,"=&");		// =, &, =& 구분자로 생각한다. 
		int count=st.countTokens();
		System.out.println("token count:"+count);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
