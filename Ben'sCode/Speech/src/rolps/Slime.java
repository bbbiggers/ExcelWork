package rolps;

import java.util.ArrayList;

public class Slime extends Chars{
		public static ArrayList<String> Items;
		private String name;
			public Slime(ArrayList<String> Its, String n) {
				super(200, Its, 25, n);
				Items = Its;
				name = n;
			}
			
	public int absorb(int armor, String thingBeingAttacked) { //armor is the armor of the thing it is absorbing
		int att = 60;
		System.out.println(name+" has absorbed"+"");
		if(armor > 30) {
			att = 0;
		}
		return att;
	}

}