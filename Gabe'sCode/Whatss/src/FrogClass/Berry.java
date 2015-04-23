package FrogClass;

public class Berry {

	private String color;
	private int tastiness;
	
public Berry(String c,int t){
	
	color = c;
	tastiness = t;
	
}
  
public String toString(){
return ("The "+color+" berry is a "+tastiness+" on tastiness scale.");
}


public String getColor(){
	return color;
}

public int getTastiness(){
	return tastiness;
}


}
