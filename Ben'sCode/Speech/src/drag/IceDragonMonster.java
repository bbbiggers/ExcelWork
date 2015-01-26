package drag;

public class IceDragonMonster extends Monster{
	private String IceColor;
	private int health;
	private int armor = 10;
	
	public IceDragonMonster(int h, String name) {
			super(h, 10, name);
health = h;
	}
	
	public void powerUp(int amount) {
		health+=amount;
		armor+=amount;
	}
	
	public boolean shoot() {
		boolean P;
		//Decides if the shot was accurate enough to hit the target
		int Rand = (int)(Math.random())*10;
		if(Rand == 2 || Rand == 8) {
			P = false;
		}
		else {
			P = true;
		}
		
		return P;
	}
	
	
	
	
	
}
