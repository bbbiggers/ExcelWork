package NewYear.src.Click;

public class E136 {
public static void main(String[] args) {
	boolean i = find("Happy", "appy");
	if(i) {System.out.println("YES");}
	else {System.out.println("NO");}
}
public static boolean find(String text, String str) {
	if(text.contains(str)) {return true;}
	return find(text.substring(1), str);
}
}
