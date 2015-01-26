import java.util.Scanner;
public class TestArea {

	public static void maths(int A){
		int B = 0;
		
		while (B!=(A-1)){
		B = B+1;	
		System.out.print(B+",");
		}
		
		System.out.print(A);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
	
		System.out.println("Max num");
		int A = userInput.nextInt();
		
		maths(A);
	}

}
