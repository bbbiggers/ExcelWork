package arrays;

import java.util.Scanner;

public class morarrayz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		int attendees = 0;
		
		String[] fieldtrips = new String[12];
		for(int i = 0; i<12;i++){
		System.out.print("Will you attend the field trip?");	
		fieldtrips[i] = userInput.nextLine();
		if (fieldtrips[i].equals("yes")||fieldtrips[i].equals("Yes")||fieldtrips[i].equals("y")){
		attendees++;
			
		}
		}
		
		
		System.out.print("attendees: "+attendees);
		
		
		
	}

}
