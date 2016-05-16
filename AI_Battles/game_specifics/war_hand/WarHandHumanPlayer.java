package war_hand;

import java.util.Scanner;

import msc.Card;

/**
 * A simple player to allow humans to play (against AIs or each other)
 * @author Derek
 *
 */
public class WarHandHumanPlayer extends WarHandPlayer {
	private Scanner scan;

	public WarHandHumanPlayer() {
		super();
		scan = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}

	@Override
	public WarHandMove getMove(WarHand g) {
		
		Card[] prev = g.getPrevPlay();
		Card[] hand = g.getHand(this);
		System.out.println("\n\n\n\n");
		if (prev[0] != null) {
			System.out.println("Previous play: [" + prev[0] + ", " + prev[1] + "]");
		}
		System.out.println("Score: [" + g.getScore()[0] + ", " + g.getScore()[1] + "]");
		System.out.println("(Player ID: " + g.getPlayerID(this) + ")");
		System.out.println();
		System.out.println("Pot size: " + g.getPot());
		System.out.println();
		System.out.print("Hand:");
		for (int i=0; i<hand.length; i++) { //(Card c : hand) {
			System.out.println("\t" + (i+1) + ": " + hand[i]);
		}
		int input = Integer.parseInt(scan.nextLine())-1;
		System.out.println(input);
		// TODO Auto-generated method stub
		return new WarHandMove(input);
	}

}
