package exercicio_01_sistema_usuario;

public class TestaUsuarios {

	// Classe main para testar os métodos
	public static void main(String[] args) {
		
		usuarioValido();
		validacaoNomeUsuario();
		validacaoEmailUsuario();
		
		administradorValido();
		validacaoNomeAdministrador();
		validacaoEmailAdministrador();
		validacaoNivelAdministrador();
		
		
	}
	
	static void usuarioValido() {
		System.out.println("\n>>> Caso 1: Usuário válido");
		try {
			criarUsuario("Carlos", "carlos@empresa.com");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void validacaoNomeUsuario() {
		System.out.println("\n>>> Caso 2: Validação do Nome do Usuário");
		try {
			criarUsuario("", "romario@empresa.com");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void validacaoEmailUsuario() {
		System.out.println("\n>>> Caso 3: Validação do Email do Usuário");
		try {
			criarUsuario("Jorge", "");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void administradorValido() {
		System.out.println("\n>>> Caso 4: Administrador válido");
		try {
			criarAdministrador("Roberto", "roberto19@empresa.com", "Nivel 2");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
	  }
	}
	
	static void validacaoNomeAdministrador() {
		System.out.println("\n>>> Caso 5: Validação do Nome do Administrador");
		try {
			criarAdministrador("", "claudio34@empresa.com", "Nivel 3");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void validacaoEmailAdministrador() {
		System.out.println("\n>>> Caso 6: Validação do Email do Administrador");
		try {
			criarAdministrador("Jorge", "", "Nivel 1");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void validacaoNivelAdministrador() {
		System.out.println("\n>>> Caso 7: Validação do Nivel do Administrador");
		try {
			criarAdministrador("Jorge", "Jorge29@empresa.com", "");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	
	// Método criarAdministrador
	public static void criarAdministrador(String nome, String email, String nivel) {
		
		Administrador administrador = new Administrador(nome, email, nivel);
		
		administrador.visualizar();
		
	}
	
	// Método criarUsuario
	public static void criarUsuario(String nome, String email) {
		
		Usuario usuario = new Usuario(nome, email);
		
		usuario.visualizar();
		
	}
}
