package com.thelastuser.wargames;

/*1. Create the following classes:
a. Card
i. Fields
1. value (contains a value from 2-14 representing cards 2-Ace)
2. name (e.g. Ace of Diamonds, or Two of Hearts)
ii. Methods
1. Getters and Setters
2. describe (prints out information about a card)*/

public class Card {
	int value;
	String name;
	int get(){
		return value;
	}
	void set(int val) {
		value = val;
	}
	void describe() {
		System.out.println(name);
	}
}
