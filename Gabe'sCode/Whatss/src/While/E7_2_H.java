package While;

public class E7_2_H {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int [7];
		array[0]=0;
		array[1]=1;
		array[2]=2;
		array[3]=3;
		array[4]=4;
		array[5]=5;
		array[6]=6;
		String A = increasing(array);
		System.out.println(A);
}
	
public static String increasing(int[]array){
	
	for(int i = 0; i<array.length-1;i++){
	if (array[i]<array[i+1]){
		
		}
	else{
	return "False";
		}
		
		
			}
	
	return "True";
}
	
}