package Sorting;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static void sort(int[]a){
	//BASE CASE
	if(a.length<=1){
		return;
	}
	//MAKES 2 EMPTY ARRAYS
	int[]first = new int [a.length/2];
	int[]second = new int [a.length-first.length];
	
	//SPLIT IN TWO
	for(int i = 0;i<first.length;i++){
		first[i] = a[i];
	}for (int i = 0;i<second.length;i++){
		second[i] = a[first.length+i];
	}
	
	//SORT
	sort(first);
	sort(second);
	merge(first,second,a);
	
}
public static void merge(int[]first,int[]second,int[]a){
	int iFirst = 0;
	int iSecond = 0;
	int i = 0;
	
	//MOVE SMALLEST ELEMENT INTO MAIN ARRAY
	while(iFirst<first.length&&iSecond<second.length){
		if(first[iFirst]<second[iSecond]){
			a[i]=first[iFirst];
			iFirst++;
		}else {
			a[i] = second[iSecond];
			iSecond++;
		}
	}
	i++;
	
	while(iFirst<first.length){
		a[i]=first[iFirst];
		iFirst++;
		i++;
	}while(iSecond<second.length){
		a[i]=second[iSecond];
		iSecond++;
		i++;
	}
}

	
	
}
