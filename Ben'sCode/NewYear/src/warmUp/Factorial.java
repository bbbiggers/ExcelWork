package warmUp;

public class Factorial {
	public static void main(String[] args) {
		
		int K = factorial(5);
		System.out.println(K);
	}
	public static int factorial(int N) {
		int o = 1;
		for(int i = 1; i <= N; i++) {
			o = o*i;
		}
	return o;
	}
}
