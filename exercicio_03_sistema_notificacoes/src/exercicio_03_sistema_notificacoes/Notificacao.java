package exercicio_03_sistema_notificacoes;

public class Notificacao {
	
	private String destinatario;
	
	
	// Método Construtor com validação
	public Notificacao(String destinatario) {
		
		Validacao.validarDestinatarioVazio(destinatario);
		
		this.destinatario = destinatario;
	}

	

	public String getDestinatario() {
		return destinatario;
	}


	// Método set com validação
	public void setDestinatario(String destinatario) {
		Validacao.validarDestinatarioVazio(destinatario);
		
		this.destinatario = destinatario;
	}

	
	// Método enviar com validação
	public void enviar(String mensagem) {
		
		Validacao.validarMensagem(mensagem);
		
		System.out.printf("Mensagem: %s", mensagem);
		
	}
	

}
