package warmUp;

public class Switero {

	public static void main(String[] args) {
		Switch("Hey");
	}
	public static void Switch(String Start) {
		int StLeng = Start.length();
		String Printable = "";
		if(StLeng == 0) {
			return;
		}
		Printable = Printable+Start.substring(StLeng-1, StLeng);
		Start = Start.substring(0, StLeng-1);
		Switch(Start);
		System.out.print(Printable);
	}
}
