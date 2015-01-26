package While;
import java.util.Scanner;
public class warmupstuffs {

	public static void Volume(int L,int W,int H){
		
		System.out.println("Volume: " + (L*W*H));
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
	
		String answer = "yes";
	
		while (answer.equals("yes")|| answer.equals("Yes")){
			
		System.out.println("Length");
		int L = userInput.nextInt();
		
		System.out.println("Width");
		int W = userInput.nextInt();
		
		System.out.println("Height");
		int H = userInput.nextInt();
	
		Volume(L,W,H);
		
		System.out.println("Go again?");
		answer = userInput.next();
		}
	}

}
