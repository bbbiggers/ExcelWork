package hikues;

public class Frkn {

	public static void TopHex() {
		System.out.println("   _______");
		System.out.println("  /       \\");
		System.out.println(" /         \\");

	}
	
	public static void BottomHex() {
		System.out.println(" \\         /");
		System.out.println("  \\_______/");

	
	}
	
	public static void Separator() {
		System.out.println(" +---------+");
	}
	
	public static void Stoper() {
		System.out.println(" |   STOP  |");
	}
	
	public static void Space() {
		System.out.println("\n");
	}
	public static void main(String[] args){
		TopHex();
		BottomHex();
		Space();
		BottomHex();
		Separator();
		Space();
		TopHex();
		Stoper();
		BottomHex();
		Space();
		TopHex();
		Separator();
		
	}
	
	
}
