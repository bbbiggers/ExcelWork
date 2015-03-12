package Sorting;

public class SortingHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,3,7,9,5,8,10};
	
	
		for(int i = 0;i<array.length;i++){
			int min = descendingSearch(array,i);
			descendingSwap(array,min,i);
		}
		//PRINT OUT ARRAY
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
		
	
	}


