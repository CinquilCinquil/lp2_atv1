package lp2_atv1.Animais;
import lp2_atv1.Animal;

class Rato extends Animal
{
    public Rato(String species, String name, String owner)
    {
        super(species, name, owner);
    }

    @Override
	public String toString()
    {
		return "Rato [Espécie: " + species + ", Nome: " + name + ", Nome do Dono: " + owner + "]";
	}
}