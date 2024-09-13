package com.thelastuser.wargames;

import java.util.ArrayList;
import java.util.List;

/*c. Player
i. Fields
1. hand (List of Card)
2. score (set to 0 in the constructor)
3. name
ii. Methods
1. describe (prints out information about the player and calls the describe
method for each card in the Hand List)
2. flip (removes and returns the top card of the Hand)
3. draw (takes a Deck as an argument and calls the draw method on the deck,
adding the returned Card to the hand field)
4. incrementScore (adds 1 to the Player’s score field)*/

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;	
	Player(){
		score = 0;
	}
	void describe() {
		System.out.println(name + " has " + score + " points.");
		for (Card card: hand) {
			card.describe();
		}
	}
	Card flip() {
		Card cardToReturn = hand.getLast();
		hand.removeLast();
		return cardToReturn;
	}
	void draw(Deck deck) {
		hand.add(deck.draw());
	}
	void incrementScore() {
		this.score = score + 1;
	}
}
