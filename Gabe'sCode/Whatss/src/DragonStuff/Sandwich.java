package DragonStuff;

import java.util.List;
import java.util.ArrayList;


public class Sandwich {
	private ArrayList<String>Sand;
	
	
	
	public Sandwich(){
		Sand = new ArrayList<String>();
		Sand.add("Bread");
		Sand.add("Bread");
	}
	
	public void add(String pop){
		
		Sand.add(Sand.size()-1,pop);
		
		
	}
	public void eat(){
		
		Sand.clear();
	}
	
	
	
	
	public String toString() {
	return Sand.toString();
		
	}
	
	
}
