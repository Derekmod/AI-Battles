package msc;

public class Card {
	public static final String[] SUIT_NAMES = {"Spades", "Hearts", "Diamonds", "Clubs"};
	
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
