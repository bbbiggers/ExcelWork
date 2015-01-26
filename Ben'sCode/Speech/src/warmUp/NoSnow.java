package warmUp;

import java.util.ArrayList;
import java.util.Scanner;

public class NoSnow {

	public static void main(String[] args) {
		Scanner Imput = new Scanner(System.in);
		ArrayList<String> SongList = new ArrayList<String>();
		String Song = "a";
		while(!Song.equals("")) {
			//works only if there is a input
			System.out.println("What Songs would you like to add?"); //asks for a song
			Song = Imput.nextLine(); //stores the song
			SongList.add(Song);
			//Adds each Song to the list
		}
int Hi = vudop(SongList);

System.out.println("Here:"+Hi);
	}
	
	
	public static int vudop(ArrayList<String> SongList) {
		String Sice = "";
		for(int i = 0; i < SongList.size(); i++) {
			Sice = Sice+SongList.get(i);
		}
		int joe = Sice.length();
	return joe;
	}
}
