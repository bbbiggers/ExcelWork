package FrogClass;

public class Frog {
	
private String color;
private int flies_caught;
	
public Frog(String c){

color=c;
flies_caught=0;
	
}
	
public int getFlies(){
return flies_caught;
	
}
public void catchFly (int flies){
		if (flies < 0){
			System.out.println("ERROR: MUST BE GREATER THAN ZERO");
			return;
		}else{
			flies_caught+=flies;	
		}
}

public String toString(){
	
return	"The "+color+" frog has "+flies_caught+" flies.";
	
}


}