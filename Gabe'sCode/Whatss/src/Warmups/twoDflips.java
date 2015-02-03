package Warmups;

public class twoDflips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myArray = {     {1, 2, 3},
								{4, 5, 6},
								{7, 8, 9}	};
		flips(myArray);

	}
public static void flips(int[][]array){
		for(int j = 0; j < array.length; j++){
		    for(int i = 0; i < array[j].length / 2; i++) {
		        int temp = array[j][i];
		        array[j][i] = array[j][array.length - i - 1];
		        array[j][array.length - i - 1] = temp;
		    }
		}
		for(int i = 0; i<3; i++){
		    for(int j = 0; j<3; j++){
		        System.out.print(array[i][j]);
		    }
		    System.out.println();
		}
}
}

