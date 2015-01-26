package wramUp;

import java.util.Scanner;

public class Volumers {

	public static void main(String[] args) {
		
		runner();
	}
	public static void runner() {
		clocker();
	}
		public static void clocker() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your height?");
		int Legn = userInput.nextInt();
		System.out.println("What is your Length?");
		int widt = userInput.nextInt();
		System.out.println("What is your Width?");
		int higt = userInput.nextInt();
		
		Pop(Legn, widt, higt);
		System.out.println("Want to enter it again?");
		System.out.println("(Yes o No)");
		String Enter = userInput.nextLine();
		Enter = userInput.nextLine();
		if(Enter.equals("yes")) {
			System.out.println("Restarting");
			System.out.println("o.o");
			System.out.println("              \n              \n              \n              \n              \n              \n");
			System.out.println("              \n              \n              \n              \n              \n              \n");
			System.out.println("o,o");
			runner();
		}
		
		else {
			System.out.println("OK Bye!");
			
		}
	}
	public static void Pop(int higt, int widt, int Legn) {
		int Volume = Legn*widt*higt;
		System.out.println("Your volume is: "+Volume);
	
		
	}
	
}
