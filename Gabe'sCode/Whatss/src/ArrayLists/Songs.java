package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;


public class Songs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		ArrayList<String>SongNames = new ArrayList<String>();
	
		System.out.println("What want");
		String Song = userInput.nextLine();
		
		while (!Song.equals("")){
			SongNames.add(Song);
			System.out.println("What want");
			Song = userInput.nextLine();
		}
	
	System.out.println(SongNames);
	
	System.out.println(letters(SongNames));
	
	
	
	}
public static int letters(ArrayList<String>ABC){

int count =0;

for(int i = 0;i<ABC.size();i++){
String b =ABC.get(i);
int c = b.length();
	count +=c;
}
return count;

}
	
	
	
	
	
	
}
