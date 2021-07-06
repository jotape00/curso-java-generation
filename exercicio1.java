package br.com.generation.atividade04;
import java.util.Scanner;
public class exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double pontos[] = new double[5];
		double maiorNumero = 0.0;
		int l;
		
		System.out.println("Escreva as 5 notas: ");
		for(l = 0; l < pontos.length; l++) {
			pontos[l] = scan.nextDouble();		
			if(pontos[l] > maiorNumero) {
				maiorNumero = pontos[l];
			}
		}
		System.out.print("[ ");
		for(l = 0; l < pontos.length; l++) {
			System.out.print(pontos[l] + " ");
		}
		System.out.println("]");
		System.out.print("A maior nota foi: " + maiorNumero);
	}
}
