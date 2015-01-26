package hikues;
import java.util.Scanner;
public class WaterStat {
	public static void Rune() {
		Scanner userInput = new Scanner(System.in);
		
				System.out.println("What is your Temperature?");
				System.out.println("(°F)");
				int guess = userInput.nextInt();
				

				
				if(guess >= 212) {
					System.out.println("Your water is gas!");
					goo();
				} else if(guess < 32){
					System.out.println("Your water is Frozen!");
					goo();
				} else if(guess == 32){
					System.out.println("Your water is Freezing!");
					goo();
				} else if(guess < 212){
					System.out.println("Your water is liquid!");
					goo();
				} else if(guess > 32){
					System.out.println("Your water is liquid!");
					goo();
				} else {
					System.out.println("Your water is Frozen!");
					goo();
				}
			} public static void goo() {
				Rune();
			} public static void main (String[] args) {
				goo();

			}
}
