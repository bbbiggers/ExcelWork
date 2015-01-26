package ArrayLists;

import java.util.ArrayList;

public class arrayWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>Words = new ArrayList<String>();
		Words.add("to");
		Words.add("be");
		Words.add("or");
		Words.add("not");
		Words.add("to");
		Words.add("be");
		System.out.println(Words);
		
		for(int i = 1;i<Words.size();i+=2){
			
		Words.add(i,"~");	
			
		}
	
		System.out.println(Words);
	
	
	
	}

}
