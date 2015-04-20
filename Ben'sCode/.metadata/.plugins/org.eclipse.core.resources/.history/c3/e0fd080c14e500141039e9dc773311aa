package warmUp;

import java.util.ArrayList;

public class ArrayM {
private int[] List;
	public ArrayM(int[] List) {
		List = this.List;
	}
	public ArrayList<Integer> getEven() {
		ArrayList<Integer> K = new ArrayList<Integer>();
		for(int i = 0; i < List.length; i++) {
			K.add(List[i]);
		}
			for(int i = 0; i < K.size(); i++) {
				if((K.get(i) % 2) != 0) {
					K.remove(i);
					//i--;
				}
			}
		return K;
	}
	
	public ArrayList<Integer> getUpper(int n) {
		ArrayList<Integer> Y = new ArrayList<Integer>();
		for(int i = 0; i < List.length; i++) {
			Y.add(List[i]);
		}
			for(int i = 0; i < Y.size(); i++) {
				if((Y.get(i) % 2) != 0) {
					Y.remove(i);
				}
			}
		return Y;
	}
	
	public int sumUpper(int n) {
		int s = 0;
		ArrayList<Integer> Up = getUpper(n);
		for(int k : Up) {
			s = s+k;
		}
		return s;
	}
	public int maxEven() {
		int m = 0;
		ArrayList<Integer> Ev = getEven();
		for(int k : Ev) {
			if(m < k) {
				m = k;
			}
		}
		return m;
	}
	
}
