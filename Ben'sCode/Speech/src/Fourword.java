package Speech.src;

import java.util.Scanner;


public class Fourword {

	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);    
	       System.out.println("Give me a word:");
	       String first = input.nextLine();
	       System.out.println("Give me another word:");
	       String second = input.nextLine();
	       System.out.println("Give me a third word:");
	       String third = input.nextLine();
	       
	       
	       
	       
	       if (first.compareTo(second) < 0) {
	    	   String un = first;
	    	   
	    	   
	    	   
	        } else if (second.compareTo(third) < 0){
	        	String da = second;
	        	
	        	
	        	
	        } else {
	        	String tha = third;
	        	
	        	
	        	
	        }
	}
	
	public static void runer(String un, String da, String tha) {
		System.out.println("In alpha order: "+un+" "+da+" "+tha+".");
		
		
	}
}