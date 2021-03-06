package msc;

import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a deck of cards.
 * 
 * allows for biased shuffling, currently not symmetric.
 * @author Derek
 *
 */
public class Deck {
	protected ArrayList<Card> _cards;
	
	
	public Deck(boolean empty) {
		init();
		
		if (!empty) {
			for (int suit=0; suit < 4; suit++) {
				for (int dots=1; dots <= 13; dots++) {
					_cards.add(new Card(suit, dots));
				}
			}
		}
	}
	
	
	private void init() {
		_cards = new ArrayList<Card>();
	}
	
	
	public Card draw() {
		return _cards.remove(0);
	}
	public ArrayList<Card> draw(int num_cards) {
		ArrayList<Card> ans = new ArrayList<Card>();
		
		for (int i=0; i<num_cards; i++) {
			ans.add(_cards.remove(0));
		}
		
		return ans;
	}
	
	public void addBottom(Card card) {
		// TODO Auto-generated method stub
		_cards.add(card);
	}
	
	
	
	public static Deck sortedDeck() {
		Deck ret = new Deck(true);
		for (int suit=0; suit < 4; suit++) {
			for (int dots=1; dots<=13; dots++) {
				ret._cards.add(new Card(suit, dots));
			}
		}
		
		return ret;
	}
	
	public Deck shuffle(double s, double e, Random rand) {
		ArrayList<Card> newCards = new ArrayList<Card>();
		
		for (Card c : this._cards) {
			int len = newCards.size();
			int min = (int)Math.floor((double)len * s);
			int max = (int)Math.ceil((double)len * e - 0.0001);
			
			int idx = min + rand.nextInt(max-min+1);
			//System.out.println("" + min + "" + max + "" + idx);
			
			newCards.add(idx, c);
		}
		
		this._cards = newCards;
		
		return this;
	}
	public Deck shuffle(double s, double e) {
		return shuffle(s, e, new Random());
	}
	public Deck shuffle() {
		return shuffle(0, 1, new Random());
	}


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return _cards.size() == 0;
	}



}
