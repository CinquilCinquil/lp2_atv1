package lp2_atv1;

class Animal {
	
	enum Species {
		
		DOG,
		CAT,
		BUNNY,
		RAT,
		;
		
		@Override
		public String toString() {
			
			switch(this.ordinal())
			{
				case 0:
					return "Dog";
				case 1:
					return "Cat";
				case 2:
					return "Bunny";
				case 3:
					return "Rat";
				default:
					return null;
			}
			
		}
		
	}
	
	private Species species;
	private String name, owner;
	
	Animal(Species species, String name, String owner)
	{
		setName(name);
		setOwner(owner);
		setSpecies(species);
	}
	
	public void setSpecies(Species species) {
		this.species = species;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public Species getSpecies() {
		return species;
	}
	
	public String getName() {
		return name;
	}
	
	public String getOwner() {
		return owner;
	}
	
	@Override
	public String toString() {
		return "ANIMAL [Species: " + species.toString() + ", Name: " + name + ", Owner's name: " + owner + "]";
	}
	
}