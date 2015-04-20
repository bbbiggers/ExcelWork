package FrogClass;

import java.util.ArrayList;

public class BerryBush extends Bush{

private ArrayList<Berry>BerryType;


public BerryBush(ArrayList<Berry>bt,int b,int l){
	super(b,l);
	BerryType = bt;
}

public void growBerry(){
	
BerryType.add(new Berry("red",1));
	
}

public int getNumBerries(){
	return BerryType.size();
}

public void growBigger(){
	super.growBigger();
	growBerry();
}


}
