package lp2_atv1.Animais;
import lp2_atv1.Animal;

public class Coelho extends Animal
{
    public Coelho(String species, String name, String owner)
    {
        super(species, name, owner);
    }

    @Override
	public String toString()
    {
		return "Coelho [Espécie: " + species + ", Nome: " + name + ", Nome do Dono: " + owner + "]";
	}
}