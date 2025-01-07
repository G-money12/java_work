package arraypro;

public class MeltiArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 11 12
		// 20 21
		// 30 31 32
		// 40 41
		int num[][]=new int[4][];
		num[0]=new int[3];
		num[1]=new int[2];
		num[2]=new int[3];
		num[3]=new int[2];
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length;j++) {
				num[i][j]=(i+1)*10+j;
				System.out.print(num[i][j]+" ");
				System.out.println();
				
				
				
			}
		}
		
	}

}
