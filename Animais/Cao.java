package lp2_atv1.Animais;
import lp2_atv1.Animal;

public class Cao extends Animal
{
    public Cao(String species, String name, String owner)
    {
        super(species, name, owner);
    }

    @Override
	public String toString()
    {
		return "Cao [Espécie: " + species + ", Nome: " + name + ", Nome do Dono: " + owner + "]";
	}
}