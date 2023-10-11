package lp2_atv1;
import java.util.ArrayList;
import lp2_atv1.Users.*;

public class Main {
	
	static ArrayList<User> Users = new ArrayList<User>();
	static ArrayList<Animal> Animals = new ArrayList<Animal>();
	
	public static void main(String args[])
	{
		Users.add(new User("joao", "123", "@mail", "Trainer"));
		Animals.add(new Animal("Cat", "coolcat", "joao"));
		
		Tutor t = new Tutor("joao", "123", "@mail");
		t.addAnimalInCare(Animals.get(0));
		t.printAnimalsInCare();
		
		System.out.println(Users.get(0));
		System.out.println(Animals.get(0));
	}
	
}