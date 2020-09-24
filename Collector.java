import java.util.List;

public class Collector {
	Deck pokeDeck;
	
	public Collector(Deck pokeDeck) {
		this.pokeDeck = pokeDeck;
	}

	public void printDeck() {		
		List<PokemonCard> rareDeck = ((PokemonDeck) pokeDeck).getPokemonCards();
		for (PokemonCard r: rareDeck) {
			printPokemonCard(r);
		}
	}
	
	public void printPokemonCard(PokemonCard pokemonCard) {
		System.out.print(pokemonCard.getName() + ", ");
		System.out.print(pokemonCard.getDescription() + " -- $");
		System.out.println(String.format("%.2f",pokemonCard.getPrice()));
		} 
	}
