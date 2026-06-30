package exercicio_02_sistema_veiculos;

public class TestaCarros {

	// Classe main para testar os métodos 
	public static void main(String[] args) {
		
		carroEletricovalido();
		aceleracaoInvalida();
		bateriaInsuficiente();
		bateriaNegativa();
		bateriaMaiorque100();
		
	}
	
	static void carroEletricovalido() {
		System.out.println("\n>>> Caso 1: Carro Elétrico válido");
		try {
			criarCarroEletrico("Tesla model 3", 0, 20, 30);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void aceleracaoInvalida() {
		System.out.println("\n>>> Caso 2: Aceleração Inválida");
		try {
			criarCarroEletrico("BYD Dolphin", 0, 50, 0);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void bateriaInsuficiente() {
		System.out.println("\n>>> Caso 3: Bateria Insuficiente");
		try {
			criarCarroEletrico("Tesla Model S", 0, 0, 30);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void bateriaNegativa() {
		System.out.println("\n>>> Caso 4: Bateria Negativa");
		try {
			criarCarroEletrico("BYD Song", 0, -10, 30);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void bateriaMaiorque100() {
		System.out.println("\n>>> Caso 5: Bateria Maior que 100%");
		try {
			criarCarroEletrico("Tesla Model X", 0, 150, 30);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	// Método criarCarroEletrico
	public static void criarCarroEletrico(String modelo, int velocidade, int bateria, int aceleracao) {
		
		CarroEletrico carroeletrico = new CarroEletrico(modelo, velocidade, bateria);
	
		carroeletrico.acelerar(aceleracao);
		
		carroeletrico.visualizar();
		
	}

}
