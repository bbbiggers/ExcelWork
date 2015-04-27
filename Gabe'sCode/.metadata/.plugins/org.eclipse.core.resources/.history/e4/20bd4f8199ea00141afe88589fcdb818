package FrogClass;

import java.util.ArrayList;

public class BerryBush extends Bush{

private ArrayList<Berry>BerryType;
private String color;

public BerryBush(ArrayList<Berry>bt,String c,int b,int l){
	super(b,l);
	BerryType = bt;
	color = c;
}

public void growBerry(){
int x = (int)(Math.random()*10)+1;
BerryType.add(new Berry(color,x));
	
}

public void growBerry(int t){
int x = (int)(Math.random()*10)+1;
if(t>=1&&t<=10){
BerryType.add(new Berry(color,t));
}else{
BerryType.add(new Berry(color,x));
}
}

public void growBerry(String s){
int x = (int)(Math.random()*10)+1;
BerryType.add(new MagicBerry(s,color,x));
}

public String getColor(){
	return color;
}

public int getNumBerries(){
	return BerryType.size();
}

public void growBigger(){
	super.growBigger();
	growBerry();
}

public String toString(){
	String s = "";
	for (Berry b : BerryType){
		s = s+(b+"\n");
	}
	return s;
}

}
