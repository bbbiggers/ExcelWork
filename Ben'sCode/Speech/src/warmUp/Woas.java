package warmUp;

import java.util.Scanner;

public class Woas {

	public static void main(String[] args) {
		int[] lok = new int[6];

		lok[0] = 1;
		lok[1] = 2;
		lok[2] = 2;
		lok[3] = 2;
		lok[4] = 2;
		lok[5] = 2;
		
		int dy = 1;
		duck(lok, dy);
	}
	public static void duck(int lok[], int dy) {
		
		for(int i = 0; i < lok.length; i++) {
			lok[i] = lok[i]+1;
		}
		
	}

}

