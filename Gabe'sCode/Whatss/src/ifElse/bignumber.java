
package ifElse;
import java.util.Scanner;
public class bignumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
String answer = "yes";
		
		while (answer.equals("yes")){
		System.out.println("Number 1");
		double A = userInput.nextInt();
	
		System.out.println("Number 2");
		double B = userInput.nextInt();
		
		System.out.println("Number 3");
		double C = userInput.nextInt();
		
		System.out.println(((A+B+C)/3));
	
		System.out.println("would you like to enter again?");
		userInput.nextLine();
		answer = userInput.nextLine();
		}
	}

}

