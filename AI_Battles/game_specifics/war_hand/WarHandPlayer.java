package war_hand;

import core.Game;
import core.Move;
import core.Player;

public abstract class WarHandPlayer extends Player {

	@Override
	public Move getMove(Game g) {
		return getMove((WarHand) g);
	}
	
	public abstract WarHandMove getMove(WarHand g);

}
