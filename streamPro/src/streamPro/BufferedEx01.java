package streamPro;						// 한 라인씩 가져오기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		FileWriter fw;
		BufferedReader br;
		BufferedWriter bw;
		try {
			fr=new FileReader("c:/pgm/system.txt");
			br=new BufferedReader(fr);
			fw=new FileWriter("c:/pgm/system2.txt");
			bw=new BufferedWriter(fw);
			
			String s;
			int i=1;
			while((s=br.readLine())!=null) {
				System.out.println(i+": "+s);
				bw.write(i+": "+s+"\n");
				i++;
			}
			bw.flush(); 		// 버퍼에 내용을 비워서 출력해라.
			br.close(); fr.close();	bw.close(); fw.close();
			
		}catch(IOException ex) {
			System.out.println("IO error");
		}
	}

}
