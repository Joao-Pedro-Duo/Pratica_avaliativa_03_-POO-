package exercicio_02_sistema_veiculos;

public class CarroEletrico extends Carro {
	
	private static final int CONSUMO_POR_ACELERACAO = 2;
	
	private int nivelBateria;

	// Método Construtor (super) com validação
	public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
		super(modelo, velocidade);
		
		Validacao.validarNivelBateria(nivelBateria);
		
		this.nivelBateria = nivelBateria;	
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		Validacao.validarNivelBateria(nivelBateria);
		
		this.nivelBateria = nivelBateria;
	}
	
	// Método consumo de Bateria
	public int consumoBateria(int valor) {
		
		int consumo = (valor / CONSUMO_POR_ACELERACAO);
		return consumo;
		
	}
	
	// Método acelerar (sobrescrito) com validação
	@Override
	public void acelerar(int valor) {
		
		Validacao.validarAceleracao(valor);
		
		int consumo = consumoBateria(valor);
		
		int nivelBateriaAtual = getNivelBateria();
		
		Validacao.validarNivelInsuficienteBateria(nivelBateriaAtual, 
				consumo);
		
		int novoNivelBateria = nivelBateriaAtual - consumo;
		
		setNivelBateria(novoNivelBateria);
		
		super.acelerar(valor);
		
	}
	
	// Método visualizar (sobrescrito)
	@Override
	public void visualizar() {
		
		super.visualizar();
		System.out.println("Bateria restante: " + this.nivelBateria + "%");
		
	}

}
