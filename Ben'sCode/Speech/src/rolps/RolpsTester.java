package rolps;

import java.util.ArrayList;

public class RolpsTester {

	public static void main(String[] args) {
		ArrayList<String> jerryItems = new ArrayList<String>();
		ArrayList<String> goshtItems = new ArrayList<String>();
		Slime Jerry = new Slime(jerryItems, "Jerry");
		Ghost Hob = new Ghost(goshtItems);
		System.out.println(Hob.Health);
		Jerry.Attack(Hob.Armor);
		System.out.println(Hob.Armor);
		System.out.println(Hob.Health);
		
	}
	
}
