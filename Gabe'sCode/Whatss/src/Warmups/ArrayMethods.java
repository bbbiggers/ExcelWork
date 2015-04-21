package Warmups;

import java.util.ArrayList;

public class ArrayMethods {
	
	private int[] num;
	
	public void ArrayMethods(int[]num){
		num = this.num;
	}
	public ArrayList<Integer> getEven(){
	ArrayList<Integer>evens = new ArrayList<Integer>();
	for (int i = 0;i<num.length;i++){
		if(num[i]%2==0){
			evens.add(num[i]);
		}
	}
	return evens;
	}
	
	
	 
	public ArrayList<Integer> getUpper(int n){
		ArrayList<Integer>upper = new ArrayList<Integer>();
		for (int i = 0;i<num.length;i++){
			if(num[i]>n){
				upper.add(num[i]);
			}
	}
	return upper;
	}
	
	
	 
	
	
	
	
}
