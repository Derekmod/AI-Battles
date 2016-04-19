package war_hand;

import msc.Card;
import java.util.Comparator;

public class CardComparator implements Comparator<Card>{
	
	public CardComparator() {
		
	}

	@Override
	public int compare(Card c1, Card c2) {
		int v1 = c1.getDots();
		int v2 = c2.getDots();
		
		/*if (v1 == 1) {
			v1 = 14;
		}
		if (v2 == 1) {
			v2 = 14;
		}*/
		
		return v1-v2;
	}
	
	
	
	

}
