package calc;

import java.util.Scanner;

public class SpeechBubble {
	
	public static void main (String[] args) {
		Scanner userImput = new Scanner(System.in);
		
		System.out.println("what is your First Number?");
		int First = userImput.nextInt();
		System.out.println("what is your Second Number?");
		int Second = userImput.nextInt();
		System.out.println("Would you like to add, Subtract, Multiply, or Divide?");
		String Operation = userImput.nextLine();
		Operation = userImput.nextLine();
		
		int AddAnswer = First+Second;
		int SubAnswer = First-Second;
		int MultAnswer = First*Second;
		int DivAnswer = First/Second;
	
		
		if(Operation.equals("Add")) {
			System.out.println("Your Answer is "+AddAnswer+".");	
		}
		
		else if(Operation.equals("Subtract")) {
			System.out.println("Your Answer is "+SubAnswer+".");	
		}
		
		else if(Operation.equals("Multiply")) {
			System.out.println("Your Answer is "+MultAnswer+".");	
		}
		
		else if(Operation.equals("Divide")) {
			System.out.println("Your Answer is "+DivAnswer+".");	
		}
		
		else if(Operation.equals("add")) {
			System.out.println("Your Answer is "+AddAnswer+".");	
		}
		
		else if(Operation.equals("subtract")) {
			System.out.println("Your Answer is "+SubAnswer+".");	
		}
		
		else if(Operation.equals("multiply")) {
			System.out.println("Your Answer is "+MultAnswer+".");	
		}
		
		else if(Operation.equals("divide")) {
			System.out.println("Your Answer is "+DivAnswer+".");	
		}
		
		else if(Operation.equals("+")) {
			System.out.println("Your Answer is "+AddAnswer+".");	
		}
		
		else if(Operation.equals("-")) {
			System.out.println("Your Answer is "+SubAnswer+".");	
		}
		
		else if(Operation.equals("*")) {
			System.out.println("Your Answer is "+MultAnswer+".");	
		}
		
		else if(Operation.equals("/")) {
			System.out.println("Your Answer is "+DivAnswer+".");	
		}
		
		
		
		}
		
		
		
		
		
		
		
}
	

