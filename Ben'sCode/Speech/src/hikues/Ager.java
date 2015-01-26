package hikues;
import java.util.Scanner;
public class Ager {
	public static void Rune() {
		Scanner userInput = new Scanner(System.in);
		
				System.out.println("How old are you?");
				int guess = userInput.nextInt();
				
				int numb = 15;
				
				if(guess > numb) {
					System.out.println("Your Older!");
				} else if(guess == numb){
					System.out.println("Your my Age!");
					goo();
				} else {
					System.out.println("Your Young!");
					goo();
				}
			} public static void goo() {
				Rune();
			} public static void main (String[] args) {
				goo();
				
				
				
			
			}
}
