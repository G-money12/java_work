package streamPro;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		FileWriter fw;
		
		try {
			fr=new FileReader("c:\\pgm\\test.txt");
			fw=new FileWriter("c:\\pgm\\test3.txt");
			int c;
			String st="";		// 문자열 출력
			while((c=fr.read())!=-1) {
				//fw.write(c);
				st+=c;
			}
			fw.write(st);		// 문자열 출력
			fr.close();
			fw.close();
		}catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

}
