package drag;

public class Monster {

	
	private int health;
	private int armor;
	private String name;
	private int level;
	Monster(int h, int a, String n) {
		health = h;
		armor = a;
		name = n;
		level = 1;
	}
	public int getHealth(){
		return health;
	}
	public int getArmor(){
		return armor;
	}
	public String getName(){
		return name;
	}
	
	public String toString(){
		return name+" has "+armor+" armor.\n"+name+" has "+health+" health.";
	}
	
	public void levelUp() {
		health += 10;
		armor += 10;
		level++;
	}
}
