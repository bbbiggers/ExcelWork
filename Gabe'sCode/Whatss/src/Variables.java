import java.util.Scanner;
public class Variables {

	public static void main(String[] args) {
		Scanner userInput = new Scanner( System.in );
		int A;
		int B;
		
		String animal;
		System.out.print("Name an animal");
		animal = userInput.next();
		
		System.out.print("Name an number");
		A = userInput.nextInt();
		
		System.out.print("Name another number");
		B = userInput.nextInt();
		
		
		System.out.println("I hate the " +animal+ " so much.");	
		System.out.println("The sum of your numbers is "+(A+B));
		
		
		}

}
