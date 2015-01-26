package Warmups;

public class Archer {

private int arrows;

public Archer (){
	
arrows = 500;	
}
public Archer(int a){
		arrows = a;
}
public void shootArrow(){
	arrows--;
}
public void refillArrows(int amount){
	arrows+=amount;
}
public String toString(){
	return(arrows+" arrows");
}

}
