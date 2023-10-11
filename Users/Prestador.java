package lp2_atv1.Users;
import lp2_atv1.User;

class Prestador extends User {
	
	private String service; // tipo de serviço a ser prestado
	
	Prestador(String name, String cpf, String email)
	{
		super(name, cpf, email, "Prestador de Serviços");
	}
	
}