package arraypro;

public class MeltiArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][]=new int[4][];
		nums[0]=new int[2];
		nums[1]=new int[1];
		nums[2]=new int[3];
		nums[3]=new int[4];
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				nums[i][j]=i+j;
				System.out.println(nums[i][j]+" ");
			}
			System.out.println();
		}
	}

}
