package While;
import java.util.Scanner;
public class Pirate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		String answer = "yes";
		
		while (answer.equals("yes")){
			System.out.println("Sentence");
			String sentence = userInput.nextLine();
			System.out.println("Arr, "+sentence+", matey!");
			
			System.out.println("would you like to enter again?");
			answer = userInput.nextLine();
		}
	}

}
