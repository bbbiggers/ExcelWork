package rolps;

import java.util.ArrayList;

public class Ghost extends Chars{
public static ArrayList<String> Items;
	public Ghost(ArrayList<String> Its) {
		super(150, Its, 10, "Ghoster");
		Items = Its;
	}
	
	public int infect(int armor) { //armor is the armor of the thing it is absorbing
		int att; 
		if(armor <= 0) {
			att = super.Attack(10);
			return att;
		}
		else {
			att = 0;
			return att;

		}
	}
}
