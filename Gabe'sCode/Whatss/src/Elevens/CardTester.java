package Elevens;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	Card Card1 = new Card("King","Hearts",7);
	Card Card2 = new Card("Queen","Clubs",5);
	Card Card3 = new Card("Seven","Diamonds",7);
	
	Card1.suit();
	Card2.rank();
	Card3.pointValue();
	Card1.matches(Card2);
	
	
	
	
	
	
	
	
	
	
	}
}
