package NewYear.src.warmUp;
public class TriNum {

	public static void main(String[] args) {
		System.out.println(Tri(7));
	}
	public static int Tri(int n) {
		if(n == 1) {
			return 1;
		}
		else if(n == 0) {
			return 0;
		}
		else if(n <= 0) {
			return 0;
		}
		else {
			int count = 0;
		for(int i = n; i > 0; i--) {
			count = count+i;
		}
		return count;
		}
	}
}
