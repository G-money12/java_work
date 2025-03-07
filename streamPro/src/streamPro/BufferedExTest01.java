package streamPro;		// data.txt 파일을 읽어서 학생들 성적의 합계, 평균, 등수를 계산하여 result.txt 파일에 저장하라
						// student
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedExTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		FileReader fr;
		FileWriter fw;
		BufferedReader br;
		BufferedWriter bw;
		Student[] students=new Student[5];	
		
		try {
			fr=new FileReader("c:/pgm/data.txt");
			br=new BufferedReader(fr);
			fw=new FileWriter("c:/pgm/result.txt");
			bw=new BufferedWriter(fw);
			
			String s;
			int idx=0;
			while((s=br.readLine())!=null) {				
				String[] arr=s.split(" ");
				int sno=Integer.parseInt(arr[0]);
				String name=arr[1];
				int[] scores=new int[3];
				scores[0]=Integer.parseInt(arr[2]);
				scores[1]=Integer.parseInt(arr[3]);
				scores[2]=Integer.parseInt(arr[4]);
				students[idx]=new Student(sno, name, scores);
				students[idx].setTotal_avg();
				idx++;
			}	
			for(int i=0; i<students.length; i++) {		// 등수 계산 
				int rank=1;
				for(int j=0; j<students.length;j++) {
					if(students[i].getAvg()<students[j].getAvg())
						rank++;
				}
				students[i].setRank(rank);
				System.out.println(students[i]);
				bw.write(students[i].toString()+"\n");
					
			}
			bw.flush();
			bw.close();
			br.close(); 
			fr.close();			 
			fw.close();
			
		}catch(IOException ex) {
			System.out.println("IO error");
		}
		
	}

}
