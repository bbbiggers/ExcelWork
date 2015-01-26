package warmUp;

import java.util.Scanner;

public class Pos_Neg {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int Gug = 1;
		
		while(Gug == 1) {
			System.out.println("Give me a number: ");
			int number = userInput.nextInt();
			if(number == 0) {
				System.out.println("Positive Number(Zero)");
				Gug = 0;
			} else if(number > 0) {
				System.out.println("Positive Number");
				Gug = 0;
			} else {
				System.out.println("Negative Number!");
				Gug = 0;
			}
			
			
		}
		System.out.println("Would you like to do it again?");
		System.out.println("(y or n)");
		userInput.nextLine();
		String YesOrNo = userInput.nextLine();
		
		if(YesOrNo.equals("y")) {
		Gug = 1;
		}
		else if(YesOrNo.equals("n")) {
			Gug = 0;
			}
		else {
			Gug = 0;
		}

	}
	
}
