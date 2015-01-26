package While;
import java.util.Scanner;
public class phonenumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		//(425)889-6898
		System.out.println("numbr");
		String phone = userInput.nextLine();
		
		
		int A = phone.indexOf("(");
		int B = phone.indexOf(")");
		String first = phone.substring(A+1,B);
		
		
		int C = phone.indexOf(")");
		int D = phone.indexOf("-");
		String second = phone.substring(C+1,D);
		
		
		int E = phone.indexOf("-");
		String third = phone.substring(E+1);
		
		int X = Integer.parseInt(first);
		int Y = Integer.parseInt(second);
		int Z = Integer.parseInt(third);
		
		int F = (X+Y+Z);
		System.out.println(F);
	}

}
