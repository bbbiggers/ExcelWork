package FrogClass;

public class MagicBerry extends Berry {
private String magicProperty;
	

public MagicBerry(String s,String c,int t){
	super(c,t);
	magicProperty = s;
}
public String toString(){
return ("The "+this.getColor()+" berry is a "+this.getTastiness()+" on tastiness scale and has the Magic Property: "+magicProperty+".");
}

}