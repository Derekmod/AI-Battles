package core;

import java.util.ArrayList;
import java.util.Random;


/**
 * Abstract class for all Games.
 * To create a new game for AI-Battles, extend this class at the
 * very least.
 * 
 * Must completely hide Players from each other.
 * 
 * @author Derek
 *
 */
public abstract class Game {
	public static final String EXTRA_GAMENAME_WARHAND = "WarHand";
	
	protected Player[] _players;
	protected int _numPlayers;
	protected long[] _auth_codes;
	protected String _gamename;
	
	protected int _round;

	
	
	public Game(Player[] players) {
		init(players);
	}
	

	public Game(ArrayList<Player> players) {
		Player[] p = {players.get(0), players.get(1)};
		init(p);
	}
	
	private void init(Player[] players) {
		_numPlayers = players.length;
		
		_players = new Player[_numPlayers];
		_auth_codes = new long[_numPlayers];
		Random rand_auth = new Random();
		
		for (int p=0; p<_numPlayers; p++) {
			_players[p] = players[p];
			_auth_codes[p] = rand_auth.nextLong();
		}
		
		_gamename = "";
		
		
		_round = 0;
	}


	public abstract Record compete();
	
	protected void endRound() {
		this._round++;
	}
	
	
	//non-proprietary access methods

	public int getRound() { //returns 0 during first round
		return this._round;
	}


	
	// proprietary access methods
	
	public int getPlayerID(Player p) {
		for (int i=0; i<_numPlayers; i++) {
			if (_players[i] == p) {
				return i;
			}
		}
		
		return -1;
	}

}
