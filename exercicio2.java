package br.com.generation.atividade04;
//import java.util.Arrays;
import java.util.Scanner;
public class exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lancamentos[] = new int[10], maiorOcorrencia = 0;
		double soma = 0.0, media = 0.0, maiorPontuacao = 0.0;
		int i;
		
		System.out.println("Escreva o valor dos 10 primeiros lançamentos de um dado de N faces: ");
		for(i = 0; i < lancamentos.length; i++) {
			System.out.print((i+1) + "º: ");
			lancamentos[i] = scan.nextInt(); 
			soma += lancamentos[i];
			if(lancamentos[i] > maiorPontuacao) { 
				maiorPontuacao = lancamentos[i]; 
				maiorOcorrencia = 0;
			}
			if(lancamentos[i] == maiorPontuacao) {
				maiorOcorrencia++;
			}
		}
		
		System.out.print("O vetor gerado é: [");
		for(i = 0; i < lancamentos.length; i++) {
			if(i != lancamentos.length - 1) {
				System.out.print(lancamentos[i] + ", ");
			}		
			else {
				System.out.print(lancamentos[i] + "]");
			}
		}
		/*System.out.println("O vetor gerado é: " + Arrays.toString(lancamentos));
		  --> o objeto Array acima resume o que foi feito na função for da linha 26 */
		
		media = soma/lancamentos.length;
		System.out.println("\nA média aritmética dos lançamentos é de: " + media);
		System.out.println("A frequência que o maior número dado apareceu nos lançamentos é de: " + maiorOcorrencia);
	}
}
