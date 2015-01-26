package warmUp;

import java.util.ArrayList;
import java.util.Scanner;

public class Stevens {

	public static void main(String[] args) {
		ArrayList<Integer> IntList = new ArrayList<Integer>();		
		IntList.add(1);
		IntList.add(2);
		IntList.add(3);
		IntList.add(4);
		IntList.add(4);
		IntList.add(6);
		IntList.add(21);
		IntList.add(22);
		IntList.add(33);
		IntList.add(44);
		IntList.add(35);
		IntList.add(36);
		System.out.println(IntList);
		for(int i = 0; i < IntList.size(); i++) {
			if((IntList.get(i) % 2) == 0) {
				IntList.remove(i);
				i--;
			}
			}
		
		System.out.println(IntList);
	}
}
