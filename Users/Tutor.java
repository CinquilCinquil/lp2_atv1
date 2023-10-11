package lp2_atv1.Users;
import lp2_atv1.*;
import java.util.ArrayList;

public class Tutor extends User {
	
	private ArrayList<Animal> animalsInCare; // animais que estão na resposabilidade do tutor
	
	public Tutor(String name, String cpf, String email)
	{
		super(name, cpf, email, "Tutor de Animal de Estimação");
		animalsInCare = new ArrayList<Animal>();
	}
	
	public void printAnimalsInCare() {
		for (Animal a : animalsInCare)
		{
			System.out.println(a);
		}
	}
	
	public void addAnimalInCare(Animal a) {
		animalsInCare.add(a);
	}
	
	public void removeAnimalInCare(Animal a) {
		animalsInCare.remove(a);
	}
	
}