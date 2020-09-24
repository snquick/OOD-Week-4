public class PokemonCard {
		String name;
		String description;
		boolean availability;
		double price;
	 
		public PokemonCard(String name, 
		                String description,
		                boolean availability, 
		                double price) 
		{
			this.name = name;
			this.description = description;
			this.availability = availability;
			this.price = price;
		}
	  
		public String getName() {
			return name;
		}
		
		public String getDescription() {
			return description;
		}
	  
		public double getPrice() {
			return price;
		}
	  
		public boolean isAvailable() {
			return availability;
		}
	}
