package exercicio_03_sistema_notificacoes;

public class Validacao {
	
	// Classe de Validações
	
	public static void validarDestinatarioVazio(String destinatario) {
		
		if (destinatario == null || destinatario.trim().isEmpty())
			throw new IllegalArgumentException("Destinatário não pode ser vazio!");
	}
	
	public static void validarDestinatarioEmail(String destinatario) {
		
		if (!destinatario.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$"))
			throw new IllegalArgumentException("Digite um e-mail válido!");
	}
	
	public static void validarDestinatarioSMS(String destinatario) {
		
		if (!destinatario.matches("^\\(?\\d{2}\\)?\\s?\\d{4,5}-?\\d{4}$"))
			throw new IllegalArgumentException("Digite um número de telefone válido!");
	}
	
	public static void validarMensagem(String mensagem) {
		if (mensagem == null || mensagem.trim().isEmpty())
			throw new IllegalArgumentException("Mensagem não pode ser vazio!");
	}

}
