import java.util.ArrayList;
import java.util.Iterator;

// similar to dinermenu
public class PokemonDeck implements Deck {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	ArrayList<PokemonCard> pokeCardsAR;
  
	public PokemonDeck() {
		pokeCardsAR = new ArrayList<PokemonCard>();
		
		// I did my research, all these prices are legit.. 
		//  https://www.beckett.com/news/1999-pokemon-1st-edition-charizard-holo-sells-50000/
		addItem("Charizard Holographic #4", "1999 1st Edition Shadowless Holographic Card / Mint Condition", true, 20000);
		addItem("Pikachu Trainer Trophy Card", "Prize Card - These were only given to the winners of the Pokemon World Championships", true, 10500);
		addItem("Mewtwo Shadowless Holo", "1999 Pokemon Base Card BGS 9/ Mint Condition", false, 899);
		addItem("Shadowless Machamp", "PSA 9 1st Edition Base Halo / Mint Condition", false, 500);
		addItem("Vaporeon Gold Star", "Holo EX Power Keepers / Pristine Condition", false, 780);
		// https://www.ebay.com/itm/Pokemon-NEO-DESTINY-SHINING-STEELIX-Holo-PSA-10-Unlimited/283978346379?hash=item421e6daf8b:g:LScAAOSww-VfNfUu
		addItem("Neo Destiny Steelis", "Shining Holo PSA 10 Unlimited / Mint Condition", false, 725);

	}
  
	public void addItem (String name, String description, boolean availability, double price) {
		PokemonCard pokemonCard = new PokemonCard(name, description, availability, price);
		pokeCardsAR.add(pokemonCard);
	}
	
	public ArrayList<PokemonCard> getPokemonCards() {
		return pokeCardsAR;
	}
  
	public Iterator<PokemonCard> createIterator() {
		return pokeCardsAR.iterator();
	}
 }