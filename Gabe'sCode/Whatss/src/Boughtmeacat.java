
public class Boughtmeacat {
	
//**************************************************************************************************************
	public static void Line1(){
		System.out.println("Bought me a cat and the cat pleased me, \nI fed my cat under yonder tree.");
		
		cat();
		
	}

	public static void cat(){
		
		System.out.println("Cat goes fiddle-i-fee.\n");
	}
	//**************************************************************************************************************
	public static void Line2(){
		System.out.println("Bought me a hen and the hen pleased me, \nI fed my hen under yonder tree.");
		
		hen();
		
	}

	public static void hen(){
		
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
		cat();
	}
	//***************************************************************************************************************
	public static void Line3(){
		System.out.println("Bought me a duck and the duck pleased me, \nI fed my duck under yonder tree.");
		
		duck();
	}

	public static void duck(){
		
		System.out.println("Duck goes quack, quack,");
		hen();
		
	}
	//***************************************************************************************************************
	public static void Line4(){
		System.out.println("Bought me a goose and the goose pleased me, \nI fed my goose under yonder tree.");
		
		goose();
		
	}

	public static void goose(){
		
		System.out.println("Goose goes hissy, hissy,");
		duck();
	}
//***************************************************************************************************************
	public static void Line5(){
		System.out.println("Bought me a sheep and the sheep pleased me, \nI fed my sheep under yonder tree.");

		sheep();
		
	}

	public static void sheep(){
		
		System.out.println("Sheep goes baa, baa,");
		goose();
	}
//*****************************************************************************************************************
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Line1();
Line2();
Line3();
Line4();
Line5();
	}

}
