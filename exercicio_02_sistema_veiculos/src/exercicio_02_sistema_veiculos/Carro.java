package exercicio_02_sistema_veiculos;

public class Carro {
	
	private String modelo;
	private int velocidade;
	
	// Método Construtor 
	public Carro(String modelo, int velocidade) {
		
		this.modelo = modelo;
		this.velocidade = velocidade;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	// Método acelerar 
	public void acelerar(int valor) {
		
		int velocidadeAtual = getVelocidade();
		
		int novaVelocidade = velocidadeAtual + valor;
		
		setVelocidade(novaVelocidade);
		
	}
	
	// Método visualizar
	public void visualizar() {
		
		System.out.printf("Modelo do Carro: %s%n", this.modelo);
		System.out.printf("Velocidade atual: %d km/h%n", this.velocidade);
		
	}
	
}
