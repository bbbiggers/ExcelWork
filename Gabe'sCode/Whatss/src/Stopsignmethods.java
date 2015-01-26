
public class Stopsignmethods {

	public static void Top(){
		//Creates the top shape
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
		
	}
public static void Bottom(){
		//Creates the bottom shape
		System.out.println("\\        /");
		System.out.println(" \\______/");
		
	}
public static void Space(){
	//Make a 1 line space
	System.out.println("");
	
	}
public static void Line(){
	//Makes the line shape
	System.out.println("+--------+");
	
	}
public static void Stop(){
	//Makes the STOP part
	System.out.println("|  STOP  |");
	
	}
	
	
	
	public static void main(String[] args) {
		//Combines the methods to make the whole picture
		Top();
		Bottom();
		Space();
		Bottom();
		Line();
		Space();
		Space();
		Top();
		Stop();
		Bottom();
		Space();
		Space();
		Top();
		Line();
		
		
	}

}
