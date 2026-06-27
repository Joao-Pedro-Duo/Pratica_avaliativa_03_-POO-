package exercicio_01_sistema_usuario;

public class Administrador extends Usuario {

	private String nivel_acesso;
	
	public Administrador(String nome, String email, String nivel_acesso) {
		super(nome, email);
		
		Validacao.validarNivel(nivel_acesso);
		
		this.nivel_acesso = nivel_acesso;
	}
	

	public String getNivel_acesso() {
		return nivel_acesso;
	}
	

	public void setNivel_acesso(String nivel_acesso) {
		Validacao.validarNivel(nivel_acesso);
		this.nivel_acesso = nivel_acesso;
	}
	
	
	@Override
	public void visualizar() {
		
		super.visualizar();
		System.out.println("Nivel de acesso: " + this.nivel_acesso);
		
		
	}

}
