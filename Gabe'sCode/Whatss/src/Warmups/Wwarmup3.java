package Warmups;
import java.util.Scanner;
public class Wwarmup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
	
		int rand = (int)(Math.random()*11);
		System.out.println("Guess");
		int guess = userInput.nextInt();
		
		while (guess != rand){
			
			if (guess > rand){
			System.out.println("Too high");
			guess = userInput.nextInt();
			}
			
			else if (guess < rand){
			System.out.println("Too low");
			guess = userInput.nextInt();
			}
		
		}
		
		System.out.println("Correct");
		
	}

}
