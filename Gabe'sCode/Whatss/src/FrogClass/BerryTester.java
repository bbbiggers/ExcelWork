package FrogClass;

import java.util.ArrayList;

public class BerryTester {

	public static void main(String[] args) {
		//[] prices = new double[10];
		ArrayList<Berry> myLo = new ArrayList<Berry>();
		myLo.add(new Berry("Blue",2));
		BerryBush Bush = new BerryBush(myLo,"Green",1,3);
		
		Bush.growBerry();
		Bush.growBerry();
		
		Bush.growBerry("Invisible");
		Bush.growBerry("Poison");
		Bush.growBerry("Shapeshift");
		
		System.out.println(Bush);
		
	}

}
