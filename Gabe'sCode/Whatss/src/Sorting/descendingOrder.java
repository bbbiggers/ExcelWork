package Sorting;

public class descendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[] array = new int [5];
		array[0]=0;
		array[1]=1;
		array[2]=2;
		array[3]=3;
		array[4]=4;
	
		//SHIFT METHOD
		shift(array);
		
		//DESCENDING ORDER STUFF
	for(int i = 0;i<array.length;i++){
		int min = descendingSearch(array,i);
		descendingSwap(array,min,i);
	}
	for(int i =0;i<array.length;i++){
		System.out.println(array[i]);
	}
	
	}

	public static int descendingSearch(int[]array,int start){
		
	int min = start;
	for(int i = start;i<array.length;i++){
		if(array[i]<array[min]){
			min = i;
		}
	}
	return min;
	}
	
	public static void descendingSwap(int[]array,int i,int j){
	int temp = array[i];
	array[i]=array[j];
	array[j]=temp;
}
	
	
	
	//SHIFT
	public static void shift(int[]a){
		int temp = a[a.length-1];
		//int y = a[0];
		for(int i = a.length-1;i>0;i-- ){
			a[i]=a[i-1];
		}
		a[0] = temp;
		
		
		for(int i =0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	
	
}