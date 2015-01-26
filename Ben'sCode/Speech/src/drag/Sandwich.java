package drag;

import java.util.ArrayList;

public class Sandwich {

	private ArrayList<String> Materials = new ArrayList<String>();
	public Sandwich() {
		Materials.add("Bread");
		Materials.add("Bread");
	}
	public void add(String Item) {
		Materials.add(Materials.size()-1, Item);
	}
	public String toString() {
		String ToSay = "";
		for(int i = Materials.size()-1; i >= 0; i--) {
			ToSay = ToSay+" "+Materials.get(i);
		}
		return ToSay;
	}
	public void eat() {
		Materials.clear();
	}
}
