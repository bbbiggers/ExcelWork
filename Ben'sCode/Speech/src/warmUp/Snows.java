package warmUp;

import java.util.ArrayList;
import java.util.Scanner;

public class Snows {
	public static void main(String[] args) {
Scanner Imput = new Scanner(System.in);

//ArrayList<int> goop = new ArrayList<int>();
ArrayList<String> gloop = new ArrayList<String>();
String Item = "w";

while(!Item.equals("")) {
	System.out.println("What groceries?");
	Item = Imput.nextLine();
	
	if(!gloop.contains(Item)) {
		gloop.add(Item);
	}
	
}
int pos = 0;
	while(gloop.contains("Milk")) {
		pos = gloop.indexOf("Milk");
		gloop.set(pos, "Chocolate Milk");
	}

gloop.remove("good");
System.out.println("You have "+gloop+" in your list.");
	}
}
