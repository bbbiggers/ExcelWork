package warmUp;

public class Squas {
	public static void main(String[] args) {
		int k = squas(34);
		System.out.println(k);
	}
	public static int squas(int k) {
		String j = ""+k;
		if(j.length() == 2) {
			int l = Integer.getInteger(j.substring(0,1));
			int z = Integer.getInteger(j.substring(1));
			return ((l*l)+(z*z));
		}
		else if(j.length() == 1) {
			return ((int)Math.sqrt(k));
		}
		else {
			return 0;
		}
	}
}