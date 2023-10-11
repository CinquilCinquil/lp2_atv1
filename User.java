package lp2_atv1;

public class User {
	
	private String name, cpf, email, specialty, role;
	
	public User(String name, String cpf, String email, String role)
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
	
	public void setRole(String role) {
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
	
	public String getRole() {
		return role;
	}
	
	@Override
	public String toString()
	{
		return "USUÁRIO [Nome: " + name + ", Cpf: " + cpf + ", Email: " + email 
		+ ", Cargo: " + role + ", Especialidade: " + specialty + "]";
	}
	
}