package calc;

import java.util.Scanner;

public class Guessyafrek {
	
	public static void Rune() {
Scanner userInput = new Scanner(System.in);
		int loc = 2;
		System.out.println("Pick a Number!");
		int guess = userInput.nextInt();

		int numb = (int)(Math.random()*10);
		numb = numb+1;
		
		if(guess == numb) {
			System.out.println("Your right!");
			System.out.println("It was " +numb+".");
		}
		else if(guess == 0) {
			System.out.println("NOT A VALID ANSWER!");
			goo();
		}
		else {
			while(loc == 2) {
			if(guess > numb) {
				System.out.println("Your To High");
				System.out.println("Guess Again!");
				guess = userInput.nextInt();
			}
			else if(guess < numb) {
				System.out.println("Your To Low!");
				System.out.println("Guess Again!");
				guess = userInput.nextInt();
			}
			else if(guess == numb) {
				System.out.println("Your right!");
				System.out.println("It was " +numb+".");
				loc = 1;
			}
			}
			goo();
		}
	}
	public static void goo() {
		Rune();
	}
	
	
	public static void main (String[] args) {
		goo();
		
		
		
	
	}
}
