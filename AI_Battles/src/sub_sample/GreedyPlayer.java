package sub_sample;

import war_hand.WarHand;
import war_hand.WarHandMove;
import war_hand.WarHandPlayer;
import msc.Card;

public class GreedyPlayer extends WarHandPlayer {

	@Override
	public WarHandMove getMove(WarHand g) {
		Card[] hand = g.getHand(this);
		int best = 0;
		for (int i=1; i<hand.length; i++) {
			if (hand[i].getDots() > hand[best].getDots()) {
				best = i;
			}
		}
		// TODO Auto-generated method stub
		return new WarHandMove(best);
	}

}
