package warmUp;

public class Sfsdf {

	public static void main(String[] args) {
		System.out.println(fun(10));
	}
	public static int fun(int num) {
		if(num > 100) return num / 2;
		
		num *= 3;
		return num + fun(fun(num+10));
	}
}

