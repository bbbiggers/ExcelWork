package drag;

public class SlimeMonster extends Monster{
	private String SlimeType;
	public SlimeMonster(String n, String s) {
		super(50, 10, n);
		SlimeType = s;
	}
	
	public SlimeMonster split() {
		SlimeMonster Jeff = new SlimeMonster("Jeff", SlimeType);
		return Jeff;	
	}


}
