package warmUp;

import java.util.ArrayList;

public class Interest {

	public static void main(String[] args) {
		ArrayList<Integer> K = new ArrayList<Integer>();
		K.add(3);
		K.add(5);
		K.add(4);
		K.add(6);
		K.add(-2);
		K.add(2);
		K.add(8);
		K.add(-1);
		K.add(1232);
		System.out.println(K);
		horse(K);
		System.out.println(K);
	}
	
	public static void horse(ArrayList<Integer> K) {
		for(int i = 0; i < K.size(); i++) {
			if(K.get(i) < 0) {
				K.remove(i);
			}
			if((K.get(i) % 2) == 0) {
				int temp = K.get(i);
				K.remove(i);
				K.add(0, temp);
			}
		}
	}
}
