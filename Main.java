package lp2_atv1;
import java.util.ArrayList;

class Main {
	
	static ArrayList Users = new ArrayList();
	static ArrayList Animals = new ArrayList();
	
	public static void main(String args[])
	{
		
		Users.add(new User("joao", "123", "@mail", "Trainer"));
		Animals.add(new Animal("Cat", "coolcat", "joao"));
		
		System.out.println(Users.get(0));
		System.out.println(Animals.get(0));
	}
	
}