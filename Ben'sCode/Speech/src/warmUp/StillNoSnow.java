package warmUp;
import java.util.ArrayList;
public class StillNoSnow {

	public static void main(String[] args) {
		ArrayList<String> WordList = new ArrayList<String>();
		
		WordList.add("to");
		WordList.add("be");
		WordList.add("or");
		WordList.add("not");
		WordList.add("to");
		WordList.add("be");
		System.out.println(WordList);
		for(int i = 1; i < WordList.size(); i+=2) {
			WordList.add(i, "~");
		}
		System.out.println(WordList);
		while(WordList.contains("~")) {
			WordList.remove("~");
		}
		System.out.println(WordList);
	}
}