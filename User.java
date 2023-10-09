package lp2_atv1;

class User {
	
	enum Role {
		
		TRAINER,	// Tutor de animal de estimação
		HELPER,		// Prestador de serviços para pets
		SELLER, 	// vendedor da ILovePets
		;
		
		@Override
		public String toString() {
			
			switch(this.ordinal())
			{
				case 0:
					return "Trainer";
				case 1:
					return "Helper";
				case 2:
					return "Seller";
				default:
					return null;
			}
			
		}
		
	}
	
	private String name, cpf, email, specialty;
	private Role role;
	
	User(String name, String cpf, String email, Role role)
	{
		setName(name);
		setCpf(cpf);
		setEmail(email);
		setRole(role);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public Role getRole() {
		return role;
	}
	
	@Override
	public String toString()
	{
		return "USER [Name: " + name + ", Cpf: " + cpf + ", Email: " + email 
		+ ", Role: " + role.toString() + ", Specialty: " + specialty + "]";
	}
	
}