package warmUp;

public class ReplaceBS {

	public static void main(String[] args){
		String LO = "aabbaabsdeg";
		System.out.println(LO);
		LO = BullSheep(LO);
		System.out.println(LO);
	}
	public static String BullSheep(String k) {
		if(!k.contains("b")) {
			return k;
		} else {
			int l = k.indexOf("b");
			String t = k.substring(0, l);
			String p = k.substring(l+1);
			k = t+"s"+p;
		}
		return BullSheep(k);
	}
}