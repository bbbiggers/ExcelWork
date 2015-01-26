package warmUp;

public class Flizz {

	public static void main(String[] args) {
		
		for(int i = 50; i > 0; i--) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(i%5 == 0) {
				System.out.println("Buzz");
			}
			else if(i%3 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
		
	}
	
}
