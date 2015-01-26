package hikues;

public class BoughtMeACat {


	
	
	public static void main(String[] args){
		String Animal = "cat";
		Lone(Animal);
		Ltwo(Animal);
		Lthree();
		Animal = "hen";
		Lone(Animal);
		Ltwo(Animal);
		Lfour();
		Animal = "duck";
		Lone(Animal);
		Ltwo(Animal);
		Lfive();
		Animal = "goose";
		Lone(Animal);
		Ltwo(Animal);
		Lsix();
		Animal = "sheep";
		Lone(Animal);
		Ltwo(Animal);
		Lseven();
	}
	public static void Lone(String Animal) {

		System.out.println("Bought me a "+Animal+" and the "+Animal+" pleased me,");
	}
	public static void Ltwo(String Animal) {

		System.out.println("I fed my "+Animal+" under yonder tree.");
	}
	public static void Lthree() {
		System.out.println("Cat goes fiddle-i-fee.");
	}
	public static void Lfour() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
		Lthree();
	}
	public static void Lfive() {
		System.out.println("Duck goes quack, quack,");
		Lfour();
	}
	public static void Lsix() {
		System.out.println("Goose goes hissy, hissy,");
		Lfive();
	}
	public static void Lseven() {
		System.out.println("Sheep goes baa, baa,");
		Lsix();
	}
	public static void P1() {

		System.out.println("");
		System.out.println("");
	}
	
}
