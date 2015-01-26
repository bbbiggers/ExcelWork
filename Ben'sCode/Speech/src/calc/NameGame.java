package calc;

import java.util.Scanner;

public class NameGame {
	
	public static void main (String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("what is your Name?");
		String First = userInput.nextLine();
		String RightOn = "Ben";
		

		
		if (First.equals("Ben")){
			System.out.println("You are awesome!");
		}
		else {
			System.out.println("you not so cool");
		
		}


		

	}
}
