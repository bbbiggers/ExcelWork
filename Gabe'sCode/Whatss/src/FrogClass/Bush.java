package FrogClass;

public class Bush {

private int numBranches;
private int numLeaves;



public Bush(int b,int l){

numBranches = b;
numLeaves = l;
	
}

public int getBranches(){
	return numBranches;
}

public int getLeaves(){
	return numLeaves;
}

public void growBranch(){
	numBranches++;
}

public void growLeaf(){
	numLeaves++;
}

public void growBigger(){
	numBranches++;
	numLeaves++;
}



}