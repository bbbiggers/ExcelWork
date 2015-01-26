package FrogClass;

public class SlimeMonster extends Monster {
	
private String slimeType;
	
public SlimeMonster(String n, String s){
	super(50,50,n);
	slimeType = s;
}
public SlimeMonster split(){
	return SlimeMonster newSlime = new SlimeMonster ("Fred", slimeType);
	health++;
}
}
