package ArrayLists;

import java.util.ArrayList;

public class removeEvens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer>numbers = new ArrayList<Integer>();
	numbers.add(2);
	numbers.add(4);
	numbers.add(6);
	numbers.add(8);
	numbers.add(10);
	numbers.add(12);
	System.out.println(numbers);
	remove(numbers);
	System.out.println(numbers);	
	}

public static void remove(ArrayList<Integer>numbers){
	
for(int i = 0;i<numbers.size();i++){
	if (numbers.get(i)%2 == 0){
		numbers.remove(i);
		i--;
	}
}
}





}
