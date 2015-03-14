package NewYear.src.warmUp;

import java.util.ArrayList;

public class search81 {
public static ArrayList<Integer> Thing;
	public static void main(String[] args) {
	 
		search81(Thing);
	}
	public static int search81(ArrayList<Integer> Joe) {
		int center = Joe.size()/2;
	if(Joe.get(center) == 81) {
		return center;
	}
	else if(!Joe.contains(81)) {
		return -1;	
	}
	else if(Joe.get(center+1) >= 81) {
		int count = 0;
		for(int i = 0; i < Joe.size()/2; i++) {
			if(Joe.get(i) == 81) {
				count = i;
			}
		}
		return count;
	}
	else  {
		return 1;
	}
}
}