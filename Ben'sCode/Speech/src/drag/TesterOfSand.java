package drag;

public class TesterOfSand {

	public static void main(String[] args) {
		Sandwich Go = new Sandwich();
		System.out.println(Go);
		Go.add("Jelly");
		System.out.println(Go);	
		Go.add("PB");
		System.out.println(Go);
		Go.eat();
		System.out.println(Go);
 
	}
}
