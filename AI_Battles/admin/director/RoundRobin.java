package director;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import core.Game;
import core.Player;

public class RoundRobin implements Tournament {
	private Class<? extends Game> _game_class;
	private int _rounds;
	
	public RoundRobin(Class<? extends Game> cls, int rounds) {
		_game_class = cls;
		_rounds = rounds;
	}


	@Override
	public ArrayList<Integer> compete(ArrayList<Player> contestants) {
		int numPlayers = contestants.size();
		
		for (int series=0; series<_rounds; series++) {
			for (int p1=0; p1<numPlayers; p1++) {
				for (int p2=0; p2<numPlayers; p2++) {
					if (p1==p2)
						continue;
					
					
					Player[] players = {contestants.get(p1), contestants.get(p2)};
					try {
						Class<Player[]> arg1 = Player[].class;
						Game board = (Game) _game_class.getConstructor(arg1).newInstance(players);
					} catch (InstantiationException | IllegalAccessException
							| IllegalArgumentException
							| InvocationTargetException | NoSuchMethodException
							| SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}

	
	

}
