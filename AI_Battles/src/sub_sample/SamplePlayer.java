package sub_sample;

import war_hand.WarHand;
import war_hand.WarHandMove;
import war_hand.WarHandPlayer;

/**
 * Example Player.
 * To make your own player, create a package and class identical to this,
 * and replace all counts of "sample" with your name (and fill in methods
 * with useful calculations).
 * @author Sample
 *
 */
public class SamplePlayer extends WarHandPlayer {

	public SamplePlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public WarHandMove getMove(WarHand g) {
		// do calculations here
		return new WarHandMove(0);
	}

}
