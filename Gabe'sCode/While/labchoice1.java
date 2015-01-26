package While;
import java.util.Scanner;
public class labchoice1 {

		public static void Grade(int rand){
		
		//Prints the grade associated with the number
			if (rand == 9){
				System.out.println(rand+" = freshman");
			}
			else if (rand == 10){
				System.out.println(rand+" = sophomore");	
			}
			else if (rand == 11){
				System.out.println(rand+" = junior");	
			}
			else if (rand == 12){
				System.out.println(rand+" = senior");	
			}
	
		}
	
		
	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner( System.in );
		
		//Makes loop
		String answer = "yes";
		while(answer.equals("yes")){
		
		//Gets a random number between 9 and 12	
		int rand = (int)(Math.random()*13);
		if (rand==9 || rand== 10 || rand==11 || rand==12){
		
			//Sends number to method
			Grade(rand);
		
			//Asks if the user wants to go again
			System.out.println("again?");
			answer = userInput.next();
		}
		
		else{
		rand = (int)(Math.random()*12);
			}
		
	
	
	
	
		}
	}}
