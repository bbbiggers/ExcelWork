package arrays;

import java.util.Scanner;

public class Extraarrayz {
public static void main (String [] args){
	
	
	int[] array = new int [5];
	array[1]=1;
	array[2]=2;
	array[3]=3;
	
	array = add(array,A);
	for(int i = 0;i<array.length;i++){
		System.out.println(array[i]);
	}
}
public static int[] add(int array[],int A){
int [] newarray = new int[4];
	for (int i = 0;i < array.length+1;i++){
	if (i == array.length+1){
		newarray[i] = A;
	}
	else{
		newarray[i]=array[i];
	}
	
}
return (array);
}




}