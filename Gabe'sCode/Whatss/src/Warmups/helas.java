package Warmups;

public class helas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	int[] prices = new int[4];
		prices[0] = 0;
		prices[1] = 1;
		prices[2] = 2;
		prices[3] = 3;
		System.out.println(frogl(prices,3));
		
	}

	
	public static int frogl(int[]a,int num){
		int temp = a[0];
		int temp2 = Math.abs(num-temp);
		for(int i = 1;i<a.length;i++){
			if(Math.abs(num-temp)<Math.abs(num-a[i])){
				temp = a[i];
				
			}
			
			
		}
		return (Math.abs(num-temp));
	}
	
	
	
}
