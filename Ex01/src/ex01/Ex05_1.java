package ex01;

public class Ex05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[10];
		int k=0;
		boolean flag=false;
		while(k<10) {
			int num=(int)(Math.random()*100)+1;
			if(num%3==0) {
				for(int i=0; i<k; i++) {
					if(nums[i]==num)
						flag=true;
						break;
				}
				if(!flag)
					nums[k++]=num;
//				if(k==10)
//					break;
			}
		}
		for(int n: nums) {
			System.out.println(n);
		}
	}

}
