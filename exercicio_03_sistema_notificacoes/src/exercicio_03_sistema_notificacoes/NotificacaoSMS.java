package exercicio_03_sistema_notificacoes;

public class NotificacaoSMS extends Notificacao {

	// Método Construtor (super) com validação
	public NotificacaoSMS(String destinatario) {
		super(destinatario);
		
		Validacao.validarDestinatarioSMS(destinatario);
		
	}
	
	// Método Enviar (sobrescrito) com validação
	@Override
	public void enviar(String mensagem) {
		
		Validacao.validarMensagem(mensagem);
		
		String numeroAnterior = getDestinatario();
		
		String DDD = numeroAnterior.substring(0, 2);
		
		String primeiraparte = numeroAnterior.substring(2, 7);
		
		String segundaparte = numeroAnterior.substring(7, 11);
		
		System.out.printf("Enviando SMS para (%s) %s-%s%n", DDD, primeiraparte, segundaparte);
		super.enviar(mensagem);
		
	}

}
