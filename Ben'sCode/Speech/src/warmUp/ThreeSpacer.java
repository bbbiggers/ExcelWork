package warmUp;
import java.util.Scanner;
public class ThreeSpacer {

	public static void main(String[] args) {
		
		Scanner Imputes = new Scanner(System.in);
		String Truer = "true";
		String ans = "Poop";
		
		while(Truer.equals("true")) {
		System.out.println("Give me three numbers with a space in between:");
		System.out.println("(Intil they all mulitply to less that thirty or add to more that thirty)");
		String Stuffer = Imputes.nextLine();
		int Sps1 = Stuffer.indexOf(" ");
		int Sps2 = Stuffer.indexOf(" ", Sps1+1);
		
		int num1 = Integer.parseInt(Stuffer.substring(0, Sps1));
		int num2 = Integer.parseInt(Stuffer.substring(Sps1+1, Sps2));
		int num3 = Integer.parseInt(Stuffer.substring(Sps2+1));
		
		int chec = num1+num2+num3;
		int chec2 = num1*num2*num3;
		
		if(chec2 < 30) { 
			ans = "Your numbers multiplied up to less that thirty";
			Truer = "No";
		}
		else if(chec > 30) {
			ans = "Your numbers added to more that thirty";
			Truer = "No";
		}
		else if(chec == 30) {
			ans = "Your numbers added to thirty";
			Truer = "No";
		}
		else {
			Truer = "true";
		}
		}
				
		System.out.println(ans);
	}
}
