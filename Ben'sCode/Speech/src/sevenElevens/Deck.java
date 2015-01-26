package sevenElevens;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;
	private Card[] Sparecards;
	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;
	private int deal = cards.size();
	
	
	
	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		ArrayList<Card> DeckList = new ArrayList<Card>();
		for(int i = 0; i < ranks.length; i++) {
			DeckList.add(new Card(ranks[i], suits[i], values[i]));
			cards.add(new Card(ranks[i], suits[i], values[i]));
			Sparecards[i] = (new Card(ranks[i], suits[i], values[i]));
		}
		
		size = DeckList.size();
		deal = deal-1;
	}
	public boolean isEmpty() {
		if(size == 0) {
		return true;
		}
		else {
		return false;
		}		
	}

	/*
	  Accesses the number of undealt cards in this deck.
	  @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}
	/*
	 Randomly permute the given collection of cards
	 and reset the size to represent the entire deck.
	 */
	public void shuffle() {
        // Put all the used cards back into the deck, and shuffle it into
        // a random order.
		
      for ( int i = 51; i > 0; i-- ) {
          int rand = (int)(Math.random()*(i+1));
          Card temp = Sparecards[i];
          Sparecards[i] = Sparecards[rand];
          Sparecards[rand] = temp;
      }
      int cardsUsed = 0;
  }
	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		size = size-1;
		deal = deal-1;
		return cards.get(deal+1);
	}
	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}

