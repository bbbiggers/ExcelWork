package twoDArrays;

public class diagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myArray = {		{0, 1, 2},
								{3, 4, 5},
								{6, 7, 8}	};
		diags(myArray);
		
	}
public static void diags(int[][] a){
	int[][]b = new int[a.length][a.length];
	int count = a.length-1;
	for(int i = 0;i<a.length;i++){
		int temp = a[i][i];
		a[i][i] = a[i][count];
		a[i][count] = temp;
		count--;
		
	}
		
	}
		
		
	


}

