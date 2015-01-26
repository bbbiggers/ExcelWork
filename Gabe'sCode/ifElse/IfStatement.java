package ifElse;
import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );

		int num1 = 9;
		
		System.out.println("Number between 1-10");
		int guess = userInput.nextInt();
		
		if (guess == num1) {
			System.out.println("ok");
		} else { 
			System.out.println("no");
		}
	
		
		
		
		
		
		
		
		
	}

}
