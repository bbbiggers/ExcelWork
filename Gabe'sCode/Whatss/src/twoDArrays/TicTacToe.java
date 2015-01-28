package twoDArrays;

public class TicTacToe {

	private	String[][] myArray = new String[3][3];

	public TicTacToe(String[][] myArray){
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				myArray[i][j] = "-"; 
			}}
	}

	public String toString(){
		String a = "";
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				a = myArray[i][j]; 
			}
			a+="/n";
			}
		return a;
	}
	public void addX(int a,int b){
		//.equals
		myArray[a][b] = "X"; 
	}
	public void addO(int a,int b){
		myArray[a][b] = "O"; 
	}
}
