package exercicio_03_sistema_notificacoes;

public class TestaNotificacoes {

	// Classe main para testar o método criarNotificação
	public static void main(String[] args) {
		
		try {
			criarNotificacao("SMS", "11988887777", "Seu código é 1234");
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}

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
