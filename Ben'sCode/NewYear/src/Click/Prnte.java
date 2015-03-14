package NewYear.src.Click;
public class Prnte {

	public static void main(String[] args) {
		String[] FL = new String[5];
		FL[0] = "1 1 1 1 1";
		FL[1] = "2 2 2 2";https://lms.lwsd.org/images/transparent_pixel.gif?1419034860
		FL[2] = "3 3 3";
		FL[3] = "4 4";
		FL[4] = "5";
		for(int i = 0; i < 5; i++) {
			System.out.println(FL[i]);
		}
		ducks();
	}
	
	
	//PART TWO
	public static void ducks() {
		String[] FL = new String[5];
		FL[0] = "1 1 1 1 1";
		FL[1] = "2 2 2 2";
		FL[2] = "3 3 3";
		FL[3] = "4 4";
		FL[4] = "5";
		for(int i = 0; i < 3; i++) {
			System.out.println(FL[i]);
		}
		for(int i = 3; i < 5; i++) {
			System.out.println(FL[i]);
		}
	}

	
}
