package lp2_atv1.Animais;
import lp2_atv1.Animal;

public class Gato extends Animal
{
    public Gato(String species, String name, String owner)
    {
        super(species, name, owner);
    }

    @Override
	public String toString()
    {
		return "Gato [Espécie: " + species + ", Nome: " + name + ", Nome do Dono: " + owner + "]";
	}
}