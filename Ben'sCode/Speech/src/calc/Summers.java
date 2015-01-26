package calc;

import java.util.Scanner;

public class Summers {
	public static void main (String[] args) {
		Scanner userInput = new Scanner(System.in);
		
			System.out.println("enter a none zero number or enter Zero to find the sum of all!");
			int thingling = 1;
			int max = -100000000;
			
			
			while(thingling != 0){
				thingling = userInput.nextInt();
				if(thingling >= max) {
					max = thingling;
				}
				else {
					max = max;
				}
			}
			
			System.out.println("You max is: "+max);
			
	}
}
