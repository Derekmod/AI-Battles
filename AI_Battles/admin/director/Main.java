package director;

import core.Player;
import core.Summary;
import sub_sample.AntiGreedyPlayer;
import sub_sample.GreedyPlayer;
import sub_sample.SamplePlayer;
import war_hand.WarHand;
import war_hand.WarHandHumanPlayer;
import war_hand.WarHandPlayer;
import msc.Card;
import msc.Deck;

public class Main {
	
	
	public static void main(String[] args) {
		WarHandPlayer p1 = new GreedyPlayer();
		WarHandPlayer p2 = new WarHandHumanPlayer();
		WarHandPlayer[] players = {p1, p2};
		WarHand g;
		
		int wins1 = 0;
		int wins2 = 0;
		int total = 0;
		
		for (int round=0; round < 100000; round++) {
			g = new WarHand(players);
			Summary result = g.compete();
			if (result._winner == p1) {
				wins1 ++;
			} else if (result._winner == p2) {
				wins2 ++;
			}
			
			total ++;
		}
		
		System.out.println("p1 winrate: " + (double)wins1/(double)total);
		System.out.println("p2 winrate: " + (double)wins2/(double)total);
		System.out.println(wins1);
		System.out.println(wins2);
		System.out.println(total);
	}

}
