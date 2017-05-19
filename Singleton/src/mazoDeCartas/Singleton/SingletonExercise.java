package mazoDeCartas.Singleton;

public class SingletonExercise {
	public static void main(String args[]) {
		Deck dec = Deck.getDeck();
		dec.print();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Deck dec2 = Deck.getDeck();
		dec2.print();
	}
}
