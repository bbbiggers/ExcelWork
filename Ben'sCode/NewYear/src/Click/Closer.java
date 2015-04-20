package Click;

public class Closer {

	public static void main() {
		int j = 2;
		int[] joe = new int[3];
		joe[0] = 3;
		joe[1] = 2;
		joe[2] = 6;
		skit(joe, j);
	}
	public static int skit(int[] j, int e) {
		int h = Integer.MAX_VALUE;
		for(int i = 0; i< j.length; i++) {
			if(j[i] > e) {
				int l = j[i]-e;
				if(l < h) {
					h = l;
				}
			}
			else {
				int l = e-j[i];
				if(l < h) {
					h = l;
				}
			}
		}
		return h;
	}
}
