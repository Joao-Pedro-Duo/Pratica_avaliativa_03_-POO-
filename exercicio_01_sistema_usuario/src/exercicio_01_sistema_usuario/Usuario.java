package exercicio_01_sistema_usuario;

public class Usuario {
	
	private String nome;
	private String email;
	
	// Método Construtor com validação
	public Usuario(String nome, String email) {
		
		Validacao.validarNome(nome);
		Validacao.validarEmail(email);
		
		this.nome = nome;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		Validacao.validarNome(nome);
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		Validacao.validarEmail(email);
		this.email = email;
	}
	
	// Método visualizar 
	public void visualizar() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		
	}
	
	
	
	
	
	
}
