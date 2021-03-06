package core;

import java.util.ArrayList;

import msc.Pair;


/**
 * Holds full detail of what happened in a game.
 * 
 * Useful for training AIs, but not available during
 * competition.
 * 
 * @author Derek
 *
 */
public abstract class Record {
	public Player _winner = null;
	
	protected ArrayList<Pair<Integer, Move>> _moveList; 
	

	
	
	public Record() {
		_winner = null;
	}

	
}
