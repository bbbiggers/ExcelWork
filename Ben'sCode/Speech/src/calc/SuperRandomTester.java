package calc;


public class SuperRandomTester {
	
	public static void Rune() {


		int numb = (int)(Math.random()*10);
		
		if(true) {
			
			System.out.println(numb);
			goo();
		}
	}
	public static void goo() {
		Rune();
	}
	
	
	public static void main (String[] args) {
		goo();
		
		
		
	
	}
}
