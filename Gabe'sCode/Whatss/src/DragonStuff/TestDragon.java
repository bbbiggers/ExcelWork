package DragonStuff;

import java.util.ArrayList;

public class TestDragon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dragon>Words = new ArrayList<Dragon>();
		
		//Dragon.add();
		
		
		
	Dragon myDragon=new Dragon(300,"fart",6.2,"Billy");	
	Dragon myDragon2=new Dragon(300,"fart",6.2,"Billy");	
	System.out.println(myDragon);
	
	myDragon.grow(6.3);
	
	System.out.println(myDragon);
	if(myDragon.matches(myDragon2)){
		System.out.println("They match");
		
	}
	
	}

}
