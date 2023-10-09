package lp2_atv1;
import java.util.ArrayList;

class Main {
	
	static ArrayList Users = new ArrayList();
	static ArrayList Animals = new ArrayList();
	
	public static void main(String args[])
	{
		
		Users.add(new User("name", "cpf", "mail", User.Role.TRAINER));
		Animals.add(new Animal(Animal.Species.CAT, "name", "owner"));
		
		System.out.println(Users.get(0));
		System.out.println(Animals.get(0));
		
		//Oloco oloco = new Oloco();
		//System.out.println(oloco.r);
	}
	
}