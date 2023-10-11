package lp2_atv1.Users;
import lp2_atv1.User;

public class Vendedor extends User {
	
	private String products; // descrição dos tipos de produtos vendidos
	
	public Vendedor(String name, String cpf, String email)
	{
		super(name, cpf, email, "Vendedor da ILovePets");
	}
	
	public void setProducts(String products) {
		this.products = products;
	}
	
	public String getProducts() {
		return products;
	}
	
}