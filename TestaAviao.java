package br.com.generation.aula05.atividade05;

public class TestaAviao {
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		
		aviao1.setTipo("Boeing");
		aviao1.setTipoCombustivel("Querosene de aviação");
		aviao1.setClasse("Executivo");
		aviao1.setComportacao(150);
		aviao1.setVelocidadeDecolagem(900);
		aviao1.setVelocidadeMaxima(252);
		
		aviao1.decolagem();
		
		System.out.println("\nO tipo do avião é: " + aviao1.getTipo());
		System.out.println("O tipo de combustível é: " + aviao1.getTipoCombustivel());
		System.out.println("A classe do avião: " + aviao1.getClasse());
		System.out.println("O avião comporta: " + aviao1.getComportacao() + " pessoas");
		System.out.println("\nA velocidade máxima que um avião pode atingir é de: " + aviao1.getVelocidadeDecolagem() + "km/h");
		System.out.println("A velocidade de decolagem média de um avião é de: " + aviao1.getVelocidadeMaxima() + "km/h");
	}
}
