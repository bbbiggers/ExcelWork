package calc;

import java.util.Scanner;

public class LinedArt {
	public static void bt() {
		System.out.println("     \\--/\n  /'-'  '-'\\\n /          \\\n/.'|/\\  /\\|'.\\\n      \\/");
		
		
		
	}
	public static void tnk() {
		System.out.println("____________");
		System.out.println("|\"\"\"\"\"\"\"\"\"\"\"\"\"|=======[]");
		System.out.println("|_____________\\____");
		System.out.println("|==+===============\\");
		System.out.println("|___________________|");
		System.out.println("\\(@)(@)(@)(@)(@)(@)/");
		System.out.println(" ******************");
		System.out.println("");
		System.out.println("");
	}
	public static void run() {
		Scanner userImput = new Scanner(System.in);
		
		System.out.println("what would you like to see?");
		System.out.println("We have a large selection of art.");
		System.out.println("(tank)(Bat)");
		String Operation = userImput.nextLine();

		

	
		
		if(Operation.equals("Tank")) {
			System.out.println("Tank:");
			tnk();
			run();
		}
		
		else if(Operation.equals("tank")) {
			System.out.println("Tank:");	
			tnk();
			run();
		}
		
		else if(Operation.equals("Bat")) {
			System.out.println("Bat:");	
			bt();
			run();
		}
		else if(Operation.equals("bat")) {
			System.out.println("Bat:");	
			bt();
			run();
		}
		
		
		}
	
	public static void main(String[] args) {
		run();
		
		
		
		
	}
	
	
	
}
