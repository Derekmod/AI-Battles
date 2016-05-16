package director;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import core.Game;
import core.Player;
import core.Record;
import sub_sample.AntiGreedyPlayer;
import sub_sample.GreedyPlayer;
import sub_sample.SamplePlayer;
import war_hand.WarHand;
import war_hand.WarHandHumanPlayer;
import war_hand.WarHandPlayer;
import war_hand.WarHandRecord;
import msc.Card;
import msc.Deck;

public class Main {
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		WarHandPlayer p1 = new SamplePlayer();
		WarHandPlayer p2 = new GreedyPlayer();
		WarHandPlayer[] players = {p1, p2};
		ArrayList<WarHandPlayer> p = new ArrayList<WarHandPlayer>();
		p.add(p1);
		p.add(p2);
		WarHand g;
		
		int wins1 = 0;
		int wins2 = 0;
		int total = 0;
		
		Class<? extends Game> gameType = WarHand.class;
		
		for (int round=0; round < 100000; round++) {
			//g = new WarHand(players);
			g = (WarHand) gameType.getConstructor(ArrayList.class).newInstance(p);
			WarHandRecord result = g.compete();
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
