
import java.util.Scanner;
public class TestArea2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		System.out.println("Number");
		int max = 0;
		int nextnum = 1;
		
		while (nextnum!=0){
			
		nextnum = userInput.nextInt();
		
		if(nextnum>max) {
			max = nextnum;
		}
			
			
			}

		System.out.println(max);
	}

}
