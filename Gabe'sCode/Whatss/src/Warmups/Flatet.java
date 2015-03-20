package Warmups;

public class Flatet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] myArray = {     {1, 2, 3},
								{4, 5, 6},
								{7, 8, 9}	};
		int [] b = flatten(myArray);
		for(int i = 0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		
	}
public static int[] flatten(int[][]a){
int[]b = new int[a.length*a[0].length];
int count = 0;

for(int i = 0;i<a[0].length;i++){
	for(int j = 0;j<a.length;j++){
		b[count] = a[i][j];
		count++;
	}
	
}
return b;

}
}
