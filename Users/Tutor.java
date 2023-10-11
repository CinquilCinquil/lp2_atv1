package lp2_atv1.Users;
import lp2_atv1.*;
import java.util.ArrayList;

class Tutor extends User {
	
	private ArrayList<Animal> animalsInCare; // animais que estão na resposabilidade do tutor
	
	Tutor(String name, String cpf, String email)
	{
		super(name, cpf, email, "Tutor de Animal de Estimação");
	}
	
}