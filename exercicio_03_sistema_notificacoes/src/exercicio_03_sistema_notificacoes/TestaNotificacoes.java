package exercicio_03_sistema_notificacoes;

public class TestaNotificacoes {

	// Classe main para testar o método criarNotificação
	public static void main(String[] args) {
		
		emailValido();
		smsValido();
		mensagemVazia();
		destinatarioVazio();
		tipoInexistente();
	}
	
	static void emailValido() {
		try {
			System.out.println("\n>>> Caso 1: Email válido");
			criarNotificacao("Email", "ana@email.com", "Bem-vindo ao sistema");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		System.out.println("");
	}
	
	static void smsValido() {
		try {
			System.out.println("\n>>> Caso 2: SMS válido");
			criarNotificacao("SMS", "11988887777", "Seu código é 1234");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		System.out.println("");
	}
	
	static void mensagemVazia() {
		try {
			System.out.println("\n>>> Caso 3: Mensagem vazia");
			criarNotificacao("SMS", "11988887777", "");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		System.out.println("");
	}
	
	static void destinatarioVazio() {
		try {
			System.out.println("\n>>> Caso 4: Destinatário vazio");
			criarNotificacao("Email", "", "Bem-vindo ao sistema");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		System.out.println("");
	}
	
	static void tipoInexistente() {
		try {
			System.out.println("\n>>> Caso 5: Tipo inexistente");
			criarNotificacao("", "11988887777", "Seu código é 1234");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
		System.out.println("");
	}
	
	// Método criarNotificação
	public static void criarNotificacao(String tipo, String destinatario, String mensagem) {
		
		Notificacao notificacao;
		
		if (tipo.equalsIgnoreCase("Email")) 
			
			notificacao = new NotificacaoEmail(destinatario);
			
		else if (tipo.equalsIgnoreCase("SMS") ) 
			
			notificacao = new NotificacaoSMS(destinatario);
			
		else 
			throw new IllegalArgumentException("Tipo de notificação inexistente!");
		
		
		notificacao.enviar(mensagem);
		
	}
	
	

}
