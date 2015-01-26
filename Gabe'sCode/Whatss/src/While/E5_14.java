package While;
import java.util.Scanner;
public class E5_14 {
	
	public static void Seasons(int A,int B, String season){
		
		if (A % 3 == 0 && B >= 21){
			if (season.equals("winter")){
				season=("spring");
				System.out.println(season);
			}
			else if (season.equals("spring")){
				season = ("summer");
				System.out.println(season);
			}
			else if (season.equals("summer")){
				season = ("fall");
				System.out.println(season);
			}
			else if (season.equals("fall")){
				season = ("winter");
				System.out.println(season);
			}
			
			}
		else{
		System.out.println(season);
			
		}
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		System.out.println("month");
		int A = userInput.nextInt();
		
		System.out.println("day");
		int B = userInput.nextInt();
		
		if (A == 1||A == 2||A == 3){
		String season = "winter";
		Seasons(A,B,season);
		}
		else if (A == 4||A == 5||A == 6){
			String season = "spring";
			Seasons(A,B,season);
			}
		else if (A == 7||A == 8||A == 9){
			String season = "summer";
			Seasons(A,B,season);
			}
		else if (A == 10||A == 11||A == 12){
			String season = "fall";
			Seasons(A,B,season);
			}
		
	
		
		}
		
		
	}


