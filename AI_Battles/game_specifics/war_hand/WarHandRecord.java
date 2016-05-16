package war_hand;

import java.util.ArrayList;

import core.Record;
import msc.Card;

public class WarHandRecord extends Record {
	
	public class WarHandPlayerState {
		public ArrayList<Card> _hand;
		
		public WarHandPlayerState() {
			_hand = new ArrayList<Card>();
		}
	}
	
	public ArrayList<ArrayList<Card>> _moves;
	public ArrayList<ArrayList<WarHandPlayerState>> _player_states;
	
	public WarHandRecord() {
		super();
		_moves = new ArrayList<ArrayList<Card>>();
		_player_states = new ArrayList<ArrayList<WarHandPlayerState>>();
	}

}
