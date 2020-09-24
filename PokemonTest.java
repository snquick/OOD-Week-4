/* Developer: Stephanie Quick
 * Program: Pokemon Card Collector
 * Course: 
 * */

public class PokemonTest {
	public static void main(String args[]) {
		Deck pokemonDeck = new PokemonDeck();
		Collector collector = new Collector(pokemonDeck);
		
		// Use implicit iteration
		collector.printDeck();
	}
}
