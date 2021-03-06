package war_hand;

import core.Game;
import core.Move;
import core.Player;

public abstract class WarHandPlayer extends Player {

	@Override
	public Move getMove(Game g) {
		return getMove((WarHand) g);
	}
	
	/**
	 * Get the move choice from Player
	 * @param g Game being played
	 * @return Move the player wants to make
	 */
	public abstract WarHandMove getMove(WarHand g);

}
