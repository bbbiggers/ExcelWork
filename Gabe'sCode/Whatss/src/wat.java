import java.util.Scanner;
public class wat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		System.out.println("What is your favorite animal?");
		String animal = userInput.next();
		System.out.println("I hate "+animal+"s.");
		
		System.out.println("What is your favorite color?");
		String color = userInput.next();
		System.out.println("Really? "+color+"? Wow.");
	
		System.out.println("What is your favorite ice cream flavor?");
		String flavor = userInput.next();
		System.out.println(flavor+" is probably the grossest flavor I can think of.");
		
		System.out.println("What is your favorite superpower?");
		String superpower = userInput.next();
		System.out.println(superpower+" actually sounds pretty cool.");
		
		
	}

}
