package lp2_atv1.Users;
import lp2_atv1.User;

class Vendedor extends User {
	
	private String service; // tipo de serviço a ser prestado
	
	Vendedor(String name, String cpf, String email)
	{
		super(name, cpf, email, "Vendedor da ILovePets");
	}
	
}