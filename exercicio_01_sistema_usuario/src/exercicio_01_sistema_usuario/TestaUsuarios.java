package exercicio_01_sistema_usuario;

public class TestaUsuarios {

	public static void main(String[] args) {
		
		usuarioValido();
		administradorValido();
		validacaoNomeUsuario();
		validacaoEmailUsuario();
		
	}
	
	static void usuarioValido() {
		System.out.println("\n>>> Caso 1: Usuário válido");
		try {
			Usuario usuario = new Usuario("Carlos", "carlos@empresa.com");
			usuario.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void administradorValido() {
		System.out.println("\n>>> Caso 1: Administrador válido");
		try {
			Administrador administrador = new Administrador("Roberto", "roberto19@empresa.com", "Nivel 2");
			administrador.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
	 }
	}
	
	static void validacaoNomeUsuario() {
		System.out.println("\n>>> Caso 1: Validação do Nome do Usuário");
		try {
			Usuario usuario2 = new Usuario("", "carlos@empresa.com");
			usuario2.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void validacaoEmailUsuario() {
		System.out.println("\n>>> Caso 1: Validação do Email do Usuário");
		try {
			Usuario usuario3 = new Usuario("Jorge", "");
			usuario3.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
}
