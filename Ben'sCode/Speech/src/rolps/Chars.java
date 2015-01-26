package rolps;
import java.util.ArrayList;
public class Chars {

	public int Health;
	public int TotalHealth;
	public int Armor;
	private int attackDamage;
	private boolean alive;
	private ArrayList<String> Items;
	public String name;

	public Chars(int StHealth, ArrayList<String> Itemst, int Attack, String n) {
		Health = StHealth;
		TotalHealth = StHealth;
		Armor = 0;
		Items = Itemst;
		attackDamage = Attack;
		alive = true;
		name = n;
	}
	//Casualt Armor AKA thing being attacked
	public int Attack(int CasualtAr) {
		if(CasualtAr == 0) {
			return attackDamage;
		}
		else if(CasualtAr >= 1) {
			attackDamage = attackDamage-(CasualtAr/2); 
			if(attackDamage <= 0) {
				System.out.println("Attack Blocked!");
				 return 0;
			 }
			 else {
				 return attackDamage;
			 }
		}
		else {
			return 0;
		}
	}
	public String Heal() {
		if(Health == 0) {
			alive = false;
			return "DEAD";
		}
		else {
		if(Health >= TotalHealth) {
			return "Full Health";
		}
		else {
			Health+=5;
			if(Health > TotalHealth) {
				Health = TotalHealth;
			}
			return "Healing";
		}}}
	
	public int getHealth() {
		return Health;
	}
	
	public void increaseArmor(int amount) {
		if(Armor < 0) {
			Armor = Armor;
		}
		else {
			Armor = Armor+amount;

		}
	}
	
}







