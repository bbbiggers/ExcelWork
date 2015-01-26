package DragonStuff;

public class Dragon {

private int treasure;
private int scales;
private String breathWeapon;
private int level;
private double mass_kg;
private String name;

//constructor
public Dragon(int s,String b,double m,String n){
	treasure=0;
	scales=s;
	breathWeapon=b;
	level=1;
	mass_kg=m;
	name=n;
	}

public double getMass(){

return mass_kg;
	
}

public int getLevel(){
	
return level;	

}

public String toString(){
	
return	name+" the level "+level+" dragon weighs "+mass_kg+" kg.";
	
}

public void grow(double kg){
if(kg <0){
System.out.println("ERROR: MUST BE GREATER THAN ZERO");
return;
}

mass_kg+=kg;

}
 public boolean matches(Dragon other){
	 
	return true;
 }


}
