package Warmups;
import java.util.Scanner;
public class Warmup10_21 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner( System.in );
		
		 System.out.println("player 1 enter word");
	      String word =userInput.next();
	      
	      System.out.println("player 2 guess letter1");
	      String guess =userInput.next();
	      
	      
	      int madp1 = word.indexOf(guess);
	      while (madp1 == -1){
	    System.out.println("try again");
	    guess =userInput.next();
	    madp1 = word.indexOf(guess); 
	    }
	      System.out.println("got it");
	      System.out.println("player 2 guess letter2");
	      guess =userInput.next();
	      int madp2 = word.indexOf(guess);
	      while (madp2 == -1 && madp2 != madp1){
	  	    System.out.println("try again");
	  	    guess =userInput.next();
	  	    madp2 = word.indexOf(guess);
	  	    }
	       
	  	  System.out.println("got it");
	      System.out.println("player 2 guess letter3");
	      guess =userInput.next();
	      int madp3 = word.indexOf(guess);
	      while (madp3 == -1 && madp3 != madp2 && madp3 != madp1){
		  	    System.out.println("try again");
		  	    guess =userInput.next();
		  	 	madp3 = word.indexOf(guess);
	      }
	      System.out.println("did it");
	}

}
