package core;


public abstract class Player {
	protected long _auth_code;
	
	public Player() {
		//_auth_code = auth_code;
	}
	
	
	public abstract Move getMove(Game g);

}
