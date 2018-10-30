package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class deckAssignment {
	static List<String> value;
	static List<String> suite;
	static List<String> deck = new ArrayList<String>();
	static List<String> spadesCards = new ArrayList<String>();
	static List<String> heartsCards = new ArrayList<String>();
	static List<String> clubsCards = new ArrayList<String>();
	static List<String> diamondsCards = new ArrayList<String>();

	public static void main(String[] args) {
		value = Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
		suite = Arrays.asList("Spades", "Hearts", "Clubs", "Diamonds");
		
		createCardDeck();
		printCard(deck);
		System.out.println("*************After Shuffling*********");
		shuffleCards(deck);
		printCard(deck);
		createSuiteSpecificList();
		System.out.println("***********print spades***********");
		printCard(spadesCards);
		System.out.println("***********print heart***********");
		printCard(heartsCards);
		System.out.println("***********print clubs***********");
		printCard(clubsCards);
		System.out.println("***********print diamonds***********");
		printCard(diamondsCards);
		System.out.println("***********Shuffle and print spades***********");
		shuffleCards(spadesCards);
		printCard(spadesCards);
		System.out.println("***********Shuffle and print heart***********");
		shuffleCards(heartsCards);
		printCard(heartsCards);
		System.out.println("***********Shuffle and print clubs***********");
		shuffleCards(clubsCards);
		printCard(clubsCards);
		System.out.println("***********Shuffle and print diamonds***********");
		shuffleCards(diamondsCards);
		printCard(diamondsCards);

	}
	
	public static void createCardDeck() {
		for (String s : suite) {
			for (String v : value) {
				deck.add(s.concat(v));
			}
		}

	}
	
	public static void printCard(List<String> cardList) {
		for(String d: cardList) {
			System.out.println(d);
		}
	}
	
	//shuffle deck of cards
	public static void shuffleCards(List<String> cardList) {
		Collections.shuffle(cardList);
	}
	
	public static void createSuiteSpecificList() {
		for(String d: deck) {
			if(d.contains("Spades")) {
				spadesCards.add(d);	
			}
			else if(d.contains("Hearts")) {
				heartsCards.add(d);	
			}
			else if(d.contains("Clubs")) {
				clubsCards.add(d);	
			}
			else {
				diamondsCards.add(d);	
			}
				
	}

}
}
