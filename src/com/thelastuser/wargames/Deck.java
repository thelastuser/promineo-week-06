package com.thelastuser.wargames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*b. Deck
i. Fields
1. cards (List of Card)
ii. Methods
1. shuffle (randomizes the order of the cards)
2. draw (removes and returns the top card of the Cards field)
3. In the constructor, when a new Deck is instantiated, the Cards field should be
populated with the standard 52 cards.*/

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	String[] suites = {"Spades", "Diamonds", "Clubs", "Hearts"};
	Deck(){
		for (String suite: suites) {
			for (int v = 2; v <= 14; v++) {
				Card card = new Card();
				card.set(v);
				switch(v) {
					case 2: card.name = "Two of " + suite; break;
					case 3: card.name = "Three of " + suite; break;
					case 4: card.name = "Four of " + suite; break;
					case 5: card.name = "Five of " + suite; break;
					case 6: card.name = "Six of " + suite; break;
					case 7: card.name = "Seven of " + suite; break;
					case 8: card.name = "Eight of " + suite; break;
					case 9: card.name = "Nine of " + suite; break;
					case 10: card.name = "Ten of " + suite; break;
					case 11: card.name = "Jack of " + suite; break;
					case 12: card.name = "Queen of " + suite; break;
					case 13: card.name = "King of " + suite; break;
					case 14: card.name = "Ace of " + suite; break;
				}
			this.cards.add(card);
			}
		}
	}
	void shuffle(){
		Collections.shuffle(this.cards);
	}
	Card draw() {
		Card cardToReturn = cards.getLast();
		cards.removeLast();
		return cardToReturn;
	}
}
