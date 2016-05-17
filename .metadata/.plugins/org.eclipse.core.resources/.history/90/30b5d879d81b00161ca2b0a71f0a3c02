package msc;

public class Card {
	public static final String[] SUIT_NAMES = {"Spades", "Hearts", "Diamonds", "Clubs"};
	// _dots value of 1 specifies an ACE, 13 is a KING
	
	private int _suit;
	private int _dots;
	
	public Card(int suit, int dots) {
		_suit = suit;
		_dots = dots;
	}
	
	public int getSuit() {return _suit;}
	public int getDots() {return _dots;}
	public String getSuitName() {return SUIT_NAMES[_suit];}
	
	
	@Override
	public String toString() {
		return "" + _dots + " of " + getSuitName();
	}
	
}
