package ifElse;

import java.util.Scanner;
public class Password {
    
	
	public static void A(String password,String guess){
		System.out.println("Enter");
		
	}
	
	public static void B(String password,String guess){
	Scanner input = new Scanner(System.in);
		System.out.println("No");
		 System.out.println("Try Again:");
	       guess = input.next();
		if (guess.equals (password)){
	          A(password,guess);
	        } else if (!guess.equals (password)) {
	        	B(password,guess);
	        }
		
	}
	
	
	
	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String password = "Cats";
       
       System.out.println("Enter password:");
       String guess = input.next();
      
       
       if (guess.equals(password)){
          A(password,guess);
        } else if (!guess.equals (password)) {
        	B(password,guess);
        }
    }    
}