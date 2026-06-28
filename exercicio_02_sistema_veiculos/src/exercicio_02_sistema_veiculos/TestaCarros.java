package exercicio_02_sistema_veiculos;

public class TestaCarros {

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
			CarroEletrico eletricoCarro = new CarroEletrico("Tesla Model 3", 0, 20);
			eletricoCarro.acelerar(30);
			eletricoCarro.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void aceleracaoInvalida() {
		System.out.println("\n>>> Caso 2: Aceleração Inválida");
		try {
			CarroEletrico eletricoCarro = new CarroEletrico("Tesla Model s", 0, 50);
			eletricoCarro.acelerar(0);
			eletricoCarro.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void bateriaInsuficiente() {
		System.out.println("\n>>> Caso 3: Bateria Insuficiente");
		try {
			CarroEletrico eletricoCarro = new CarroEletrico("Tesla Model s", 0, 5);
			eletricoCarro.acelerar(30);
			eletricoCarro.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void bateriaNegativa() {
		System.out.println("\n>>> Caso 4: Bateria Negativa");
		try {
			CarroEletrico eletricoCarro = new CarroEletrico("Tesla Model s", 0, -10);
			eletricoCarro.acelerar(30);
			eletricoCarro.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	static void bateriaMaiorque100() {
		System.out.println("\n>>> Caso 5: Bateria Maior que 100%");
		try {
			CarroEletrico eletricoCarro = new CarroEletrico("Tesla Model s", 0, 150);
			eletricoCarro.acelerar(10);
			eletricoCarro.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

}
