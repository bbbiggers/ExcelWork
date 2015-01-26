package calc;

import java.util.Scanner;

public class AdvanceCalculator {
	public static void main (String[] args) {
		calcc();
	}
	
	
	public static void rut(){
		calcc();
		
	}
		
	public static void calcc()	{
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to Super duper Calculator!");
		System.out.println("Enter you problem:");
		String Problem = userInput.nextLine();
		char First = Problem.charAt(0);
		char Operat = Problem.charAt(1);
		char Second = Problem.charAt(2);
		
		String Operation = "" + Operat;
		String Fit = "" + First;
		String Sed = "" + Second;
		
		int Fist = Integer.parseInt(Fit);
		int Secd = Integer.parseInt(Sed);
		
		int AddAnswer = Fist+Secd;
		int SubAnswer = Fist-Secd;
		int MultAnswer = Fist*Secd;
		int DivAnswer = Fist/Secd;
		
		if(Operation.equals("+")) {
			System.out.println("Your Answer is "+AddAnswer+".");
			rut();
		}
		
		else if(Operation.equals("-")) {
			System.out.println("Your Answer is "+SubAnswer+".");
			rut();
		}
		
		else if(Operation.equals("*")) {
			System.out.println("Your Answer is "+MultAnswer+".");	
			rut();
		}
		
		else if(Operation.equals("/")) {
			System.out.println("Your Answer is "+DivAnswer+".");
			rut();
		}
		
		
		
		
		
		}
	
	
	
	
	
}
