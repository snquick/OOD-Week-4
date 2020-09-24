// iterator class
import java.util.Iterator;
  
public class PokemonDeckIterator implements Iterator<PokemonCard> {
	PokemonCard[] list;
	int position = 0;
 
	public PokemonDeckIterator(PokemonCard[] list) {
		this.list = list;
	}
	
	public PokemonCard next() {
		PokemonCard pokemonCard = list[position];
		position = position + 1;
		return pokemonCard;
	}
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
 
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You cannot remove.");
		}
		
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}

}