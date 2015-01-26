package ifElse;
import java.util.Scanner;
public class ifelsewarmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );

			int MyAge = 15;
			
			System.out.println("Guess age");
			int guess = userInput.nextInt();
			
			if (guess == MyAge) {
				System.out.println("you are my age");
			} if (guess > MyAge) { 
				System.out.println("you are older");
			} if (guess < MyAge) { 
			System.out.println(" you are younger");
		}
		
		}

}
