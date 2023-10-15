package lp2_atv1;
import java.util.ArrayList;
import lp2_atv1.Users.*;
import lp2_atv1.Animais.*;

public class Main {
	
	static ArrayList<User> Users = new ArrayList<User>();
	static ArrayList<Animal> Animals = new ArrayList<Animal>();
	
	public static void main(String args[])
	{
		Users.add(new Vendedor("Giovanna", "000000000.00", "Giovanna@mail"));
		Users.add(new Prestador("Fernanda", "987654321.01", "Fernanda@mail"));
		Animals.add(new Gato("Siamês", "coolcat", "João"));
		Animals.add(new Rato("Rattus rattus", "coolrat", "Maria"));
		Animals.add(new Cao("Shih Tzu", "cooldog", "José"));
		Animals.add(new Coelho("Coelho-Pigmeu", "coolbunny", "Pedro"));
		
		System.out.println(Animals.get(3).toString());
		System.out.println("---");
		
		Tutor t = new Tutor("Gabriel", "123456789.10", "Gabriel@mail");
		Users.add(t);
		
		for (int i = 0;i < 3;i ++)
		{
			t.addAnimalInCare(Animals.get(i));
		}
		t.printAnimalsInCare();
	}
	
}