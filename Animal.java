package lp2_atv1;

class Animal {
	
	private String species, name, owner;
	
	Animal(String species, String name, String owner)
	{
		setName(name);
		setOwner(owner);
		setSpecies(species);
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getSpecies() {
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
		return "ANIMAL [Espécie: " + species + ", Nome: " + name + ", Nome do Dono: " + owner + "]";
	}
	
}