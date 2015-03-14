package NewYear.src.warmUp;

public class YX {
public static void main() {
	System.out.println("yysjdjken");
	
	System.out.println(Replacers("yysjdjken"));
}

public static String Replacers(String k) {
	if(!k.contains("y")) {
		return k;
	}
	else if(k.contains("y")) {
		k.replace("y", "x");
		Replacers(k);
	}
	else {
		return k;
	}
}
}
