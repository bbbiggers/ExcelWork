package Warmups;
import java.util.Random;
public class arrayRando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 6;
int[] list = randomNumber(n);
for(int i = 0;i<list.length;i++){
	System.out.print(list[i]+" ");
}
sort(list);

System.out.println();
for(int i = 0;i<list.length;i++){
	System.out.print(list[i]+" ");
}




	}
public static int[] randomNumber(int n){
	
	int[] list = new int[n];	 
	Random randy = new Random();
	
	
for(int i = 0;i<n;i++){
	list[i] = randy.nextInt(1000000);
	//list[i] = (int)(Math.random()*1000000)+1;
}
return list;

//SORT BELOW
}
public static void sort(int[] a) {
	// Makes sure the array can be sorted
	if (a.length <= 1) { return; }

	// Makes two new arrays that are half the length of the initial array
	int[] first = new int[a.length / 2];
	int[] second = new int[a.length - first.length];

	//Splits intial array into the two new arrays (first half and second half)
	for (int i = 0; i < first.length; i++) 
		first[i] = a[i];
	for (int i = 0; i < second.length; i++)
		second[i] = a[first.length + i];

        //loops the method to make the arrays as small as possible (1) then merges the two new arrays
	sort(first);
	sort(second);
	merge(first, second, a);
}

private static void merge(int[] first, int[] second, int[]a) {
        //initializes index variables;
	int iFirst = 0;
	int iSecond = 0;
	int index = 0;
	
	

	// While the two new indexes are less than the two new arrays it will loop
	while (iFirst < first.length && iSecond < second.length) {
                //if the index of the first array is smaller than the index of the second array the index of the first array is added to the initial array
		if (first[iFirst] < second[iSecond]) {
			a[index] = first[iFirst];
			iFirst++;
                // same as before but with the second array
		} else {
			a[index] = second[iSecond];
			iSecond++;
		}
			index++;
			
	}

	//if the second array is empty then the first array is added to the initial array
	while (iFirst < first.length) {
		a[index] = first[iFirst];
		iFirst++;
		index++;
	}
        // same as before but with the second array
	while (iSecond < second.length) {
		a[index] = second[iSecond];
		iSecond++;
		index++;
	}
}

}
