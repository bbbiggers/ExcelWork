package Warmups;

public class FOURadjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] array = new int[]{1,2};
		
System.out.println(adj(array));
	
	
	
	}

	public static int adj(int[]array){
	if(array.length<4){
		return Integer.MIN_VALUE;
	}
		
		
		int temp = array[0]+array[1]+array[2]+array[3];
		int temp2;
		for(int i = 1;i<array.length-3;i++){
			temp2 = array[i]+array[i+1]+array[i+2]+array[i+3];
			if(temp2>temp){
				temp = temp2;
			}
		}
		return temp;
		
	}
	
	
	
}
