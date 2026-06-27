package exercicio_01_sistema_usuario;

public class Validacao {
	
	public static void validarNome(String nome) {
		if (nome == null || nome.trim().isEmpty())
			throw new IllegalArgumentException("Nome não pode ser vazio!");
	}
	
	public static void validarEmail(String email) {
		if (!email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$"))
			throw new IllegalArgumentException("Digite um e-mail válido!");
	}
	
	public static void validarNivel(String nivel_acesso) {
		if (nivel_acesso == null || nivel_acesso.trim().isEmpty())
			throw new IllegalArgumentException("Nivel de acesso não pode ser vazio!");
	}
	
}
