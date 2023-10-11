package lp2_atv1.Users;
import lp2_atv1.User;

public class Prestador extends User {
	
	private String service; // tipo de serviço a ser prestado
	
	public Prestador(String name, String cpf, String email)
	{
		super(name, cpf, email, "Prestador de Serviços");
	}
	
	public void setService(String service) {
		this.service = service;
	}
	
	public String getService() {
		return service;
	}
	
	
}