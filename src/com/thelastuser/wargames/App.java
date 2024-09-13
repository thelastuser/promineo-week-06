package com.thelastuser.wargames;

public class App {
	
	//WAR -- What is it good for? Absolutely nothing.

	public static void main(String[] args) {
		Deck d = new Deck();
		Player p1 = new Player();
		p1.name = "Player 1";
		Player p2 = new Player();
		p2.name = "Player 2";
		d.shuffle();
		for (int i = 1; i <= 52; i++) {
			if (i % 2 == 0) {
				p2.draw(d);
			}
			else {
				p1.draw(d);
			}
		}
		for (int i = 1; i <= 26; i++) {
			Card p1Play = p1.flip();
			Card p2Play = p2.flip();
			System.out.println(p1.name + " plays the " + p1Play.name);
			System.out.println(p2.name + " plays the " + p2Play.name);
			if (p1Play.value > p2Play.value) {
				p1.incrementScore();
				System.out.println(p1.name + " wins!");
			}
			else if (p2Play.value > p1Play.value) {
				p2.incrementScore();
				System.out.println(p2.name + " wins!");
			}
			else {
				System.out.println("It's a draw!");
			}
		}
		System.out.println(p1.name + " scores " + p1.score + " & " + p2.name + " scores " + p2.score);
		if (p1.score > p2.score) {
			System.out.println(p1.name + " wins the game!");
		}
		else if (p2.score > p1.score) {
			System.out.println(p2.name + " wins the game!");
		}
		else {
			System.out.println("The game's a draw!");
		}
	}

		// TODO Auto-generated method stub
		/*2. Create a class called App with a main method.
		a) Instantiate a Deck and two Players, call the shuffle method on the deck.
		b) Using a traditional for loop, iterate 52 times calling the Draw method on the other player each
		iteration using the Deck you instantiated.
		c) Using a traditional for loop, iterate 26 times and call the flip method for each player.
		d) Compare the value of each card returned by the two player’s flip methods. Call the
		incrementScore method on the player whose card has the higher value.
		e) After the loop, compare the final score from each player.
		f) Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on
		which score is higher or if they are both the same.*/
	}

	/* 3. Tips: Printing out information throughout the game adds value including easier debugging as you
	progress and a better user experience.
	a) Using the Card describe() method when each card is flipped illustrates the game play.
	b) Printing the winner of each turn adds interest.
	c) Printing the updated score after each turn shows game progression.
	d) At the end of the game: print the final score of each player and the winner’s name or “Draw” if
	the result is a tie.
	 * */
