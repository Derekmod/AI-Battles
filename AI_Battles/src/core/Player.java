package core;


/**
 * Class representing a player in any game.
 * Future updates potentially might require
 * an authorization code for some actions.
 * 
 * @author Derek
 *
 */
public abstract class Player {
	protected long _auth_code;
	
	public Player(long auth_code) {
		_auth_code = auth_code;
	}
	
	public Player() {
		//_auth_code = auth_code;
	}
	
	
	public abstract Move getMove(Game g);

}
