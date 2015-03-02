package Warmups;

public class searchmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int [5];
		array[0]=3;
		array[1]=4;
		array[2]=2;
		array[3]=7;
		array[4]=4;
		System.out.println(searchMin(array));
	}

	public static int searchMin(int[]a){
		int b = a[0];
		for (int i = 1;i<a.length;i++){
			if (a[i]< b){
				b = a[i];
			}
			
			
		}
		return a[b];
		
	}
	
}
