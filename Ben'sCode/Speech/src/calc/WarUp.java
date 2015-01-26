package calc;

import java.util.Scanner;

public class WarUp {

	public static void adds(int first, int second, int third) {
		
		int summer = first+second;
		int answer = summer*third;
		
		System.out.println("You answer is: "+answer);
	}
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Give me a number!");
		int first = userInput.nextInt();
		System.out.println("Give me a second number!");
		int second = userInput.nextInt();
		System.out.println("Give me a third number!");
		int third = userInput.nextInt();
		adds(first, second, third);

	}
	

}
