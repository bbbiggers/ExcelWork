package Warmups;

import java.util.ArrayList;

public class BINATRYSERCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int search81 (ArrayList<Integer> newlist, int lo,int hi ){
	
	int mid = (lo+hi)/2;	
		
	if(lo>hi){
		return -1;
	}else if (newlist.get(mid)==81){
		return mid;
	}else if (newlist.get(mid)<81){
		return search81(newlist,mid+1,hi);
	}else{
		return search81(newlist,lo,mid-1);
	}
	
	
	}
	/*
	 
	 
	 
	 
	 
	 
	 
	 
	 */
	
	
	
	}

