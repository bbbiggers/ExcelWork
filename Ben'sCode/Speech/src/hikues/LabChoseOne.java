package hikues;

import java.util.Scanner;

public class LabChoseOne {

	public static void main(String[] args) {
		String che = "yes";
		String ans = "goos";
		
		while(che.equals("yes")) {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			System.out.println("Ready??");
			
		int numb = (int)(Math.random()*3);
		numb = numb+1;
		
		System.out.println("Rock PAPER SIZZERS");
		String glos = userInput.nextLine();
		
		
		if(numb == 1) {
			ans = "Paper";
			che = "N";
			System.out.println("Paper!");
		}
		else if(numb == 2) {
			ans = "Scissors";
			che = "N";
			System.out.println("Scissors!");
		}
		else if(numb == 3) {
			ans = "Rock";
			che = "N";
			System.out.println("Rock!");
		}
		else {
			System.out.println("POOOO (CRASH)");
			che = "N";
		}
		
		if(glos.equals(ans)) {
			System.out.println("You got me");
		}
		else if(glos.equals(ans)) {
			System.out.println("Sucka!");
		}

		System.out.println("Would you like to do it again?");
		System.out.println("(yes or no)");
		
		String gus = userInput.nextLine();
		
		if(gus.equals("yes")) {
			che = "yes";
		}
		else if(gus.equals("no")) {
			che = "no";
			System.out.println("Shutting Down all systems!");
		}
		
		
		}

		
		
		
	}
	
	

}
