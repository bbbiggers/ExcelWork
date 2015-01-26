package While;
import java.util.Scanner;
public class Wwarmup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		String answer = "yes";
	
		while (answer.equals("yes") || answer.equals("Yes")){
			
			System.out.println("Type numbro");
			int num1 = userInput.nextInt();
			
			if (num1>0){
				System.out.println("postive");
			}
			else if (num1<0){
				System.out.println("negative");	
			}
			else if (num1==0){
				System.out.println("neithr");
			}
			
			System.out.println("enter again?");
			answer = userInput.next();
		}
		
		
		
	

	}
}