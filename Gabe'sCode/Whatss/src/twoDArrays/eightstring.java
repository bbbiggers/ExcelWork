package twoDArrays;

import java.util.ArrayList;

public class eightstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>Words = new ArrayList<String>();
		Words.add("a");
		Words.add("b");
		Words.add("c");
		Words.add("d");
		Words.add("e");
		Words.add("f");
		Words.add("g");
		Words.add("hijklmnopqrstuv");
		Words.add("w");
		System.out.println(Words);
		print8th(Words);
	}
public static void print8th(ArrayList<String>Words){
	if(Words.size() >= 8) {
		String a = Words.get(7);
		String b = a.substring(8,9);
		System.out.print(b);
		
	}
}
}
