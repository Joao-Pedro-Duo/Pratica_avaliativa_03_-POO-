package exercicio_03_sistema_notificacoes;

public class NotificacaoEmail extends Notificacao {
	
	// Método Construtor (super) com validação
	public NotificacaoEmail(String destinatario) {
		super(destinatario);
		
		Validacao.validarDestinatarioEmail(destinatario);
		
	}

	
	// Método enviar (sobrescrito) com validação
	@Override
	public void enviar(String mensagem) {
		
		Validacao.validarMensagem(mensagem);
		
		System.out.printf("Enviando E-mail para %s%n", getDestinatario());
		super.enviar(mensagem);
		
	}

}
