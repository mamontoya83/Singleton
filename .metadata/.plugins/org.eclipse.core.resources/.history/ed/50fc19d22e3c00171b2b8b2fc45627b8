package mazoDeCartas.Singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import mazoDeCartas.Singleton.Card.Suit;

class Deck {
	public static Deck deck;
	private List<Card> cards;
	
	//FACTORY METHOD
	
	private Deck( ) {
		System.out.println("------------------------ENTRO AL CONSTRUCTOR------------------------");
		cards = new ArrayList<Card>( );
		// build the deck
		Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS};
		for(Suit suit: suits) {
			for(int i = 2; i <= 14; i++) {
				cards.add(new Card(suit, i));
			}
		}
//		// shuffle it!
		Collections.shuffle(cards, new Random( ));
	}

	public static Deck getDeck(){
		if(deck == null){
			deck = new Deck();
		}
		
		return deck;
	}
	
	public void print( ) {
		for(Card card: cards) {
			card.print( );
		}
	}
}

