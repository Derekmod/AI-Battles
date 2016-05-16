package director;

import java.util.ArrayList;

import core.Game;
import core.Player;

public interface Tournament {

	public ArrayList<Integer> compete(ArrayList<Player> contestants);
}
