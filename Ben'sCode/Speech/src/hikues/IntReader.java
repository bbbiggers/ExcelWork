package hikues;
import java.util.Scanner;
public class IntReader {
	public static void Rune() {
		Scanner userInput = new Scanner(System.in);
		
				System.out.println("What is your number?");
				int guess = userInput.nextInt();
				
				int numb = 0;
				
				if(guess > numb) {
					System.out.println("Your number is positive!");
					goo();
				} else if(guess == numb){
					System.out.println("Your number is zero!");
					goo();
				} else {
					System.out.println("Your number is negative!");
					goo();
				}
			} public static void goo() {
				Rune();
			} public static void main (String[] args) {
				goo();
				
				
				
			
			}
}
