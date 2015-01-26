package FrogClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		
		ArrayList<String>colors = new ArrayList<String>();
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		colors.add("yellow");
	
		double random = Math.random() * 4;
		int x = (int)random;
	System.out.println("Guess a color");
	String g = userInput.nextLine();
	while (!g.equals(colors.get(x))){
		System.out.println("try again");
		g = userInput.nextLine();
		
	}
	System.out.println("got it");
	}

}
