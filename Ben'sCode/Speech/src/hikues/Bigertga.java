package hikues;

import java.util.Scanner;

public class Bigertga {
		public static void Rune() {
			Scanner userInput = new Scanner(System.in);
			
					System.out.println("What is your number?");
					int guess = userInput.nextInt();
					
					int ten = 10;
					int hudred = 100;
					int thousand = 1000;
					
					if(guess > ten && guess <= hudred) {
						System.out.println("Bigger Than ten!");
						goo();
					} else if(guess > hudred && guess <= thousand){
						System.out.println("Bigger that a hundred!");
						goo();
					} else if (guess > thousand) {
						System.out.println("Bigger that a thousand!");
						goo();
					} else {
						System.out.println("Give me something different!");
						goo();
					}
					
					
					
					
					
					/*
					if(guess > ten && guess <= hudred) {
						System.out.println("Bigger Than ten!");
						goo();
					} else if(guess > hudred && guess <= thousand){
						System.out.println("Bigger that a hundred!");
						goo();
					} else if (guess > thousand) {
						System.out.println("Bigger that a thousand!");
						goo();
					} else {
						System.out.println("Give me something different!");
						goo();
					}
					*/
				} public static void goo() {
					Rune();
				} public static void main (String[] args) {
					goo();
					
					
					
				
				}
	}

