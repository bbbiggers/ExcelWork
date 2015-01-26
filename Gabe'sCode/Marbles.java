import java.util.Scanner;
public class Marbles {

public static void Top(){
	System.out.println("   /*");
	System.out.println("  //**");
	System.out.println(" ///***");
	System.out.println("////****");
	}
	
public static void Bottom(){
		
	System.out.println("****////");
	System.out.println(" ***///");
	System.out.println("  **//");
	System.out.println("   */");
	}
	
public static void main(String[] args) {
Scanner userInput = new Scanner( System.in );
		
	Top();
	Bottom();
	Bottom();
	Top();
	}
}