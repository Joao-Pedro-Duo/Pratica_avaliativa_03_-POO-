package exercicio_02_sistema_veiculos;

public class Validacao {
	
	// Classe de Validações
	
	public static void validarAceleracao(int valor) {
		if (valor <= 0 )
			throw new IllegalArgumentException("A aceleração só pode ser um número inteiro positivo "
					+ "e maior que zero!");
	}
	
	public static void validarNivelBateria(int nivelBateria) {
		if (nivelBateria < 0 || nivelBateria > 100)
			throw new IllegalArgumentException("O nivel da bateria só pode ser um número inteiro positivo "
					+ "e maior ou igual a zero, mas não pode ser maior que 100!");
	}
	
	public static void validarNivelInsuficienteBateria(int nivelBateria, int consumo) {
		if (consumo > nivelBateria)
			throw new IllegalArgumentException("O nivel da bateria é menor do que o consumo!");
	}

}
