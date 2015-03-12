package Sorting;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int [5];
		array[0]=9;
		array[1]=3;
		array[2]=6;
		array[3]=10;
		array[4]=4;
	
		sort(array);
		
		for(int i =0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
	}

	public static void sort(int[]a){
		for(int i = 1;i<a.length;i++){
		//REMOVE
		int temp = a[i];
		
		//SHIFT UP
		int j = i;
		while(j>0 && a[j-1]>temp){
			a[j]=a[j-1];
			j--;
		}
		//INSERT
		a[j] = temp;
		}	
	}
	
}
